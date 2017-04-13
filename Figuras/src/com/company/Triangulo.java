package com.company;

/**
 * Created by Gurkeerat Singh on 13/04/2017.
 */
public class Triangulo implements Interficie{
    private double op;

    public Triangulo (double b, double h){

        this.op = ((b * h) / 2);
    }
    @Override
    public double area() {
        return this.op;
    }
}
