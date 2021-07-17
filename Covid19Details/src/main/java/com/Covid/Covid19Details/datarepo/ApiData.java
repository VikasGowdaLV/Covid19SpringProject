package com.Covid.Covid19Details.datarepo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ApiData {


    private CountryData data;
    private ZonedDateTime lastRefreshed;
    private ZonedDateTime lastOriginUpdate;
}
