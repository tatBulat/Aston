class Animal {
    String name;

    Animal(String name) {
        this.name = name;
    }

    void run(int distance) {
        System.out.println(name + " пробежал " + distance + " м.");
    }

    void swim(int distance) {
        System.out.println(name + " проплыл " + distance + " м.");
    }
}