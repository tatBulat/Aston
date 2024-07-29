import java.util.Scanner;

public class Lesson1_6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите число:");
        int a = input.nextInt();

        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
}