package com.tts.homework.springbootsite.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
//Video Game info Controller
public class VGIController {
     
    @RequestMapping("/videogame")//this is for a get
    public String gameInfo(){
        return "videogame";
    }
}