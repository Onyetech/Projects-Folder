package com.mypisubproject.PiSub.Project.exceptions;

public class UserNotFoundException extends Exception{
    public UserNotFoundException(String errorMessage){
        super(errorMessage);
    }

}
