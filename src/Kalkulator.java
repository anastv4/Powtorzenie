public class Kalkulator {
    public static int suma(int a, int b){
        return  a+b;
    }
    public static  double podziel(int a, int b){
        return a/(double)b;
    }

    //TDD - test drive development
    //napierw testy a potem program tak dlugo az zadzialaja testy
    public static  boolean czyPierwsze(int liczba){
        if(liczba ==2){
            return  false;
        }
        if(liczba == 2){
            return true;
        }


        int pierwiastek =1;
        while(pierwiastek*pierwiastek<liczba){
            pierwiastek++;
        }
        for(int i = 2; i <liczba; i++){
            if(liczba%i == 0)
                return false;
        }

        return true;
    }
}
