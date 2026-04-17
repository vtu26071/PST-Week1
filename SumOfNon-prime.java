import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        boolean[] isPrime = new boolean[n];
        Arrays.fill(isPrime, true);
        if (n > 0) isPrime[0] = false;
        if (n > 1) isPrime[1] = false;
        for (int i = 2; i * i < n; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j < n; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        long sum = 0;
        for (int i = 0; i < n; i++) {
            if (!isPrime[i]) {
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
}
