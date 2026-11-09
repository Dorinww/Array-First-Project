import java.util.Arrays;

public class Ex4 {
    static void main() {



        int [] numbers = {10 , 30 , 40 , 70 , 90};

        numbers = new int[5];

        System.out.println(Arrays.toString(numbers));


        System.out.println(numbers.length);

        numbers[0] = 10;
        System.out.println(numbers[0]);

        numbers[numbers.length - 1]= 99;
        System.out.println(Arrays.toString(numbers));


    }

}
