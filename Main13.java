import java.util.Arrays;
import java.util.Scanner;

public class Main13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng: ");
        int a = Integer.parseInt(scanner.nextLine());
        int []arr = new int[a];
        for (int i = 0;i < a;i++){
            System.out.println("Nhập phần tử thứ: " + i);
            arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
    }
}
