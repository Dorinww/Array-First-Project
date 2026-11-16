public class Exemplu7 {

    public static void main() {
        int[] arr = {2 , 5 , 6 , 1 , 3};

        System.out.println("Min = " + min(arr));
        System.out.println("Max = " + max(arr));

    }

    public static int max(int[] arr) {
        int x = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(x < arr[i]) x = arr[i];
        }
        return x;
    }

    public static int min(int[] arr) {
        int x = arr[0];
        for(int i = 0; i < arr.length; i++){
            if(x > arr[i]) x = arr[i];
        }
        return x;
    }
}
