import java.util.Arrays;
import java.util.Scanner;

public class TpaProgramInversare {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        int[] numere = new int[5];

        for(int i = 0 ; i < numere.length ; i++ ) {
            System.out.println("Introdu elementul " + (i + 1) + " : ");
            numere[i] = scanner.nextInt();
        }

        System.out.println("Numerele introduse sunt : " + Arrays.toString(numere));


    }

}
