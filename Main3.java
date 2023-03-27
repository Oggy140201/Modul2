import java.util.ArrayList;
import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        String number = "hundred";
        String list1[] = {"no", "no", "twenty", "thirty", "forty", "fifty", "sixty", "seventy", "eighty", "ninety"};
        String list[] = {null, "one", "two", "three", "four", "five", "six", "seven", "eight", "nice", "ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen", "nineteen", "twenty"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời bạn nhập số: ");
        int a = Integer.parseInt(scanner.nextLine());
        int b = a / 100;
        int c = a % 100;
        int d = a / 10;
        int e = a % 10;
        int f = c / 10;
        int g = c % 10;
        if (a <= 20) {
            System.out.println(list[a]);
        }
        if (a > 20 && a <= 99) {
            System.out.println(list1[d] + list[e]);
        }
        if (a >= 100 && a <= 999 && c <= 20) {
            System.out.println(list[b] + number + list[c]);
        }
        if (c >= 20 && c <= 99 && a >= 100 && a <= 999) {
            System.out.println(list[b] + number + list1[f] + list[g]);
        }
    }
}
