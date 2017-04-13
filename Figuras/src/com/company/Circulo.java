package com.company;

/**
 * Created by Gurkeerat Singh on 13/04/2017.
 */
public class Circulo implements Interficie{
   private double op;

   public Circulo (double r){
       this.op=Math.PI*r*r;
   }

    @Override
    public double area() {
        return this.op;
    }
}
