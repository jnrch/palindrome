package palindromo;

import java.util.Scanner;

public class Palindrome {

    public static void main(String[] args) {
        int number;

        System.out.println("Enter a number to get the closest prime palindrome:");
        Scanner scanner = new Scanner(System.in);

        number = Integer.parseInt(scanner.next());
        for (int i = number; i <= 2000000; i++) {
            if (isPalindrome(i) && isPrime(i)) {
                    System.out.println("The closest prime palindrome for number " + number + " is: " + i);
                    break;
            }
        }
    }

    private static boolean isPalindrome(int number) {
        String stringNumber = Integer.toString(number);
        StringBuilder stringBuilderNumberTwo = new StringBuilder();
        int stringNumbersLength = stringNumber.length()-1;

        for(int j = stringNumbersLength; j >= 0; j--) {
            stringBuilderNumberTwo.append(stringNumber.charAt(j));
        }
        return stringNumber.equals(stringBuilderNumberTwo.toString());
    }

    private static boolean isPrime(int number) {

        boolean isPrime = true;

        for(int i=3; i <= number/2; i+=2) {
            if (number % i == 0 || number % 2 == 0) {
                isPrime = false;
                break;
            }
        }
        return isPrime;
    }
}
