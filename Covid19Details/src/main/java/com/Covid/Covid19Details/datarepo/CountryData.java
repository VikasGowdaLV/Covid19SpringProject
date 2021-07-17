package com.Covid.Covid19Details.datarepo;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CountryData {

    private SummaryData summary;

    private StateData[] regional;

}
