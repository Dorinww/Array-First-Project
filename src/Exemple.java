public class Exemple {
    static void main() {
        int [] numbers = new int [5];


        //for ul nostru are 2 responsabilitati
        // -- populare
        //- display

        for(int i = 0; i<numbers.length; i++){
            numbers[i] = i*10;
            System.out.println(numbers[i]);

            //afisare
            for(int number : numbers);
            System.out.println(numbers);
        }
    }
}
// trebuie sa facem sub forma de for each!
// sa avem 2 fore each-uri (unul populare altul afisare)