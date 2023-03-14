// Classes and Object..

public class Classes_and_Objects {
    public static void main(String args[]){
        student st = new student();
        student s = new student();
        st.setStudentDetails("Rutvik", 16, "Computer Enginnering");

        st.printStudent();
    }
    
}

class student{
    String name;
    int std;
    String subj;

    void setStudentDetails(String n, int m, String sub){
        name = n;
        std = m;
        subj = sub;
    }

    void printStudent(){
        System.out.println(name);
        System.out.println(std);
        System.out.println(subj);
    }
}