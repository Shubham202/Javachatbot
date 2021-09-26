package com.example.Chatbot;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BotController {

    @GetMapping
    String get(Model model) {
        model.addAttribute("something","this is");
        model.addAttribute("greet","Hello I'm a chatbot!!!");
        model.addAttribute("","");
        return "bot";
    }

}
