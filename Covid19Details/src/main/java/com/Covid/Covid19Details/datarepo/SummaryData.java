package com.Covid.Covid19Details.datarepo;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.ZonedDateTime;


@Data
@NoArgsConstructor
@AllArgsConstructor
public class SummaryData extends BaseClass {

    private int total;
    private int confirmedButLocationUnidentified;
    private ZonedDateTime updateTime;
}
