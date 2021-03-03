package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Bob", "Mathematics");
        Student student = new Student("Rob","BE11");
        System.out.println(student.getGroupName());
        System.out.println(teacher.getSubjectName());
        teacher.printInfo();
        student.printInfo();

    }
}
