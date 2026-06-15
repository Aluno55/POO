package engtelecom.poo;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {
    
    @Test
    public void soma(){
        Calculadora c = new Calculadora();
        assertEquals(2, c.soma(1,1), "positivo");
        assertEquals(1, c.soma(0,1), "positivo");
        assertEquals(1, c.soma(1,0), "positivo");
        assertEquals(-2, c.soma(-1,-1), "positivo");
        assertEquals(-1, c.soma(0,-1), "positivo");
        assertEquals(-1, c.soma(-1,0), "positivo");
        assertEquals(0, c.soma(-1,1), "positivo");
        assertEquals(0, c.soma(0,0), "positivo");
    }

    @Test
    public void tipoTriangulo(){
        Calculadora c = new Calculadora();
        assertEquals("equilátero", c.tipoTriangulo(3,3,3));
        assertEquals("isósceles", c.tipoTriangulo(5,5, 6));
        assertEquals("escaleno", c.tipoTriangulo(3,4,5));
        assertEquals("não é um triângulo", c.tipoTriangulo(0,1,1));
        assertEquals("não é um triângulo", c.tipoTriangulo(1,0,1));
        assertEquals("não é um triângulo", c.tipoTriangulo(1,1,0));

        assertEquals("não é um triângulo", c.tipoTriangulo(-3,3,3));
        assertEquals("não é um triângulo", c.tipoTriangulo(-5,5, 6));
        assertEquals("não é um triângulo", c.tipoTriangulo(-3,4,5));
        assertEquals("não é um triângulo", c.tipoTriangulo(-1,0,1));
        assertEquals("não é um triângulo", c.tipoTriangulo(-1,1,0));

        assertEquals("não é um triângulo", c.tipoTriangulo(3,-3,3));
        assertEquals("não é um triângulo", c.tipoTriangulo(5,-5, 6));
        assertEquals("não é um triângulo", c.tipoTriangulo(3,-4,5));
        assertEquals("não é um triângulo", c.tipoTriangulo(0,-1,1));
        assertEquals("não é um triângulo", c.tipoTriangulo(1,-1,0));

        assertEquals("não é um triângulo", c.tipoTriangulo(3,3,-3));
        assertEquals("não é um triângulo", c.tipoTriangulo(5,5, -6));
        assertEquals("não é um triângulo", c.tipoTriangulo(3,4,-5));
        assertEquals("não é um triângulo", c.tipoTriangulo(0,1,-1));
        assertEquals("não é um triângulo", c.tipoTriangulo(1,0,-1));

        assertEquals("não é um triângulo", c.tipoTriangulo(-3,-3,3));
        assertEquals("não é um triângulo", c.tipoTriangulo(-5,-5, 6));
        assertEquals("não é um triângulo", c.tipoTriangulo(-3,-4,5));
        assertEquals("não é um triângulo", c.tipoTriangulo(0,-1,-1));
        assertEquals("não é um triângulo", c.tipoTriangulo(-1,0,-1));
        assertEquals("não é um triângulo", c.tipoTriangulo(-1,-1,0));

        assertEquals("não é um triângulo", c.tipoTriangulo(-3,3,-3));
        assertEquals("não é um triângulo", c.tipoTriangulo(-5,5, -6));
        assertEquals("não é um triângulo", c.tipoTriangulo(-3,4,-5));

        assertEquals("não é um triângulo", c.tipoTriangulo(3,-3,-3));
        assertEquals("não é um triângulo", c.tipoTriangulo(5,-5, -6));
        assertEquals("não é um triângulo", c.tipoTriangulo(3,-4,-5));

        assertEquals("não é um triângulo", c.tipoTriangulo(0,0,1));
        assertEquals("não é um triângulo", c.tipoTriangulo(0,0,-1));
        assertEquals("não é um triângulo", c.tipoTriangulo(0,1,0));
        assertEquals("não é um triângulo", c.tipoTriangulo(0,-1,0));
        assertEquals("não é um triângulo", c.tipoTriangulo(1,0,0));
        assertEquals("não é um triângulo", c.tipoTriangulo(-1,0,0));

        assertEquals("isósceles", c.tipoTriangulo(6,5, 5));
        assertEquals("isósceles", c.tipoTriangulo(5,6, 5));
        assertEquals("escaleno", c.tipoTriangulo(4,3,5));
        assertEquals("escaleno", c.tipoTriangulo(5,4,3));
        assertEquals("escaleno", c.tipoTriangulo(4,5,3));

        assertEquals("não é um triângulo", c.tipoTriangulo(10,3,3));
        assertEquals("não é um triângulo", c.tipoTriangulo(3,10,3));
        assertEquals("não é um triângulo", c.tipoTriangulo(3,3,10));
        assertEquals("não é um triângulo", c.tipoTriangulo(0,0,0));
        assertEquals("não é um triângulo", c.tipoTriangulo(1,2,3));
    }
}