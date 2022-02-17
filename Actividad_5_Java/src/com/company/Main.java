package com.company;

public class Main {

    public static void main(String[] args) {
        Calculadora Calc = new Calculadora();

        Calc.setX(5);
        Calc.setY(2);

        System.out.println("X = "+Calc.getX());
        System.out.println("Y = "+Calc.getY());
        System.out.println("Suma: " +Calc.suma());
        System.out.println("Resta: "+Calc.resta());
        System.out.println("Multiplicación: "+Calc.multiplicacion());
        try {
            System.out.println("División: "+Calc.division());
            System.out.println("Módulo: "+Calc.modulo());
        }
        catch (ArithmeticException e) {
            System.out.println("División: indefinido");
            System.out.println("Módulo: indefinido");
        }
    }
}