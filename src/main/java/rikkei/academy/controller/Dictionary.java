package rikkei.academy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class Dictionary {
    @GetMapping("/search-form")
    public String showSearchForm(){
        return "search-form";
    }
    @GetMapping("/result")
    public String useDictionary(@RequestParam String english, Model model){
        String vietnamese;
        switch (english){
            case "dog":
                vietnamese = "Con chó";
                model.addAttribute("result", vietnamese);
                break;
            case "cat":
                vietnamese = "Con mèo";
                model.addAttribute("result", vietnamese);
                break;
            case "fish":
                vietnamese = "Con cá";
                model.addAttribute("result", vietnamese);
                break;
            case "rabbit":
                vietnamese = "Con thỏ";
                model.addAttribute("result", vietnamese);
                break;
            case "fox":
                vietnamese = "Con cáo";
                model.addAttribute("result", vietnamese);
                break;
        }
        return "result";
    }
}
