package com.eujian.arthaslearn.controller;

import com.fasterxml.jackson.databind.node.ObjectNode;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class ArthasController {


    @GetMapping("/arthasGet")
    public String arthasGet(String a,String b){
        System.out.println("arthasGet");
        System.out.println(String.format("a=%s,b=%s",a,b));
        return a;
    }

    @PostMapping("/arthasPost")
    public ObjectNode arthasPost(@RequestBody ObjectNode objectNode){
        System.out.println(String.format("objectNode=%s",objectNode));
        objectNode.put("a","q");
        new MyService().send();
        return objectNode;
    }

    @PostMapping("/arthasInvote")
    public ObjectNode arthasInvote(@RequestBody ObjectNode objectNode){
        System.out.println("arthasInvote");
        System.out.println(String.format("objectNode=%s",objectNode));
        return objectNode;
    }
}
