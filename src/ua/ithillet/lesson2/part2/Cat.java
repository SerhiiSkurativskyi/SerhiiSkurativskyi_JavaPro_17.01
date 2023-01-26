package ua.ithillet.lesson2.part2;

public class Cat extends Animals {

    public Cat(String name) {
        super(name);
    }
    @Override
    public void swim(int swimDistance) {
        System.out.println(name + " потонув");
           }

    @Override
    public void run(int runDistance){
        if (0 <= runDistance && runDistance <= 200) {
            System.out.println(name + " пробіг " + runDistance + "м");
        } else if (runDistance < 0) {
            System.out.println(name + " не вміє бігати від'ємні дистанції");
        } else {
            System.out.println(name + " не може пробігти " + runDistance + "м");
        }
    }
}

