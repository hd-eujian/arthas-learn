package com.eujian.arthaslearn.controller;

public class MyService {

    public String send(){
        System.out.println("send被调用了");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "send";
    }

}
