public class ReverseInteger {
    long rev = 0;

    public int reverse(int x) {

        while (x != 0) {
            rev = rev * 10 + x % 10;
            if (rev < Integer.MIN_VALUE || rev > Integer.MAX_VALUE) {
                return 0;
            }
            x = x / 10;
        }
        return (int) rev;
    }

}
