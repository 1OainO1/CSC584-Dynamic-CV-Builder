/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.cvbuilder.controller;

import com.cvbuilder.model.CVBean;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @author User A
 */

public class CVServlet extends HttpServlet {
    private final static long serialVersionUID = 1L;
    
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        String action = req.getParameter("action");
        
        if ("sample".equalsIgnoreCase(action)){
            
            CVBean sampleBean = new CVBean ();
            
            //Personal info [doGet]
            sampleBean.setFullName("Ahmad Kamal");
            sampleBean.setProfessionalTitle("Software Engineer");
            sampleBean.setEmail("ahmad_Kamal001@gmail.com");
            sampleBean.setPhoneNum("01192837465");
            sampleBean.setLinkURL("https://linkedin.com/in/ahmadkamal");
            sampleBean.setProfileSummary("Passionate Java developer with experience in building scalable web applications using Java EE and MVC pattern.");
            
            //Education [doGet]
            sampleBean.setHighestDegree("Bachelor of Computer Science");
            sampleBean.setInstitutionName("UiTM Kampus Kuala Terengganu");
            sampleBean.setGraduateYear("2025");
            sampleBean.setMajor_field("Computer Science");
            
            //Experience [doGet]
            sampleBean.setRecentJobTitle("Web Developer");
            sampleBean.setCompanyName("Tech Solution Sdn Bhd");
            sampleBean.setDuration("2024 - 2025");
            sampleBean.setKeyRespAchieve("Managed relational databases");
            
            //Skills [doGet]
            sampleBean.setTechincalSkill("Java, HTML, SQL");
            sampleBean.setSoftSkill("Problem solving, Teamwork");
            
            req.setAttribute("cvData", sampleBean);
            req.getRequestDispatcher("cvView.jsp").forward(req,res);
        }else{
            res.sendRedirect("cvForm.jsp");
        }
    }
    
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        
        CVBean cvBean = new CVBean ();
        
        //Personal info [doPost]
        cvBean.setFullName(req.getParameter("fullname"));
        cvBean.setProfessionalTitle(req.getParameter("professional title"));
        cvBean.setEmail(req.getParameter("email"));
        cvBean.setPhoneNum (req.getParameter("phoneNum"));
        cvBean.setLinkURL(req.getParameter("linkURL"));
        cvBean.setProfileSummary(req.getParameter("profileSummary"));
        
        //Education [doPost]
        cvBean.setHighestDegree(req.getParameter("highestDegree"));
        cvBean.setInstitutionName(req.getParameter("institutionName"));
        cvBean.setGraduateYear(req.getParameter("graduateYear"));
        cvBean.setMajor_field(req.getParameter("major_field"));
        
        //Experience [doPost]
        cvBean.setRecentJobTitle(req.getParameter("recentJobTitle"));
        cvBean.setCompanyName(req.getParameter("companyName"));
        cvBean.setDuration(req.getParameter("duration"));
        cvBean.setKeyRespAchieve(req.getParameter("keyRespAchieve"));
            
        //Skills [doPost]
        cvBean.setTechincalSkill(req.getParameter("technicalSkill"));
        cvBean.setSoftSkill(req.getParameter("softSkill"));
        
        if (cvBean.validation()){
            req.setAttribute("cvData", cvBean);
            req.getRequestDispatcher("cvView.jsp").forward(req, res);
        }else{
            req.setAttribute("errorMessage", 
                                 "Validation failed! Please ensure " +
                                 "Name, valid Email, Degree, and at least one skill are filled");
            req.getRequestDispatcher("cvError.jsp").forward(req, res);
        }
    }
}
