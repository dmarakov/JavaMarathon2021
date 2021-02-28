package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Bob","физика");
        Student studen1 = new Student("Jim");
        teacher1.evaluate(studen1.name);

    }
}
