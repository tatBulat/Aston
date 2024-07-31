public class Worker {
    String surname;
    String name;
    String patronymic;
    String position;
    String email;
    String phone;
    int salary;
    int age;

    public Worker(String surname, String name, String patronymic, String position, String email, String phone, int salary, int age) {
        this.surname = surname;
        this.name = name;
        this.patronymic = patronymic;
        this.position = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    void showInfo() {
        System.out.println("Surname: " + surname);
        System.out.println("Name: " + name);
        System.out.println("Patronymic: " + patronymic);
        System.out.println("Position: " + position);
        System.out.println("Email: " + email);
        System.out.println("Phone: " + phone);
        System.out.println("Salary: " + salary + "$");
        System.out.println("Age: " + age);
    }
}

