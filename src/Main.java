import ua.ithillet.lesson2.part1.Car;
import ua.ithillet.lesson2.part1.Employee;
import ua.ithillet.lesson2.part2.Cat;
import ua.ithillet.lesson2.part2.Dog;
import ua.ithillet.lesson2.part3.Area;
import ua.ithillet.lesson2.part3.Circle;
import ua.ithillet.lesson2.part3.Rectangle;
import ua.ithillet.lesson2.part3.Triangle;


public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Ткачук Петро Іванович", "Фінансовий консультант",
                "tk.fin@gmail.com", "+38067555555", 35);

        Car car = new Car();
        car.start();

        Dog dog = new Dog("Лорд");

        Cat cat = new Cat("Пушок");


        Area[] areas = {new Circle(25),
                new Rectangle(56, 74),
                new Triangle(85, 41)};
        double sum = 0;
        for (Area area : areas) {
            sum += area.area();
        }
        System.out.println("Сумма площ фігур = " + sum);
    }
}

