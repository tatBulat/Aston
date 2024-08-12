public class Main {
    public static void main(String[] args) {
        Cat cat1 = new Cat("Мурзик");
        Cat cat2 = new Cat("Барсик");
        Dog dog1 = new Dog("Бобик");

        cat1.run(150);
        cat2.run(250);

        dog1.run(300);
        dog1.swim(5);

        cat1.swim(10);
        dog1.swim(15);

        Cat.addFoodToBowl(15);
        cat1.eat(5);

        Cat.checkCats();
        Dog.checkDogs();
    }
}