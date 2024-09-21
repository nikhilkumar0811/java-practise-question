import java.util.Scanner;

public class factorial {

    public static void main(String[] args) {
        System.out.println("enter number u want to check its factorial");
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        long factorial = 1;
        for (int i = 1; i <= num; i++) {
            factorial *= i;
        }
        System.out.println("factorial of" + num + "is:" + factorial);
    }
}