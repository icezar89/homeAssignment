package com.homeAss.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpeningHours {

    private boolean closed_on_holidays;
    private boolean open_by_arrangement;
    private Days days;

    @Override
    public String toString() {
        return "OpeningHours{" +
                "closed_on_holidays=" + closed_on_holidays +
                ", open_by_arrangement=" + open_by_arrangement +
                ", days=" + days +
                '}';
    }
}
