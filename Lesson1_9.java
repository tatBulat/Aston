import java.util.Scanner;

public class Lesson1_9 {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.println("Введите год:");
        int year = input.nextInt();

        if (year % 4 == 0 && year % 100!= 0 || year % 400 == 0){
            System.out.println(true);
        } else {
            System.out.println(false);
        }
    }
}
