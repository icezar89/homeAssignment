package com.homeAss.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.homeAss.models.weekDays.*;
import lombok.Getter;

import java.util.Arrays;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Days {

    private Monday[] monday;
    private Tuesday[] tuesday;
    private Wednesday[] wednesday;
    private Thursday[] thursday;
    private Friday[] friday;
    private Saturday[] saturday;
    private Sunday[] sunday;

    @Override
    public String toString() {
        return "Days{" +
                "monday=" + Arrays.toString(monday) +
                ", tuesday=" + Arrays.toString(tuesday) +
                ", wednesday=" + Arrays.toString(wednesday) +
                ", thursday=" + Arrays.toString(thursday) +
                ", friday=" + Arrays.toString(friday) +
                ", saturday=" + Arrays.toString(saturday) +
                ", sunday=" + Arrays.toString(sunday) +
                '}';
    }
}
