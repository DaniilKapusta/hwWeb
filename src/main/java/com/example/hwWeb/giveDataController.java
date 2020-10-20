package com.example.hwWeb;

import com.example.hwWeb.Dto.AbiturInfoDto;
import com.example.hwWeb.Entity.AbiturientEntity;
import com.example.hwWeb.Repository.AbiturParentRepository;
import com.example.hwWeb.Repository.AbiturientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class giveDataController {
    @Autowired
    private AbiturParentRepository abiturParentRepository;
    @Autowired
    private AbiturientRepository abiturientRepository;
    @ResponseBody
    @GetMapping("/GiveData")
    public List<AbiturInfoDto> giveData() {
        List<AbiturInfoDto> abiturInfoDtos = new ArrayList<>();
        abiturientRepository.findAll().forEach(ae -> {
            AbiturInfoDto abiturInfoDto = new AbiturInfoDto();
            abiturInfoDto.setId(ae.getId());
            abiturInfoDto.setAddrs(ae.getAddrs());
            abiturInfoDto.setAboutMe(ae.getAboutMe());
            abiturInfoDto.setBirthDate(ae.getBirthDate());
            abiturInfoDto.setName(ae.getName());
            abiturInfoDto.setSex(ae.getSex());
            abiturParentRepository.findByAbiturIdLike(ae.getId()).forEach(ape -> {
                if (ape.getParent().equals("Father")) {
                    abiturInfoDto.setFatherName(ape.getName());
                    abiturInfoDto.setFatherBirthDate(ape.getBirthDate());
                    abiturInfoDto.setFatherWork(ape.getWork());
                }
                else {
                    abiturInfoDto.setMotherName(ape.getName());
                    abiturInfoDto.setMotherBirthDate(ape.getBirthDate());
                    abiturInfoDto.setMotherWork(ape.getWork());
                }
            });
            abiturInfoDtos.add(abiturInfoDto);
        });

        return abiturInfoDtos;
    }

}
