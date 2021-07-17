package com.Covid.Covid19Details.controller;

import com.Covid.Covid19Details.datarepo.AlertStatus;
import com.Covid.Covid19Details.datarepo.SummaryData;
import com.Covid.Covid19Details.services.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/india/")
public class Controller {

    @Autowired
    private Services services;

    @GetMapping("/{state}")
    public AlertStatus getAlertAboutState(@PathVariable String state){

        return services.getAlertAboutState(state);
    }

    @GetMapping("/summary")
    public SummaryData getOverAllSummary(){

        return services.getOverAllSummary();
    }

    @SpringBootApplication
    public static class Covid19DetailsApplication {

        public static void main(String[] args) {
            SpringApplication.run(Covid19DetailsApplication.class, args);
        }

    }
}
