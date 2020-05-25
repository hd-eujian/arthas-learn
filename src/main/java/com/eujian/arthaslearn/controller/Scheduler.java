package com.eujian.arthaslearn.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class Scheduler {

    @Autowired
    private ArthasController arthasController;


    @Scheduled(cron = "0/5 * * * * ? ")
    public void testTasks() throws InterruptedException {
        arthasController.arthasTrace();
    }
}
