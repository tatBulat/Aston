class Dog extends Animal {
    static int dogCount = 0;

    Dog(String name) {
        super(name);
        dogCount++;
    }

    @Override
    void run(int distance) {
        if (distance <= 500) {
            super.run(distance);
        } else {
            System.out.println(name + " не может бежать столько.");
        }
    }

    @Override
    void swim(int distance) {
        if (distance <= 10) {
            super.swim(distance);
        } else {
            System.out.println(name + " не может плыть столько.");
        }
    }

    static void checkDogs() {
        System.out.println("Всего создано собак: " + dogCount);
    }
}
