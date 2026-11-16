public class Ex6 {
    static void main() {
        String[][] animals = new String[3][5];

        animals[1][2] = new String ("Tiger");

        for (int i = 0; i < animals.length; i++){
            for(int j = 0 ; j < animals[i].length ; j++) {

                System.out.print(animals[i][j] + " ");

            }
            System.out.println();
        }

    }

}
