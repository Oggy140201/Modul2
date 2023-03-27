import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Tính chỉ số cân nặng của cơ thể: ");
        Scanner scanner = new Scanner(System.in);
        double weight, height, bmi;

        System.out.println("Nhập chiều cao đơn vị là m: ");
        height = scanner.nextDouble();
        System.out.println("Nhập cân nặng đơn vị là kg: ");
        weight = scanner.nextDouble();
        bmi = weight / (height * height);
        if (bmi < 18.5) {
            System.out.println("bmi của bạn là: " +  bmi + "Underwweight"  );
        } else if (bmi >= 18.5 && bmi < 25.0) {
            System.out.println("bmi của bạn là: " + bmi + "Normal");
        } if(bmi >= 25.0 && bmi < 30.0){
            System.out.println("bmi của bạn là: " + bmi + "Overweight");
        } else {
            System.out.println("bmi của bạn là: " + bmi + "Obese");
        }
    }
}
