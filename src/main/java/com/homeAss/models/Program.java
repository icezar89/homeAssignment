package com.homeAss.models;

import lombok.Getter;

@Getter
public class Program {

    private String start;
    private String end;
    private String type;


    @Override
    public String toString() {
        return "Program{" +
                "start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
