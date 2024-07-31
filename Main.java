public class Main {
    public static void main(String[] args) {
        Worker [] persArray = new Worker[5];
        persArray[0] = new Worker("Петров", "Андрей", "Михайлович", "Инженер", "andrew@mail.ru", "+7(999)999-99-99", 50000, 56 );
        persArray[1] = new Worker("Иванов", "Олег", "Павлович", "Программист", "oleg@mail.ru", "+7(912)999-99-99", 100000, 19 );
        persArray[2] = new Worker("Артемьев", "Максим", "Андреевич", "HR", "maxim@mail.ru", "+7(922)999-99-99", 70000, 25 );
        persArray[3] = new Worker("Лебедев", "Петр", "Алексеевич", "Уборщик", "petr@mail.ru", "+7(920)999-99-99", 30000, 30 );
        persArray[4] = new Worker("Михеев", "Александр", "Витальевич", "Директор", "aleksandr@mail.ru", "+7(919)999-99-99", 200000, 45 );

        for (Worker pers : persArray) {
            pers.showInfo();;
            System.out.println();
        }
    }
}
