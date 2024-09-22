import java.util.Scanner;

public class fibonacci {

    public static void main(String[] args) {
        int firstnum = 0, secondnum = 1;
        System.out.println("enter the number");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        for (int i = 1; i <= n; i++) {
            System.out.print(firstnum + ",");
            int nextnum = firstnum + secondnum;
            firstnum = secondnum;
            secondnum = nextnum;
        }
    }
}