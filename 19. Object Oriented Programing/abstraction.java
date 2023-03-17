// Implimentation of abstract class

public class abstraction {
    public static void main(String args[]){
        //Animal a = new Animal();  -- we can't able to create object for abstarct class

        pegion p = new pegion();
        p.eats();
        p.walk();

        
    }
}

abstract class Animal{
    Animal(){
        System.out.println("Class Animal constructor called");
    }
    void eats(){
        System.out.println("Animal Eats");
    }
    abstract void walk();
}

class cats extends Animal{
    cats(){
        System.out.println("Cats constructor is called");
    }
    void walk(){
        System.out.println("cats walk on 4 legs");
    }
}

class pegion extends Animal{
    pegion(){
        System.out.println("Pegion constructor called");
    }
    void walk(){
        System.out.println("Pegion walks on 2 legs");
    }
}
