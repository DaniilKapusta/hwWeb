package com.example.hwWeb.Controller;

import com.example.hwWeb.Dto.AbiturInfoDto;
import com.example.hwWeb.Entity.AbiturientEntity;
import com.example.hwWeb.Entity.ParentEntity;
import com.example.hwWeb.Repository.AbiturParentRepository;
import com.example.hwWeb.Repository.AbiturientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
@Controller
public class IndexController {
    @Autowired
    private AbiturientRepository abiturientRepository;
    @Autowired
    private AbiturParentRepository abiturParentRepository;
@GetMapping(value = "/")
    public String index() {
    return "index.html";
}
@PostMapping(value = "/send")
    public String formSend(AbiturInfoDto dto, HttpServletRequest req, ModelMap model) {
AbiturientEntity abiturientEntity = new AbiturientEntity();
abiturientEntity.setName(dto.getName());
abiturientEntity.setBirthDate(dto.getBirthDate());
abiturientEntity.setAddrs(dto.getAddrs());
abiturientEntity.setAboutMe(dto.getAboutMe());
abiturientEntity.setSex(dto.getSex());



if (dto.getHaveFather() || dto.getHaveMother()) {
    abiturientEntity.setHaveParents(true);
}
dto.setId(abiturientRepository.save(abiturientEntity).getId());
if (dto.getHaveMother()) {
    ParentEntity parentEntity = new ParentEntity();
    parentEntity.setParent("Mother");
    parentEntity.setAbiturId(dto.getId());
    parentEntity.setName(dto.getMotherName());
    parentEntity.setWork(dto.getMotherWork());
    parentEntity.setBirthDate(dto.getMotherBirthDate());
    abiturParentRepository.save(parentEntity);
}
    if (dto.getHaveFather()) {
        ParentEntity parentEntity = new ParentEntity();
        parentEntity.setParent("Father");
        parentEntity.setAbiturId(dto.getId());
        parentEntity.setName(dto.getFatherName());
        parentEntity.setWork(dto.getFatherWork());
        parentEntity.setBirthDate(dto.getFatherBirthDate());
        abiturParentRepository.save(parentEntity);
    }

return "redirect:/";
}
}
