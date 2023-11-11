package com.StudentRegistrationForm.Student.RestControler;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

import static java.util.Arrays.stream;

@Controller
public class NumberControler {
    @GetMapping("/number")
    public String number(){
        return "number";
    }

    public char returnString(String str,int index){
        return str.toCharArray()[index];
    }

    @PostMapping("/displayNumber")
    public String displayNumber(HttpServletRequest request, Model model){
        int number= Integer.parseInt(request.getParameter("number"));
       // String name=request.getParameter("name");
        int ans=0;
        while(number!=0){
            int re=number%10;
            ans=ans*10+re;
            number=number/10;
        }
        /*char ch;
        String additional="";
        for(int i=0;i<name.length();i++){
            ch=name.charAt(i);
            additional+=ch;
        }

        System.out.print(ans);*/
        model.addAttribute("ans",ans);
        //model.addAttribute("reverse",additional);
        return "display";
    }

    @PostMapping("/vision")
    public String reverseName(HttpServletRequest request, Model model){
        String name=request.getParameter("yourName");
        char ch;
        String additional = " ";
        for(int i=0;i<name.length();i++){
            ch=name.charAt(i);
            additional=ch+additional;
        }

        model.addAttribute("result",additional);
        return "vision";
    }

}
