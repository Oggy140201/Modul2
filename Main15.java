import java.util.Scanner;

public class Main15 {
    int width,height;

    public Main15(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int list(){
        return width * height;
    }
    @Override
    public String toString() {
        return "Main15{" +
                "width=" + width +
                ", height=" + height +
                '}';
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        int a = scanner.nextInt();
        System.out.println("Nhập b: ");
        int b = scanner.nextInt();
        Main15 ta = new Main15(a,b);
        System.out.println(ta);
        System.out.println("Đây là diện tích: " + ta.list());
    }

}