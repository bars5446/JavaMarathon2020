package day9.Task1;

public class Task1 {
    public static void main(String[] args) {
        Student student = new Student("Эдгар", "Java programming group");
        Teacher teacher = new Teacher("Сергей", "Java marathon");

        System.out.println("Название учебной группы - " + student.getGroupName());
        System.out.println("Названеи предмета - " + teacher.getSubjectName());
        student.printInfo();
        teacher.printInfo();

    }
}
