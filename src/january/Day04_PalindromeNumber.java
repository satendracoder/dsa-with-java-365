package january;

public class Day04_PalindromeNumber {
    public static void main(String[] args) {
        int number = 121;
        int original = number;
        int reverse = 0;

        while (number !=0){
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number = number/10;
        }

        if (original==reverse){
            System.out.println(original + "is a Palindrome number");
        } else {
            System.out.println(original + "is not a Palindrome number");
        }
    }
}


//For leet code
//
//class Solution {
//    public boolean isPalindrome(int x) {
//        if (x < 0) return false;
//        int original = x;
//        int reverse = 0;
//
//        while (x !=0){
//            int digit = x % 10;
//            reverse = reverse * 10 + digit;
//            x = x/10;
//        }
//        return original == reverse;
//    }
//}
