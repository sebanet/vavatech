public class silnia {

    public static int silniaIteracyjnie(int liczba) {
        int wynik = 1;
        for (int i=2; i<=liczba; i++){ //KOMANTARZ
            wynik = i * wynik;
        }
        return wynik;
    }
        public static int silniaRekurencyjnie(int liczba){
            if (liczba == 1){
                return 1;
            }
            return liczba * silniaRekurencyjnie(liczba -1);
        }
}