package day6;

import java.util.Random;

public class Teacher {
    private final String name;
    private final String subject;
    Random random = new Random();

    public Teacher(String name, String subject) {
        this.name = name;
        this.subject = subject;
    }

    private String assessment(int assessment) {
        String assessmentStr = " ";
        switch (assessment){
            case 5:
                assessmentStr = "Отлично";
                break;
            case 4:
                assessmentStr = "Хороошо";
                break;
            case 3:
                assessmentStr = "Удовлетворительно";
                break;
            case 2:
                assessmentStr = "Неудовлетворительно";
                break;

        }
        return assessmentStr;
    }

    public void evaluate (Student student) {
        System.out.println("Преподаватель " + name + " оценил студента с именем " + student.getName() +
                " по предмету " + subject + " на оценку " + assessment(random.nextInt(4) + 2));
    }
}
