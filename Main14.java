import java.util.Arrays;
import java.util.Scanner;

public class Main14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a = Integer.parseInt(scanner.nextLine());
        int[] arr = new int[a];
        for (int i = 0; i < a; i++) {
                System.out.println("Nhập phần tử thứ: " + i + "của mảng a: ");
                arr[i] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Nhập b: ");
        int b = Integer.parseInt(scanner.nextLine());
        int[] arrNew = new int[b];
        for (int j = 0; j < b; j++) {
            System.out.println("Nhập phần tử thứ: " + j + "của mảng b: ");
            arrNew[j] = Integer.parseInt(scanner.nextLine());
        }
        System.out.println(Arrays.toString(arrNew));

        System.out.println("Đây là mảng mới: ");
        int length = arr.length + arrNew.length;
        int []dom = new int[length];
        int off = 0;
        for (int on : arr){
            dom[off] = on;
            off++;
        }
        for(int on : arrNew ){
            dom[off] = on;
            off++;
        }
        System.out.println(Arrays.toString(dom));
    }
}
