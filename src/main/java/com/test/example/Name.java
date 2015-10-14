package com.test.example;

import javax.enterprise.context.RequestScoped;
import javax.inject.Named;

@Named
@RequestScoped
public class Name {

    private String value = "Test";

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
