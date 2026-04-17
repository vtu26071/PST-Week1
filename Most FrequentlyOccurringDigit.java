import java.util.*
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        int[] freq = new int[10];
        if (n == 0) {
            System.out.println(0);
           return;
        }
        n = Math.abs(n);
        while (n > 0) {
            int digit = (int)(n % 10);
            freq[digit]++;
            n /= 10;
        }
        int maxFreq = 0;
        int digit = 0
        for (int i = 0; i < 10; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                digit = i;
            }
        }
        System.out.println(digit);
    }
}

