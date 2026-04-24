package com.baufest.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private final Calculadora calculadora = new Calculadora();

    @Test
    void deberiaSumarDosNumeros() {
        assertEquals(8, calculadora.sumar(5, 3));
    }

    @Test
    void deberiaRestarDosNumeros() {
        assertEquals(2, calculadora.restar(5, 3));
    }

    @Test
    void deberiaMultiplicarDosNumeros() {
        assertEquals(15, calculadora.multiplicar(5, 3));
    }

    @Test
    void deberiaDividirDosNumeros() {
        assertEquals(2, calculadora.dividir(6, 3));
    }

    @Test
    void deberiaLanzarErrorAlDividirPorCero() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.dividir(10, 0));
    }
}