import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int L = sc.nextInt();
        int R = sc.nextInt();
        if (R < 2) {
            System.out.println(0);
            return;
        }
        boolean[] isPrime = new boolean[R + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = false;
        isPrime[1] = false;
        for (int i = 2; i * i <= R; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= R; j += i) {
                    isPrime[j] = false;
                }
            }
        }
        int count = 0;
        for (int i = L; i <= R; i++) {
            if (isPrime[i]) {
                count++;
            }
          }
        System.out.println(count);
    }
}
