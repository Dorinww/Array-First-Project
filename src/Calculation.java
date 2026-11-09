public class Calculation {
    static void main() {

        double numere[] = {10.1 , 11.2 , 12.3 , 13.4 , 14.5};
        double rezultat = 0 ;
        int i;

        for(i = 0 ; i<5 ; i++)
            rezultat = rezultat+numere[i];
        System.out.println("Media tabloului numerelor este egala cu " + rezultat/5);
    }
}
