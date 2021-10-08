package checkPalindrome;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // should return true
        System.out.println(checkForPalindrome("abccba"));
        // should return true
        System.out.println(checkForPalindrome("Was it a car or a cat I saw?"));
        // should return true
        System.out.println(checkForPalindrome("I did, did I?"));
        // should return false
        System.out.println(checkForPalindrome("hello"));
        // should return true
        System.out.println(checkForPalindrome("Don't nod"));
    }

    public static boolean checkForPalindrome(String string) {
    	string = string.replaceAll("[^A-Za-z]+", "").toLowerCase();
    	char[] original = string.toCharArray();
    	char[] reverse = string.toCharArray();
    	 int left;
         int right = string.length() - 1;
         for (left = 0; left < right; left++, right--) {
             // Swap values of left and right
             char temp = reverse[left];
             reverse[left] = reverse[right];
             reverse[right] = temp;
         }
       System.out.println(reverse);
          System.out.println(original);
         if(Arrays.equals(original, reverse)) {
        	 return true;
         }
         else {
         return false;
         }
    
}
}
