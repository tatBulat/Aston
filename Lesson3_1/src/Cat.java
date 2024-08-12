class Cat extends Animal {
    static int catCount = 0;
    private boolean isHungry;
    private static int bowlFood = 10;

    Cat(String name) {
        super(name);
        isHungry = true;
        catCount++;
    }

    @Override
    void run(int distance) {
        if (distance <= 200) {
            super.run(distance);
        } else {
            System.out.println(name + " не может бежать столько.");
        }
    }

    @Override
    void swim(int distance) {
        System.out.println(name + " не умеет плавать.");
    }

    void eat(int foodAmount) {
        if (isHungry && bowlFood >= foodAmount) {
            bowlFood -= foodAmount;
            isHungry = false;
            System.out.println(name + " покушал и больше не голоден.");
        } else if (bowlFood < foodAmount) {
            System.out.println("В миске недостаточно еды для " + name);
        } else {
            System.out.println(name + " не голоден.");
        }
    }

    static void addFoodToBowl(int foodAmount) {
        bowlFood += foodAmount;
        System.out.println("Добавлено " + foodAmount + " еды в миску. Сейчас в миске " + bowlFood + " еды.");
    }

    static void checkCats() {
        System.out.println("Всего создано котов: " + catCount);
    }
}
