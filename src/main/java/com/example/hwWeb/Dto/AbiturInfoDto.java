package com.example.hwWeb.Dto;

public class AbiturInfoDto {
    private Long id;
    private String name;
    private String fatherName;
    private String motherName;

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    private String birthDate;
    private String sex;
    private String addrs;
    private Boolean haveMother;
    private Boolean haveFather;
    private String fatherBirthDate;

    public String getFatherBirthDate() {
        return fatherBirthDate;
    }

    public void setFatherBirthDate(String fatherBirthDate) {
        this.fatherBirthDate = fatherBirthDate;
    }

    public String getMotherBirthDate() {
        return motherBirthDate;
    }

    public void setMotherBirthDate(String motherBirthDate) {
        this.motherBirthDate = motherBirthDate;
    }

    private String motherBirthDate;

    public Boolean getHaveMother() {
        return haveMother;
    }

    public void setHaveMother(Boolean haveMother) {
        this.haveMother = haveMother;
    }

    public Boolean getHaveFather() {
        return haveFather;
    }

    public void setHaveFather(Boolean haveFather) {
        this.haveFather = haveFather;
    }

    public String getMotherWork() {
        return motherWork;
    }

    public void setMotherWork(String motherWork) {
        this.motherWork = motherWork;
    }

    private String motherWork;

    public String getFatherWork() {
        return fatherWork;
    }

    public void setFatherWork(String fatherWork) {
        this.fatherWork = fatherWork;
    }

    private String fatherWork;

    public AbiturInfoDto() {
    }



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFatherName() {
        return fatherName;
    }

    public void setFatherName(String fatherName) {
        this.fatherName = fatherName;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }


    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }


    public String getAboutMe() {
        return aboutMe;
    }

    public void setAboutMe(String aboutMe) {
        this.aboutMe = aboutMe;
    }

    private String aboutMe;
    public String getAddrs() {
        return addrs;
    }

    public void setAddrs(String addrs) {
        this.addrs = addrs;
    }


}
