/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cvbuilder.model;

import java.io.Serializable;

/**
 *
 * @author User A
 */


public class CVBean implements Serializable {
    
    private static final long serialVersionUID = 1L;
    
    //Personal info
    private String fullName;
    private String professionalTitle;
    private String email;
    private String phoneNum;
    private String linkURL;
    private String profileSummary;
    
    //Education
    private String highestDegree;
    private String institutionName;
    private String graduateYear;
    private String major_field;
    
    //Experience
    private String recentJobTitle;
    private String companyName;
    private String duration;
    private String keyRespAchieve;
    
    //Skill
    private String technicalSkill;
    private String softSkill;
    
    //Default constructor
    public CVBean(){}
    
    //getter and setter
    public String getFullName() { return fullName;}
    public void setFullName(String fn){fullName = fn;}
    
    public String getProfessionalTitle(){return professionalTitle ;}
    public void setProfessionalTitle(String pT){professionalTitle = pT;}
    
    public String getEmail() {return email;}
    public void setEmail(String em) {email = em;}
    
    public String getPhoneNum() {return phoneNum;}
    public void setPhoneNum(String pN) {phoneNum = pN;}
    
    public String getLinkURL() {return linkURL;}
    public void setLinkURL(String linkURL) {this.linkURL = linkURL;}
    
    public String getProfileSummary() {return profileSummary;}
    public String setProfileSummary(String profileSum){profileSummary = profileSum;return null;}
    
    public String getHighestDegree() {return highestDegree;}
    public void setHighestDegree(String highDeg) {highestDegree = highDeg;}
    
    public String getInstitutionName() {return institutionName;}
    public void setInstitutionName(String instituName) {institutionName = instituName;}
    
    public String getGraduateYear() {return graduateYear;}
    public void setGraduateYear(String graduateYear) {this.graduateYear = graduateYear;}
    
    public String getMajor_field() {return major_field;}
    public void setMajor_field(String m_f) {major_field = m_f;}
    
    public String getRecentJobTitle() {return recentJobTitle;}
    public void setRecentJobTitle(String jobTitle) {recentJobTitle = jobTitle;}
    
    public String getCompanyName() {return companyName;}
    public void setCompanyName(String cn) {companyName = cn;}
    
    public String getDuration() {return duration;}
    public void setDuration(String duration) {this.duration = duration;} 
    
    public String getKeyRespAchieve() {return keyRespAchieve;}
    public void setKeyRespAchieve(String keyRA) {keyRespAchieve = keyRA;}
    
    public String getTechnicalSkill() {return technicalSkill;}
    public void setTechincalSkill(String techSkill) {technicalSkill = techSkill;}
    
    public String getSoftSkill() {return softSkill;}
    public void setSoftSkill(String softSkill) {this.softSkill = softSkill;}
    
    //Validation method to ensure mandatory fields are not empty
    public boolean validation(){
        if (fullName == null || fullName.trim().isEmpty()) 
            return false;
        if (email == null || email.trim().isEmpty() || !email.contains("@"))
            return false;
        if (highestDegree == null || highestDegree.trim().isEmpty())
            return false;
        if ((technicalSkill == null || technicalSkill.trim().isEmpty()) && (softSkill == null || softSkill.trim().isEmpty())){
            return false;
        }
        return true;
    }
    
}
