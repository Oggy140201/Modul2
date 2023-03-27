import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ứng dụng chuyển đổi tiền tệ: ");
        System.out.println("Mời bạn nhập VNG: ");
        float VND = scanner.nextFloat();
        float a = VND / 23000;
        System.out.println("GTCĐL: " + a);

    }
}
