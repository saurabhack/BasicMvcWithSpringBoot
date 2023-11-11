package com.StudentRegistrationForm.Student.RestControler;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentRestControler {
    @GetMapping("/student_registration_form")
    public String registration(){
        return "studentRegistration";
    }


    @PostMapping("studentDetails")
    public String details(HttpServletRequest request, Model model){

        String name=request.getParameter("name");
        String cls=request.getParameter("class");
        String subject=request.getParameter("subject");
        String age=request.getParameter("age");


        model.addAttribute("name",name);
        model.addAttribute("class",cls);
        model.addAttribute("subject",subject);
        model.addAttribute("age",age);

        return "details";
    }

}
