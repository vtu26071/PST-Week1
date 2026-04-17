import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        boolean[] seen = new boolean[10];
        if (n == 0) {
            System.out.println(1);
            return;
        }
        n = Math.abs(n);
        while (n > 0) {
            int digit = (int)(n % 10);
            seen[digit] = true;
            n /= 10;
        }
        int count = 0;
        for (boolean v : seen) {
            if (v) count++;
        }
        System.out.println(count);
    }
}

