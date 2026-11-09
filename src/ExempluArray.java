
        public class ExempluArray {
            static void main() {


                String prenume = "Ion";
                String nume = "Muntean";
                String hobby = "fotbal";
                String oras = "Kiev";  // camp (field)

            }
                //  ==
                // arr unidimensional
                //                              [0]     [1]        [2]       [3]
                static String[] personInfo = {"Ion", "Muntean", "shdgcv", "bbbbbbbbb",};

            public static void main(String[] args) {
                // System.out.println(oras);  // Kiev

                // index
                //System.out.println(personInfo[3]);  // Kiev

                // first elem
                System.out.println(personInfo[0]);

                // last elem
                System.out.println("Ultimul element: " + personInfo[personInfo.length - 1]);

                // lungimea (length - cantitatea)
                System.out.println(personInfo.length);


            }


        }