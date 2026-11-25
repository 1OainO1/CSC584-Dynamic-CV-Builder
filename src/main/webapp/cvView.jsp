<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="com.cvbuilder.model.CVBean" %>
<%
    CVBean cv = (CVBean) request.getAttribute("cvData");
    if (cv == null) {
        response.sendRedirect("cvForm.jsp");
        return;
    }
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>CV View <%= cv.getFullName() %> - Dynamic CV</title>
    <link rel="stylesheet" type="text/css" href="css/style.css?v=2">
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css">
</head>
<body>
    <div class="cv-paper">
        <!-- Top Header Banner -->
        <header class="cv-header">
            <div class="header-main">
                <h1><%= cv.getFullName() %></h1>
                <h4><%= cv.getProfessionalTitle() != null ? cv.getProfessionalTitle() : "" %></h4>
            </div>
            <div class="header-contact">
                <p><i class="fa-solid fa-envelope"></i> <%= cv.getEmail() %></p>
                <p><i class="fa-solid fa-phone"></i> <%= cv.getPhoneNum() %></p>
                <p><i class="fa-brands fa-linkedin"></i> <a href="<%= cv.getLinkURL() %>" target="_blank"><%= cv.getLinkURL() %></a></p>
            </div>
        </header>

        <!-- Profile Summary -->
        <section class="cv-section">
            <h2><i class="fa-solid fa-user"></i> Profile Summary</h2>
            <p class="summary-box"><%= cv.getProfileSummary() %></p>
        </section>

        <!-- Education -->
        <section class="cv-section">
            <h2><i class="fa-solid fa-graduation-cap"></i> Education</h2>
            <div class="item-row">
                <div>
                    <p class="item-title"><strong><%= cv.getHighestDegree() %></strong> in <%= cv.getMajor_field() %></p>
                    <p class="item-sub"><%= cv.getInstitutionName() %></p>
                </div>
                <span class="date-badge"><%= cv.getGraduateYear() %></span>
            </div>
        </section>

        <!-- Work Experience -->
        <section class="cv-section">
            <h2><i class="fa-solid fa-briefcase"></i> Work Experience</h2>
            <div class="item-row">
                <div>
                    <p class="item-title"><strong><%= cv.getRecentJobTitle() %></strong></p>
                    <p class="item-sub"><%= cv.getCompanyName() %></p>
                </div>
                <span class="date-badge"><%= cv.getDuration() %></span>
            </div>
            <p class="item-desc"><%= cv.getKeyRespAchieve() %></p>
        </section>

        <!-- Skills (Two-Column Split) -->
        <section class="cv-section">
            <h2><i class="fa-solid fa-screwdriver-wrench"></i> Skills</h2>
            <div class="skills-grid">
                <div class="skill-box">
                    <h4>Technical Skills</h4>
                    <div class="skills-container">
                        <% 
                            if (cv.getTechnicalSkill() != null && !cv.getTechnicalSkill().isEmpty()) {
                                for (String skill : cv.getTechnicalSkill().split(",")) { 
                        %>
                            <span class="skill-badge"><%= skill.trim() %></span>
                        <%      }
                            } 
                        %>
                    </div>
                </div>
                <div class="skill-box">
                    <h4>Soft Skills</h4>
                    <div class="skills-container">
                        <% 
                            if (cv.getSoftSkill() != null && !cv.getSoftSkill().isEmpty()) {
                                for (String skill : cv.getSoftSkill().split(",")) { 
                        %>
                            <span class="skill-badge"><%= skill.trim() %></span>
                        <%      }
                            } 
                        %>
                    </div>
                </div>
            </div>
        </section>

        <!-- Bottom Anchor Footer -->
        <footer class="cv-footer">
        </footer>

        <div class="no-print action-bar">
            <button onclick="window.print()" class="btn-submit"><i class="fa-solid fa-print"></i> Print / Save PDF</button>
            <a href="cvForm.jsp" class="btn-sample"><i class="fa-solid fa-arrow-left"></i> Create New CV</a>
            <button type="button" onclick="history.back()" class="btn-sample">
                <i class="fa-solid fa-pen-to-square"></i> Edit CV
            </button>
        </div>
    </div>
</body>
</html>