import org.junit.jupiter.api.Test;

import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void calculo() {
        Calculadora c = new Calculadora();

        String ecuacion = "129*+";
        Menu<Float> data = new MetodoArray<Float>();
        Menu<String> operandos = new MetodoArray<String>();




        assertEquals("19.0",c.Calculo(ecuacion, operandos, data));



    }



}