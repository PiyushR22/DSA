
public class stringpalindrom {

    static boolean ispalindrom(String s, int i, int n) {
        if (i >= n / 2)
            return true;
        if (s.charAt(i) != s.charAt(n - i - 1))
            return false;
        return ispalindrom(s, i + 1, n);

    }

    public static void main(String[] args) {
        String s = new String("MADAM");
        int length = s.length();

        boolean result = ispalindrom(s, 0, length);
        if (result) {
            System.out.println(s + " is a palindrom String");
        } else {
            System.out.println(s + " is not a palindrom String");
        }
    }

}
