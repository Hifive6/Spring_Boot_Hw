package com.tts.homework.springbootsite.Controller;

import com.tts.homework.springbootsite.Domain.VGIModel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
//Video Game info Controller
public class VGIController {
     
    @GetMapping("/videogame")//this is for a get
    public String gameInfo(Model model){
        model.addAttribute("videogame", new VGIModel());
        return "videogame";
    }

    @PostMapping("/videogame")
    public String videogame(@ModelAttribute VGIModel model){
        return "info";
    }
}