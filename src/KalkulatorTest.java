import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class KalkulatorTest {

    @org.junit.jupiter.api.Test
    void testsumaJezeliSumaLiczbCalkowitych() {
        Assertions.assertEquals(5, Kalkulator.suma(2,3));
    }
    @Test
    void testPodzielJezeliWynikCalkowity(){
        Assertions.assertEquals(3, Kalkulator.podziel(12, 4));

    }
    @Test
    void testPodzielJezeliWynikRzeczewiste(){
        Assertions.assertEquals(2.5,Kalkulator.podziel(10,4));
    }
    @Test
    void testCzyPierwszaJezeliAniPierwszaAniZlozona(){
        Assertions.assertFalse(Kalkulator.czyPierwsze(1));
    }
    @Test
    void testPierwszaJezeliParzytaPierwsza(){
        Assertions.assertTrue(Kalkulator.czyPierwsze(2));
    }
    @Test
    void testPierwszaJezeliKwadratLiczbyPierwszej(){
        Assertions.assertFalse(Kalkulator.czyPierwsze(25));
    }
    @Test
    void testCzyPierwszaJezeliPierwszaWiekszaOd2(){
        Assertions.assertTrue(Kalkulator.czyPierwsze(17));
    }
    @Test
    void testCzyPierwszaJezeliLiczbaZlozona(){
        Assertions.assertFalse(Kalkulator.czyPierwsze(10));
    }
}