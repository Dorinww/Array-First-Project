import java.util.Arrays;

public class Ex3 {
    static void main() {
        String [] culori = {"Albastru" , "Verde" , "Galben"};
        System.out.println(Arrays.toString(culori));

        culori[2] = "Portocaliu";
        System.out.println(Arrays.toString(culori));

        System.out.println(culori.length);
    }
}
