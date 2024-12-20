package org.triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTest {

    @Test
    public void testEquilateralTriangle() {
        Triangle t1 = new Triangle(1, 1, 1);
        Triangle t2 = new Triangle(Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);

        assertEquals("equilateral", t1.classify(), "Deve ser um triangulo Equilatero");
        assertEquals("equilateral", t2.classify(), "Deve ser um triangulo Equilatero");
    }

    @Test
    public void testIsoscelesTriangle() {
        Triangle t3 = new Triangle(1, 1, 2);
        Triangle t4 = new Triangle(1, 2, 1);
        Triangle t5 = new Triangle(2, 1, 1);

        assertEquals("isossceles", t3.classify(), "Deve ser um triangulo Isosceles");
        assertEquals("isossceles", t4.classify(), "Deve ser um triangulo Isosceles");
        assertEquals("isossceles", t5.classify(), "Deve ser um triangulo Isosceles");
    }

    @Test
    public void testRectanguloTriangle() {
        Triangle t6 = new Triangle(6, 8, 10);
        Triangle t7 = new Triangle(6, 10, 8);
        Triangle t8 = new Triangle(10, 8, 6);

        assertEquals("right-angled", t6.classify(), "Deve ser um triangulo Rectangulo");
        assertEquals("right-angled", t7.classify(), "Deve ser um triangulo Rectangulo");
        assertEquals("right-angled",t8.classify(), "Deve ser um triangulo Rectangulo");
    }

    @Test
    public void testEscaleneTriangle() {
        Triangle t9 = new Triangle(1, 2, 3);

        assertEquals("scalene", t9.classify(), "Deve ser um triangulo Escaleno");
    }

    @Test
    public void testImpossivelTriangle() {
        Triangle t10 = new Triangle(-1, 2, 3);
        Triangle t11 = new Triangle(1, -2, 3);
        Triangle t12 = new Triangle(1, 2, -3);
        Triangle t13 = new Triangle(-1, -2, 3);
        Triangle t14 = new Triangle(1, -2, -3);
        Triangle t15 = new Triangle(-1, -2, -3);
        Triangle t16 = new Triangle(Integer.MAX_VALUE, 0, 0);
        Triangle t17 = new Triangle(0,Integer.MAX_VALUE, 0);
        Triangle t18 = new Triangle(0,0, Integer.MAX_VALUE);
        Triangle t19 = new Triangle(Integer.MAX_VALUE, Integer.MAX_VALUE, 0);
        Triangle t20 = new Triangle(Integer.MAX_VALUE, 0, Integer.MAX_VALUE);
        Triangle t21 = new Triangle(0, Integer.MAX_VALUE, Integer.MAX_VALUE);
        Triangle t22 = new Triangle(0, 0, 0);
        Triangle t23 = new Triangle(null, null, null);

        assertEquals("impossible", t10.classify(), "Deve ser um triangulo Impossivel");
        assertEquals("impossible", t11.classify(), "Deve ser um triangulo Impossivel");
        assertEquals("impossible", t12.classify(), "Deve ser um triangulo Impossivel");
        assertEquals("impossible", t13.classify(), "Deve ser um triangulo Impossivel");
        assertEquals("impossible", t14.classify(), "Deve ser um triangulo Impossivel");
        assertEquals("impossible", t15.classify(), "Deve ser um triangulo Impossivel");
        assertEquals("impossible", t16.classify(), "Deve ser um triangulo Impossivel");
        assertEquals("impossible", t17.classify(), "Deve ser um triangulo Impossivel");
        assertEquals("impossible", t18.classify(), "Deve ser um triangulo Impossivel");
        assertEquals("impossible", t19.classify(), "Deve ser um triangulo Impossivel");
        assertEquals("impossible", t20.classify(), "Deve ser um triangulo Impossivel");
        assertEquals("impossible", t21.classify(), "Deve ser um triangulo Impossivel");
        assertEquals("impossible", t22.classify(), "Deve ser um triangulo Impossivel");
        assertEquals("impossible", t23.classify(), "Deve ser um triangulo Impossivel");
        
    }
}
