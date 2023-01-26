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

        Dog dog = new Dog("Лорд");
        dog.run(20);
        dog.run(500);
        dog.run(600);
        Cat cat = new Cat("Пушок");
        cat.swim(20);
        cat.run(20);
        cat.run(20);
        cat.run(-20);
        cat.run(200);
        cat.run(210);

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

