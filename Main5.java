import java.util.Scanner;

public class Main5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double loan,interestrate,loanmonth;
        System.out.println("Nhập loan: ");
        loan = scanner.nextDouble();
        System.out.println("Nhập interestrate: ");
        interestrate = scanner.nextDouble();
        System.out.println("Nhập loanmonth: ");
        loanmonth = scanner.nextDouble();
        double tongvay = loan * ((interestrate/100)/12)*loanmonth;
        System.out.println(tongvay);
    }
}
