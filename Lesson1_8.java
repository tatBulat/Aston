import java.util.Scanner;

public class Lesson1_8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введите число:");
        int num = input.nextInt();
        input.nextLine();
        System.out.println("Введите строку:");
        String str = input.nextLine();

        for (int i = 0; i != num; i++) {
            System.out.println(str);
        }
    }
}
