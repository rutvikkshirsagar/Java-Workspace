// Inheriting derived class from base class
public class single_level_inheritance {
    public static void main(String args[]){
        Fish f1 = new Fish();
        f1.eat();
        f1.sleep();
        System.out.println(f1.fins_count);
    }
}


class Animal{
    String name;
    int lifeSpan;

    void eat(){
        System.out.println("Eats");
    }
    void sleep(){
        System.out.println("Sleeps");
    }
}

class Fish extends Animal{
    int fins_count;

    void smin(){
        System.out.println("Swims");
    }
}
