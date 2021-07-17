package com.Covid.Covid19Details.datarepo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class BaseClass {

    private int confirmedCasesIndian;
    private int confirmedCasesForeign;
    private int discharged;
    private int deaths;

}
