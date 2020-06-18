package com.tts.homework.springbootsite.Controller;

import com.tts.homework.springbootsite.Domain.VGIModel;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
// import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
//Video Game info Controller
public class VGIController {
     
    @RequestMapping(value = "/")//this is for a get
    public String gameInfo(Model model){
        model.addAttribute("videogame", new VGIModel());
        return "videogame.html";
    }

    @RequestMapping(value = "/save-videogame")
    public String saveVideoInfo(@ModelAttribute VGIModel model){
        return "info.html";
    }
}