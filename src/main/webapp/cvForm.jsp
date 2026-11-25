<%-- 
    Document   : cvForm
    Created on : 11 Nov 2026, 9:39:16 am
    Author     : User A
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>CV Form</title>
        <link rel ="stylesheet" type ="text/css" href="css/style.css">
    </head>
    
    <body>
        <div class="form-container">
            <h2>Dynamic Online CV Builder</h2>
            <div action="top-actions">
                <a href="CVServlet?action=sample" class="btn-sample">Preview Sample CV</a>
            </div>
            
            <form action="CVServlet" method="post">
                
                <h3>Personal Information</h3>
                <input type="text" name="fullname" placeholder="Full Name *" required>
                <input type="text" name="professionalTitle" placeholder="Professional Title">
                <input type="email" name="email" placeholder="Email *" required>
                <input type="text" name="phoneNum" placeholder="Phone Number *" required>
                <input type="url" name="linkURL" placeholder="Linkedin URL">
                <textarea name="profileSummary" placeholder="Profile Summary"></textarea>
                
                <h3>Education</h3>
                <input type="text" name="highestDegree" placeholder="Highest Degree *" required>
                <input type="text" name="institutionName" placeholder="Instituition Name">
                <input type="text" name="graduateYear" placeholder="Graduation Year">
                <input type="text" name="major_field" placeholder="Major/Field of Study">
                
                <h3>Work Experience</h3>
                <input type="text" name="recentJobTitle" placeholder="Recent Job Title">
                <input type="text" name="companyName" placeholder="Company Name">
                <input type="text" name="duration" placeholder="Work Duration">
                <textarea name="keyRespAchieve" placeholder="Key Responsibility/Achievement"></textarea>
                
                <h3>Skills</h3>
                <input type="text" name="technicalSkill" placeholder="Technical Skill">
                <input type="text" name="softSkill" placeholder="Soft Skill">
                
                <button type="submit" class="btn-submit">Generate CV</button>
            </form>
        </div>
    </body>
</html>
