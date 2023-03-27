import java.util.Arrays;
import java.util.Scanner;

public class Main11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int []arr = {11,76,647,81267,7326134,32423,9};
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        for (int i = 0;i < arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        System.out.println("Đây là phần tử nhỏ nhất trong mảng: " + min);
    }
}
