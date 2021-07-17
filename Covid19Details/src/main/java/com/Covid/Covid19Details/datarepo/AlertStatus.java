package com.Covid.Covid19Details.datarepo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AlertStatus {

    private String alertLevel;//RED, GREEN, ORNAGE

    private List<String> measuresToBeTaken;

    private StateData summaryData;


}
