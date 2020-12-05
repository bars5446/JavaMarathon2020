package day6;

public class Task3 {
    public static void main(String[] args) {
        Teacher teacher = new Teacher("Наталья Александровна", "Математика");
        Student student = new Student("Андрей");

        teacher.evaluate(student);
    }

}
