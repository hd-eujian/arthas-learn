package com.eujian.arthaslearn.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
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

    @PostMapping("/post")
    public ObjectNode post(@RequestBody ObjectNode objectNode){
        objectNode.put("a","q");
        System.out.println(objectNode);
        return objectNode;
    }
}
