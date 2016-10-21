/*
file name:Anagram
CreatedBy:Praveen T
CreatedDate:10/10/16
Purpose:One string is an anagram of another
*/
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first word : ");
        String word1 = sc.nextLine();
        System.out.print("Enter second word : ");
        String word2 = sc.nextLine();

        sc.close();

        System.out.println("Is Anagram : " + isAnagram(word1, word2));
    }

    private static boolean isAnagram(String word1, String word2) {

        if (word1.length() != word2.length()) {
            System.err.println("Words length didn't match!");
            return false;
        }

        char ch1, ch2;
        int len = word1.length(), sumOfWord1Chars = 0, sumOfWord2Chars = 0;

        for (int i = 0; i < len; i++) {
            ch1 = word1.charAt(i);
            if (word2.indexOf(ch1) < 0) {
                System.err.println("'" + ch1 + "' not found in \"" + word2
                        + "\"");
                return false;
            }
            sumOfWord1Chars += word1.charAt(i);

            ch2 = word2.charAt(i);
            if (word1.indexOf(ch2) < 0) {
                System.err.println("'" + ch2 + "' not found in \"" + word1
                        + "\"");
                return false;
            }
            sumOfWord2Chars += word2.charAt(i);
        }

        if (sumOfWord1Chars != sumOfWord2Chars) {
            System.err
                    .println("Sum of both words didn't match, i.e., words having same characters but with different counts!");
            return false;
        }

        return true;
    }
}
