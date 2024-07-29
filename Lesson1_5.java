import java.util.Scanner;

public class Lesson1_5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите число:");
        int a = input.nextInt();
        System.out.println("Введите число:");
        int b = input.nextInt();
        int sum = a + b;

        if (sum >= 10 && sum <= 20) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
