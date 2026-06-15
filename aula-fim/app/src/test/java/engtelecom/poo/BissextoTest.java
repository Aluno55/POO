package engtelecom.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class BissextoTest {
    @Test
    public void anoBissexto(){
        Bissexto b = new Bissexto();
        assertEquals(false, b.anoBissexto(1900));
        assertEquals(true, b.anoBissexto(1996));
        assertEquals(false, b.anoBissexto(1500));
        assertEquals(true, b.anoBissexto(2004));
        assertEquals(false, b.anoBissexto(100));
        assertEquals(true, b.anoBissexto(2000));
        assertEquals(false, b.anoBissexto(0));
    }
}
