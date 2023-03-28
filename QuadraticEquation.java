import java.sql.SQLOutput;
import java.util.Scanner;

public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public double getB() {
        return b;
    }

    public double getC() {
        return c;
    }

    public static double getDiscriminant(double a, double b, double c) {
        double delta=(b * b) - (4 * a * c);
        return delta;
    }

    public static double getRoot1(double a, double b, double c) {
        double X1=(-b + Math.pow((b * b - 4 * a * c), 0.5)) / 2 * a;
        return X1;
    }

    public static double getRoot2(double a, double b, double c) {
        double X2= (-b - Math.pow((b * b - 4 * a * c), 0.5)) / 2 * a;
        return X2;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số a");
        double a = scanner.nextDouble();
        System.out.println("Mời bạn nhập số b");
        double b = scanner.nextDouble();
        System.out.println("Mời bạn nhập số c");
        double c = scanner.nextDouble();
        if (QuadraticEquation.getDiscriminant(a, b, c) == 0) {
//            System.out.println(QuadraticEquation.getDiscriminant(a,b,c));
            System.out.println(QuadraticEquation.getRoot1(a, b, c));
//            QuadraticEquation.getRoot1(a, b, c);
        }else if (QuadraticEquation.getDiscriminant(a,b,c)>0){
//            System.out.println(QuadraticEquation.getDiscriminant(a,b,c));
            System.out.println(QuadraticEquation.getRoot1(a,b,c));
            System.out.println(QuadraticEquation.getRoot2(a,b,c));
//            QuadraticEquation.getRoot1(a,b,c);
//            QuadraticEquation.getRoot2(a,b,c);
        }else if (QuadraticEquation.getDiscriminant(a, b, c) < 0){
            System.out.println("The equation has no roots");
        }
    }
}
