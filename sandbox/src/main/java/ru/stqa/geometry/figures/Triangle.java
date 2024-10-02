package ru.stqa.geometry.figures;

import static java.lang.Math.sqrt;

public record Triangle(double a, double b, double c) {


    public double area() {
        var p = ((this.a + this.b + this.c) / 2);
        return sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double perimeter() {
        return this.a + this.b + this.c;
    }
}
