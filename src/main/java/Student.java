import java.util.ArrayList;



public class Student {
//    id should be a long number used to represent a "unique user" in our application.
//    grades is an ArrayList that contains a list of Integer numbers.
//    name is a String that holds the name of the student.
    public long id;
    public String name;
    public ArrayList<Integer> grades;


     public Student(String name, long id){
         this.name = name;
         this.id = id;
         grades = new ArrayList<>();
     }


    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void addGrade(int grade){
        grades.add(grade);
    }
    public double getGradeAverage(){
        double total = 0;
        for (Integer grade : grades) {
            total += grade;
        }
        return  total / grades.size();
    }
    }



