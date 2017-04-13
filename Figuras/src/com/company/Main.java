package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Interficie[] i = new Interficie[4];
        i[0]=new Rectangulo(4,2);
        i[1]=new Cuadrado(4);
        i[3]=new Triangulo(4,4);
        i[2]=new Circulo(4.5);
        double suma=0;

        for (Interficie j:i)
        {
            suma=suma+j.area();
        }
        System.out.print(suma);
    }
}
