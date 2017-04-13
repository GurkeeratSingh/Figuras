package com.company;

/**
 * Created by Gurkeerat Singh on 13/04/2017.
 */
public class Rectangulo implements Interficie {

    private double op;
    public Rectangulo(double c1, double c2) {
        this.op= c1 * c2;
    }

    @Override
    public double area() {
        return this.op;
    }
}
