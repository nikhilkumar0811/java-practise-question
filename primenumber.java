import java.util.Scanner;

public class PrimeNumber {

    public static void main(String[] args) {
        System.out.println("enter the number you want to check prime or not ");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean isPrime = true;
        for (int i = 2; i < num / 2; i++) {
            if (num % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println(num + "is a prime number");
        } else {
            System.out.println(num + "is not a prime number");
        }
    }
}