import java.util.Arrays;
import java.util.Scanner;

public class Main12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = {1, 1, 3, 5, 7, 7, 8, 9, 9};
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhập pt cần xóa: ");
        int a = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == a ) {
                for (int j = i;j < arr.length - 1;j++){
                    arr[j] = arr[j + 1];
                }
                arr[arr.length - 1] = 0;
                i--;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
