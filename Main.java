
public class Main {
    public static void main(String[] args) {
        checkSumSign();
    }

    public static void checkSumSign() {
        int a = -9, b = 7;
        if (a + b >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }
}
