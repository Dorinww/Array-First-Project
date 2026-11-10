import java.util.Scanner;

public class TpaEx3 {

    //Ceva nu merge


    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introdu numerele: " );

    int number = scanner.nextInt();

    int[] numbers = new int[number];
    int sumaPare = 0 ;

        System.out.println("Introdu: ");

        for (int i = 0; i < number; i++){
            numbers[i] = scanner.nextInt();

            if(numbers[i] % 2 == 0) {
                sumaPare += numbers[i];
            }
        }



    }
}
