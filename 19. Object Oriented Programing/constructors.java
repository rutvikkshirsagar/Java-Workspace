// types of constructor

public class constructors {
    public static void main(String args[]){
        student s1 = new student();

        student s2 = new student("Rutvik",22);
        s2.marks[0] = 90;
        s2.marks[1] = 92;
        s2.marks[2] = 100;

        student s3 = new student(s2);

        
        //s1.display();
        s2.display();
        s3.display();
        System.out.println();
        s2.marks[0] = 100;
        s3.display();
    }
}

class student{
    String name;
    int age;
    int marks[];

    // default constructor
    student(){
        marks = new int[3];
        System.out.println("Constructor called.. ");
    }
    // parameterised constructor
    student(String name, int age){
        marks = new int[3];
        this.name = name;
        this.age = age;
    }
    //Shallow Copy constructor
    // student(student s1){
    //     marks = new int[3];
    //     this.name = s1.name;
    //     this.age = s1.age;
    //     this.marks = s1.marks;
        
    // }

    //Deep copy constructor
    student(student s1){
        marks = new int[3];
        this.name = s1.name;
        this.age = s1.age;
        for(int i = 0; i<marks.length; i++){
            this.marks[i] = s1.marks[i];
        }
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
