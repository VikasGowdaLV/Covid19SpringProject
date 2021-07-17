package com.Covid.Covid19Details.controller;

import com.Covid.Covid19Details.datarepo.AlertStatus;
import com.Covid.Covid19Details.datarepo.ApiData;
import com.Covid.Covid19Details.datarepo.StateData;
import com.Covid.Covid19Details.datarepo.SummaryData;
import com.Covid.Covid19Details.services.Covid19DataProvider;
import com.Covid.Covid19Details.services.Services;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.stereotype.Controller;

import java.awt.*;

@org.springframework.stereotype.Controller
public class controller{

    @Autowired
    private Services services;

    @Autowired
    private Covid19DataProvider covid19DataProvider;

    @GetMapping("/india/{state}")
    public String getAlertAboutState(@PathVariable String state, Model model) {

        StateData data = covid19DataProvider.getStateData(state);
        SummaryData summaryData = services.getOverAllSummary();

        model.addAttribute("time", summaryData.getUpdateTime());

        model.addAttribute("stateData", data);
//        return services.getAlertAboutState(state);
        return "StateDetails";
    }

    @GetMapping("/india")
    public String  homeSummary(Model model) {
        SummaryData summaryData = services.getOverAllSummary();

        model.addAttribute("time", summaryData.getUpdateTime());

        model.addAttribute("summary", summaryData);
        return "homeSummary";

    }
}