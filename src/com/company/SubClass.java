package com.company;

import java.io.FileNotFoundException;
import java.io.IOException;

public class SubClass extends SuperClass {
    public void start() throws FileNotFoundException {
        throw new FileNotFoundException("Not able to start");
    }
}
