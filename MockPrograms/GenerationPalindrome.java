package MockPrograms;

import java.util.Scanner;

public class GenerationPalindrome {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int temp = num;
        temp/=10;
        temp*=100;
    }
}
