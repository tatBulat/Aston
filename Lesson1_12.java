public class Lesson1_12 {
    public static void main(String[] args) {
        int array[] = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};

        for (int i = 0; i < array.length; i++) {
            if (array[i] < 6) {
                array[i] = array[i] * 2;
            }
        }

        for (int i: array) {
            System.out.print(i + " ");

        }
    }
}
