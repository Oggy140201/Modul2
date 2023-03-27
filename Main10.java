import java.util.Scanner;

public class Main10 {
    public static void main(String[] args) {//chuyển đổi nhiệt độ
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập: ");
        double fahrenheit;
        double celsius;
        fahrenheit = scanner.nextInt();
        celsius = (5.0 / 9) * (fahrenheit - 32);
        System.out.println("Đây là độ C: " + celsius);
        double celsiuso;
        double fahrenheitt;
        celsiuso = scanner.nextInt();
        fahrenheitt = (celsiuso*9 / 5) + 32;
        System.out.println("Đây là độ F: " + fahrenheitt);
    }
}
