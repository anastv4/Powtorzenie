import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SzyfryTest {

    @Test
    void testszyfrujCezaremKluczDodatniMniejszyOdDlugosciAlfabetu() {
        Assertions.assertEquals("def", Szyfry.szyfrujCezarem("abc", 3));
    }
    @Test
    void testszyfrujCezaremZawijanie() {
        Assertions.assertEquals("abc", Szyfry.szyfrujCezarem("xyz", 3));
    }
    @Test
    void testszyfrujCezaremOdszyfrowanieKluczUjemny() {
        Assertions.assertEquals("abc", Szyfry.szyfrujCezarem("def", -3));
    }
    @Test
    void testszyfrujCezaremKluczWiekszyDlugosciAlfabetu() {
        Assertions.assertEquals("def", Szyfry.szyfrujCezarem("abc", 29));
    }
    @Test
    void testszyfrujCezaremTekstspacja() {
        Assertions.assertEquals("cd ef", Szyfry.szyfrujCezarem("ab cd", 2));
    }
    @Test
    void tekstSzyfrCezaremKluczUjemnyZawijanie(){
        Assertions.assertEquals("xyz", Szyfry.szyfrujCezarem("abc", -3));
    }
}