package day6;

public class Student {
    String name;
    public Student(String name){
        this.name = name;
    }
    public void setName(String studentName){
        if (studentName.isEmpty()) {
            System.out.println("Это поле не может быть пустым");
        } else {
            name = studentName;
        }
    }
}
