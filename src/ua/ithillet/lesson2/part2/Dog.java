package ua.ithillet.lesson2.part2;

public class Dog extends Animals {


    public Dog(String name) {
        super(name);
    }



    @Override
    public void swim(int swimDistance) {
        if (0 <= swimDistance && swimDistance <= 10) {
            System.out.println(name + " проплив " + swimDistance + "м");
        } else if (swimDistance < 0) {
            System.out.println(name + " не вміє плавати від'ємні дистанції");
        } else {
            System.out.println(name + " не може проплисти " + swimDistance + "м");
        }
    }

    @Override
    public void run(int runDistance)  {
        if (0 <= runDistance && runDistance <= 500) {
            System.out.println(name + " пробіг " + runDistance + "м");
        } else if (runDistance < 0) {
            System.out.println(name + " не вміє бігати від'ємні дистанції");
        } else {
            System.out.println(name + " не може пробігти " + runDistance + "м");
        }
    }
}