package baitapsolid;

/* 
class Bird {
    public void fly() {
        System.out.println("Bay lên trời!");
    }
}
class Ostrich extends Bird {
    // Đà điểu không biết bay!
}
*/
abstract class Bird {
    abstract void eat();

}

abstract class FlyingBird {
    abstract void fly();

}

class Ostrich extends Bird {
    public void eat() {
        System.out.println("an");
    }
}

class Eagle extends FlyingBird {
    public void eat() {
        System.out.println("an");

    }

    public void fly() {
        System.out.println("bay");
    }
}

public class bai2 {
    public static void main(String[] args) {
        Ostrich s1 = new Ostrich();
        Eagle s2 = new Eagle();
        s1.eat();
        s2.eat();
        s2.fly();
    }
}
