package com.usb.calcapp.calculo;

public class Triangulo extends Rectangulo{

    public Triangulo(double base, double altura) {
        super(base, altura);
    }

    public Triangulo(String base, String altura) {
        super(base, altura);
    }

    public double area(){
        return (base*altura)/2;
    }

}
