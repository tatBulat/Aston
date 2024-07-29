import java.util.Scanner;

public class Lesson1_7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите число:");
        int a = input.nextInt();

        if (a >= 0) {
            System.out.println(false);
        } else {
            System.out.println(true);
        }
    }
}