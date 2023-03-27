import java.util.Scanner;

public class Main6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Tìm ước chung lớn nhất: ");
        int num1, num2;
        System.out.println("Đây là ước 1: ");
        num1 = scanner.nextInt();
        System.out.println("Đây là ước 2: ");
        num2 = scanner.nextInt();
        for (int i = num1; i >= 1 ; i--) {
            if(num1 % i == 0  && num2 % i == 0){
                System.out.println("Đây là ước chung lớn nhất: " + i);
                return;
            }
        }
    }
}
