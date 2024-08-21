public class Cat extends Animal {
    private static int catCount = 0;
    private boolean isFull = false;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    @Override
    public void run(int distance) {
        if (distance <= 200) {
            System.out.println(name + " пробежал " + distance + " м.");
        } else {
            System.out.println(name + " не смог пробежать " + distance + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    public void eat(int foodAmount) {
        if (foodAmount > 0) {
            System.out.println(name + " съел " + foodAmount + " единиц еды.");
            isFull = true;
        } else {
            System.out.println(name + " не нашел еду.");
        }
    }

    public static void addFoodToBowl(int foodAmount) {
    }

    public static void checkCats() {
        System.out.println("Всего создано котов: " + catCount);
    }
}
