import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main8 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8};
        System.out.println(Arrays.toString(arr));
        int []arrNew = new int[arr.length];
        for (int i = 0, j = arr.length - 1; i < arr.length; i++, j--) {
            arrNew[i] = arr[j];
        }
        System.out.println(Arrays.toString(arrNew));
    }
}
