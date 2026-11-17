import java.util.Arrays;

public class TemaPentruAcasaEx2 {
    static void main() {

        int[] aryNums = {24 , 6 , 47 , 35 , 2 , 14 };

        int i;
        int arrayTotal = 0 ;
        int media = 0 ;


        for(i = 0 ; i < aryNums.length ; i++){

            arrayTotal = arrayTotal + aryNums[ i ];



        }

        media = arrayTotal / aryNums.length ;

        System.out.println("Total : " + media);


        Arrays.sort(aryNums);

        int number = aryNums[aryNums.length - 1 ];


        System.out.println("Cel mai mare numar este : " + number );

    }
}
