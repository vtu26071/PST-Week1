import java.util.*;
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] words = s.trim().split("\\s+");
        if (words.length < 2) {
            return;
        }
        System.out.println(words[1].toUpperCase());
    }
}
