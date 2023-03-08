import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    private Calculadora calculadora = new Calculadora();
    @Test
    @DisplayName("Prueba Suma")
    void suma() {
        int esperado = 5;
        assertEquals(esperado, calculadora.suma(3,2));
    }

    @Test
    @DisplayName("Prueba Resta")
    void resta() {
        int esperado = 1;
        assertEquals(esperado, calculadora.resta(3,2));
    }

    @Test
    @DisplayName("Prueba Multiplica")
    void multiplica() {
        int esperado = 6;
        assertEquals(esperado, calculadora.multiplica(3,2));
    }
    @Test
    @DisplayName("Prueba Divido")
    void divido() {
        assertThrows(IllegalArgumentException.class, () -> calculadora.divide(100, 0),"No es posinle dividir un valor 0");

    }
}