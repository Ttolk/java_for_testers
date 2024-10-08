package ru.stqa.geometry.figures;

import static java.lang.Math.sqrt;

public record Triangle(double a, double b, double c) {

    public Triangle {
        if (a < 0 || b < 0 || c < 0) {
            throw new IllegalArgumentException("Сторона треугольника не должна быть отрицательной");
        }
        if (a + b < c || a + c < b || c + b < a) {
            throw new IllegalArgumentException("Должно соблюдаться неравенство треугольника");
        }
    }


    public double area() {
        var p = ((this.a + this.b + this.c) / 2);
        return sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public double perimeter() {
        return this.a + this.b + this.c;
    }
}
