import java.util.Arrays;
import java.util.Scanner;

public class Main9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập độ dài của mảng: ");
        int a = scanner.nextInt();
        int[] arr = new int[a];
        for(int i = 0; i < a;i++){
            System.out.println("Nhập giá trị thứ: " + i);
            arr[i] = scanner.nextInt();
        }
        System.out.println(Arrays.toString(arr));
//        int []arrNew = new int[arr.length];
//        for(int j = 0,x = arr.length - 1; j < arr.length;x--,j++){
//            arrNew[j] = arr[x];
//        }
//        System.out.println("Đây là mảng ngược: ");
//        System.out.println(Arrays.toString(arrNew));
    }
}
