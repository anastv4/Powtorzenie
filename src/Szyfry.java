import javax.xml.crypto.dsig.spec.XSLTTransformParameterSpec;

public class Szyfry {
    public static String szyfrujCezarem(String tekstDoSzyfrowania, int klucz){
        String zaszyfrowane = "";
        klucz = klucz%26;
        for(int i =0; i < tekstDoSzyfrowania.length(); i++){
            char literka = tekstDoSzyfrowania.charAt(i);
            if(literka == ' '){
                zaszyfrowane = zaszyfrowane+ ' ';
            }else {
                int kod_przesuniety = (int) literka + klucz;
                if(kod_przesuniety > (int)'z'){
                    kod_przesuniety = kod_przesuniety -26;
                }else if(kod_przesuniety<(int)'a'){
                    kod_przesuniety = kod_przesuniety + 26;
                }
                zaszyfrowane = zaszyfrowane + (char) kod_przesuniety;
            }
        }
        return zaszyfrowane;

    }
}
