import java.util.ArrayList;

public class PhoneBook {
    public static void main(String[] args) {
        ArrayList<String> surnames = new ArrayList<>();
        ArrayList<String> phoneNumbers = new ArrayList<>();

        surnames.add("Иванов");
        phoneNumbers.add("123-456-789");

        surnames.add("Иванов");
        phoneNumbers.add("987-654-321");

        surnames.add("Петров");
        phoneNumbers.add("555-555-555");

        surnames.add("Сидоров");
        phoneNumbers.add("333-333-333");

        String searchSurname = "Иванов";
        System.out.println("Телефоны " + searchSurname + "a" + ":");
        for (int i = 0; i < surnames.size(); i++) {
            if (surnames.get(i).equals(searchSurname)) {
                System.out.println(phoneNumbers.get(i));
            }
        }

        searchSurname = "Петров";
        System.out.println("Телефоны " + searchSurname + "a" + ":");
        for (int i = 0; i < surnames.size(); i++) {
            if (surnames.get(i).equals(searchSurname)) {
                System.out.println(phoneNumbers.get(i));
            }
        }

        searchSurname = "Сидоров";
        System.out.println("Телефоны " + searchSurname + "a" + ":");
        for (int i = 0; i < surnames.size(); i++) {
            if (surnames.get(i).equals(searchSurname)) {
                System.out.println(phoneNumbers.get(i));
            }
        }

        searchSurname = "Неизвестные";
        System.out.println(searchSurname + " телефоны" + ":");
        boolean found = false;
        for (int i = 0; i < surnames.size(); i++) {
            if (surnames.get(i).equals(searchSurname)) {
                System.out.println(phoneNumbers.get(i));
                found = true;
            }
        }
        if (!found) {
            System.out.println("Не найдено");
        }
    }
}