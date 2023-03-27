import javax.crypto.spec.PSource;

public class Main4 {
    public static void main(String[] args) {
        for(int i = 0;i <= 100;i++){
            if(checkPri(i) == true) {
                System.out.println(i);
            }
        }
    }
    public static boolean checkPri(int num) {
        if (num < 2) {
            return false;
        } else {
            for (int a = 2; a <= Math.sqrt(num); a++) {
                if (num % a == 0) {
                    return false;
                }
            }
            return true;
        }
    }
}


