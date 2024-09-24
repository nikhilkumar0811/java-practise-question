import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        int number;
        System.out.println("enter the number:");
        Scanner scanner = new Scanner(System.in);
        number = scanner.nextInt();
        int reverse = 0, temp = number;
        while (temp > 0) {
            int remainder = temp % 10;
            reverse = reverse * 10 + remainder;
            temp = temp / 10;
        }
        if (number == reverse) {
            System.out.println("it is a palindrome number");

        } else {
            System.out.println("it is not a palindrome number");
        }
    }

}
