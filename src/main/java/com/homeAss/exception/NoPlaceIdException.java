package com.homeAss.exception;


public class NoPlaceIdException extends NullPointerException{

    public NoPlaceIdException(String errorMessage) {
        super(errorMessage);
    }
}
