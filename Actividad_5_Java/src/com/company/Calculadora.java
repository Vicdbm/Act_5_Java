package com.company;

public class Calculadora {
    private int x;
    private int y;

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public int suma() {
        return (this.x+this.y);
    }

    public int resta() {
        return (this.x-this.y);
    }

    public int multiplicacion() {
        return (this.x*this.y);
    }

    public int division() {
        return (this.x/this.y);
    }

    public int modulo() {
        return (this.x%this.y);
    }
}