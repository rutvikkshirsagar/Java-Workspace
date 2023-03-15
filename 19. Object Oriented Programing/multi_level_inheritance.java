//
public class multi_level_inheritance {
    public static void main(String args[]){
        employee emp = new employee();
        emp.location = "Wai";
        emp.emp_name = "Rutvik";
        emp.work();

    }
}

class company{
    String emp_name;
    int experience;

    void work(){
        System.out.println("works");
    }
}

class team extends company{
    String team_name;
    int team_size;
    int proj_count;

    int project_Inhand(){
        return proj_count;
    }
}

class employee extends company{
    String location;
    int salary;

    void salary(){
        System.out.println("Good!");
    }
}
