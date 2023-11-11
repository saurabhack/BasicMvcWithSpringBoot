package com.StudentRegistrationForm.Student.RestControler;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class WordCounter {
    @GetMapping("/WordPad")
    public String word(){
        return "wordpad";
    }

    @PostMapping("/displayWord")
    public String display(HttpServletRequest request, Model model){
        String words=request.getParameter("words");
        //List<Character> CharList= new ArrayList<>();

        String slv=words.replaceAll("\\s","");
        /*for(char c:words.toCharArray()){
            CharList.add(c);
        }*/

        int len=slv.length();
        model.addAttribute("size",len);
        return "displayWords";
    }


}
