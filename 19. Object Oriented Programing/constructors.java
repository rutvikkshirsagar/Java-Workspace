// types of constructor

public class constructors {
    public static void main(String args[]){
        student s1 = new student();

        student s2 = new student("Rutvik",22);
        s2.marks[0] = 90;
        s2.marks[1] = 92;
        s2.marks[2] = 100;

        student s3 = new student(s2);

        
        s1.display();
        s2.display();
        s3.display();
        System.out.println();
        s2.marks[0] = 100;
        for(int i = 0; i<3; i++){
            System.out.println(s3.marks[i]);
        }
    }
}

class student{
    String name;
    int age;
    int marks[] = new int[3];

    // default constructor
    student(){
        System.out.println("Constructor called.. ");
    }
    // parameterised constructor
    student(String name, int age){
        this.name = name;
        this.age = age;
    }
    // Copy constructor
    student(student s1){
        this.name = s1.name;
        this.age = s1.age;
        this.marks[0] = s1.marks[0];
        this.marks[1] = s1.marks[1];
        this.marks[2] = s1.marks[2];
        
    }
    void display(){
        System.out.println();
        System.out.println(this.name+" ");
        System.out.print(this.age+" ");
        System.out.println();
        for(int i = 0; i<3; i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
    }
}
