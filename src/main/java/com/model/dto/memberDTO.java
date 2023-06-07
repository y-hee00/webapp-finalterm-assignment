package com.model.dto;

import java.io.Serializable;
import java.util.Date;

public class memberDTO implements Serializable {
    private String memberCode;
    private String memberName;
    private String birthDate;
    private String gender;
    private String detailInfo;
    private String phone;
    private String teamCode;
    private String activeStatus;

    public memberDTO() {
    }

    public memberDTO(String memberCode, String memberName, String birthDate, String gender, String detailInfo, String phone, String teamCode, String activeStatus) {
        super();
        this.memberCode = memberCode;
        this.memberName = memberName;
        this.birthDate = birthDate;
        this.gender = gender;
        this.detailInfo = detailInfo;
        this.phone = phone;
        this.teamCode = teamCode;
        this.activeStatus = activeStatus;
    }

    public String getMemberCode() {
        return memberCode;
    }

    public void setMemberCode(String memberCode) {
        this.memberCode = memberCode;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        this.birthDate = birthDate;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getDetailInfo() {
        return detailInfo;
    }

    public void setDetailInfo(String detailInfo) {
        this.detailInfo = detailInfo;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getTeamCode() {
        return teamCode;
    }

    public void setTeamCode(String teamCode) {
        this.teamCode = teamCode;
    }

    public String getActiveStatus() {
        return activeStatus;
    }

    public void setActiveStatus(String activeStatus) {
        this.activeStatus = activeStatus;
    }

    @Override
    public String toString() {
        return "memberDTO{" +
                "memberCode='" + memberCode + '\'' +
                ", memberName='" + memberName + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", gender='" + gender + '\'' +
                ", detailInfo='" + detailInfo + '\'' +
                ", phone='" + phone + '\'' +
                ", teamCode='" + teamCode + '\'' +
                ", activeStatus='" + activeStatus + '\'' +
                '}';
    }
}
