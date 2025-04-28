package calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CalculadoraTeste {

    Calculadora calc = new Calculadora();

    @Test
    public void testSomar() {
        assertEquals(5, calc.somar(2, 3));
    }

    @Test
    public void testSubtrair() {
        assertEquals(1, calc.subtrair(3, 2));
    }

    @Test
    public void testMultiplicar() {
        assertEquals(6, calc.multiplicar(2, 3));
    }

    @Test
    public void testDividir() {
        assertEquals(2, calc.dividir(6, 3));
    }

    @Test
    public void testDividirPorZero() {
        assertThrows(ArithmeticException.class, () -> calc.dividir(5, 0));
    }

    @Test
    public void testPotenciar() {
        assertEquals(8, calc.potenciar(2, 3));
    }
}
