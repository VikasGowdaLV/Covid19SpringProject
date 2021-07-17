package com.Covid.Covid19Details.datarepo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StateData extends BaseClass{

    private String loc;
    private int totalConfirmed;
//    private StateData stateData;

}
