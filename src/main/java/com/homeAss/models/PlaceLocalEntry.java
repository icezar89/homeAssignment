package com.homeAss.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;

import java.util.Date;

@Getter
@JsonIgnoreProperties(ignoreUnknown = true)
public class PlaceLocalEntry {

    private String displayed_what;
    private String displayed_where;
    private OpeningHours opening_hours;
    private Date creation_date;
    private Date modified_date;


    @Override
    public String toString() {
        return "PlaceLocalEntry{" +
                "displayed_what='" + displayed_what + '\'' +
                ", displayed_where='" + displayed_where + '\'' +
                ", opening_hours=" + opening_hours +
                ", creation_date=" + creation_date +
                ", modified_date=" + modified_date +
                '}';
    }
}
