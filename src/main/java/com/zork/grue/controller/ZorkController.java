package com.zork.grue.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("")
public class ZorkController {

    @GetMapping("/zork")
    public String getZork(){
        return "zork.html";
    }

    @GetMapping("/")
    public String getHome() {
        return "zork.html";
    }

    @GetMapping ("/lights")
    public String getLights(){
        return "lights.html";
    }

    @GetMapping("/dead")
    public String getDead() {
        return "dead.html";
    }

    @GetMapping("/exit")
    public String getExit(){
        return "exit.html";
    }





}
