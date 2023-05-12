package org.example;

public class LinearFunction{

    private final int coefficient;

    public LinearFunction(int coefficient){
        if (coefficient < 0){
            throw new IllegalArgumentException();
        }
        this.coefficient = coefficient;
    }

    public int getCoefficient() {
        return coefficient;
    }
}
