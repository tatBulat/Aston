interface Shape {
    double calculatePerimeter();
    double calculateArea();
    void setFillColor(String color);
    void setBorderColor(String color);
    void printCharacteristics();

    default double calculateDefaultPerimeter() {
        return 0;
    }
}