import java.util.Scanner;

public class TpaProgramUsername {
    static void main() {


        Scanner scanner = new Scanner(System.in);

        //Aflam cate note o sa fie introduse
        System.out.println("Cate note vor fi introduse ?");
        int numarnote = scanner.nextInt();
        double[] note = new double[numarnote];

        double suma = 0 ;

        //Cititm si adunam la suma

        for(int i = 0 ; i < note.length ; i++){
        System.out.println("Introdu nota " + (i + 1) +": " ) ;
        note[i] = scanner.nextDouble();

        suma = suma + note[i];
        }

        //Calculam media

        double media = suma / note.length;
        System.out.println("Media notelor este : " + media );


    }
}
