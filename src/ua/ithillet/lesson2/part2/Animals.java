package ua.ithillet.lesson2.part2;

public class Animals {
    private int runDistance;
    private int maxRunDistance;
    private int swimDistance;
    private int maxSwimDistance;
    public String name;


    public Animals(String name) {
        this.name = name;
    }


    public void swim(int swimDistance) {
        if (0 <= swimDistance && swimDistance <= maxSwimDistance) {
            System.out.println(name + " проплив " + swimDistance + "м");
        } else if (swimDistance < 0) {
            System.out.println(name + " не вміє плавати від'ємні дистанції");
        } else {
            System.out.println(name + " не може проплисти " + swimDistance + "м");
        }
    }

    public void run(int runDistance) {
        if (0 <= runDistance && runDistance <= maxRunDistance) {
            System.out.println(name + " пробіг " + runDistance + "м");
        } else if (runDistance < 0) {
            System.out.println(name + " не вміє бігати від'ємні дистанції");
        } else {
            System.out.println(name + " не може пробігти " + runDistance + "м");
        }
    }
}
