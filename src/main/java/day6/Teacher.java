package day6;

import java.util.Random;

public class Teacher {
    private String name;
    private String subject;
    public Teacher(String name, String subject){
        this.name = name;
        this.subject = subject;
    }

    public void evaluate(Student student  ){
        Random rand = new Random();
        int randomValue = rand.nextInt(4+2);
        String mark ="";
        switch (randomValue){
            case 2:
                 mark = "неудовлетворитель";
                break;
            case 3:
                 mark = "удовлетворительно";
                break;
            case 4 :
                 mark = "неудовлетворитель";
                break;
            default :
                 mark = "неудовлетворитель";
                break;
        }

        System.out.println("Преподаватель "+ this.name + " оценил студента с именем " + student.getName() + " по предмету "+ subject + " на оценку "+mark);

    }

}
