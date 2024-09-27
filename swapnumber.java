import java.util.Scanner;

public class swapnumber {
    public static void main(String[] args) {
        System.out.println("enter a ");
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println("enter b ");

        int b = scanner.nextInt();
        System.out.println("Before swap number:a=" + a + "b=" + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("after swap number:a=" + a + "b=" + b);

    }

}
