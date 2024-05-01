
public class PrimeNo {

    public static boolean primeno(int n) {

        for (int i = 1; i < Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {
        int n = 2;
        boolean ans = (primeno(n));
        if (n != 1 && ans == true) {
            System.out.println("Prime No.");
        } else {
            System.out.println("Not a Prime no.");
        }

    }
}
