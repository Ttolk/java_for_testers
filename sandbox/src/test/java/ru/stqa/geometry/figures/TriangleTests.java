package ru.stqa.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {

    @Test
    void canCalculateArea() {
        var s = new Triangle(5.0, 5.0, 5.0);
        double result = s.area();
        Assertions.assertEquals(10.825317547305483, result);
    }

    @Test
    void canCalculatePerimeter() {
        Assertions.assertEquals(15, new Triangle(5,5,5).perimeter());


    }

    @Test
    void cannotCreateTriangleWithNegativeSide() {
        try {
            new Triangle(-5.0, 3.0, 4.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            //OK
        }
    }

    @Test
    void cannotCreateTriangleWithInequalityIsViolated() {
        try {
            new Triangle(5.0, 2.0, 2.0);
            Assertions.fail();
        } catch (IllegalArgumentException exception) {
            //OK
        }
    }
}
