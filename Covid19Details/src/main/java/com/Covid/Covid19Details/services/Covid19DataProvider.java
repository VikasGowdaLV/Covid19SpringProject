package com.Covid.Covid19Details.services;

import com.Covid.Covid19Details.datarepo.ApiData;
import com.Covid.Covid19Details.datarepo.StateData;
import com.Covid.Covid19Details.datarepo.SummaryData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.Arrays;

@Service
public class Covid19DataProvider {

    static final String URL = "https://api.rootnet.in/covid19-in/stats/latest";

//    @Bean
//    public RestTemplate restTemplate() {
//        return new RestTemplate();
//    }

    @Autowired
    RestTemplate restTemplate;

    public StateData getStateData(String state) {

        ApiData covidApiData = restTemplate.getForObject(URL, ApiData.class);

        /*if(!covidApiData.isSuccess()){
            throw new RuntimeException("Issue in fetching data");
        }*/
        return Arrays.stream(covidApiData.getData().getRegional())
                .filter(e -> e.getLoc().equalsIgnoreCase(state))
                .findAny()
                .orElse(new StateData());

    }

    public SummaryData getSummaryData() {
        ApiData covidApiData = restTemplate.getForObject(URL, ApiData.class);

        SummaryData summaryData = covidApiData.getData().getSummary();

        summaryData.setUpdateTime(covidApiData.getLastRefreshed());

        return summaryData;
    }
}
