package simple.basic.questions;

/**
 * Created by Sandeep Belgavi on 6/30/2021
 */
public class Palindrome {
    public static void main(String[] args) {
    System.out.println("Is panlindrome ==>"+checkIsNumberPalindrome(121));
    System.out.println("Is panlindrome ==>"+checkIsNumberPalindrome(12));
    System.out.println("Is panlindrome ==>"+checkIsStringPalindrome("aabaa"));
    System.out.println("Is panlindrome ==>"+checkIsStringPalindrome("abbacb"));
    }
    private static boolean checkIsStringPalindrome(String stringForChecking){
        if(stringForChecking == null || stringForChecking.length() ==0){
            return false;
        }

        int i =0;
        int j =stringForChecking.length()-1;
        while(i<j){
            if(stringForChecking.charAt(i)!=stringForChecking.charAt(j)){
                return false;
            }
            i++;
            j--;
        }

        return true;
    }
    private static boolean checkIsNumberPalindrome(int numberForChecking){
        int temp,sum = 0;
        int originalValue = numberForChecking;
        while(numberForChecking > 0){
            temp = numberForChecking % 10;
            sum = (sum * 10) + temp;
            numberForChecking = numberForChecking / 10;
        }
        if ( originalValue == sum) {
            return true;
        }
        return false;
    }
}
