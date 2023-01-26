package ua.ithillet.lesson2.part3;

public class Triangle implements Area {
    private final double height;
    private final double width;

    public Triangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    @Override
    public double area() {
        return height * width * 0.5;
               }
}

