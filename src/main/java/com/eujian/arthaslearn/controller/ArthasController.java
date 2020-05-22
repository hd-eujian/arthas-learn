package com.eujian.arthaslearn.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class ArthasController {


    @GetMapping("/a")
    public String arthas(String a){
        System.out.println(a);
        return a;
    }
}
