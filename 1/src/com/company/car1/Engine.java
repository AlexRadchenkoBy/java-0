package com.company.car1;

import java.util.ArrayList;

public class Engine {
   private String engineCondition;
   private int fuelLevel;

    public Engine(String engineCondition, int fuelLevel) {
        this.engineCondition = engineCondition;
        this.fuelLevel = fuelLevel;
    }

    public String getEngineCondition() {
        return engineCondition;
    }

    public String toString() {
        return engineCondition;
    }
}
