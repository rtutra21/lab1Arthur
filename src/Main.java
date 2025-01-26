import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Student> studentsNew = new ArrayList<>();

        var student = new Student("Артур", "ИТАЭ", 1, List.of(4, 5, 5));
        var student1 = new Student("Артём", "ИТЦЭ", 1, List.of(4, 4, 3));
        var student2 = new Student("Настя", "ИТЦЭ", 1, List.of(5, 5, 3));
        var student3 = new Student("Александр", "ИВТ", 2, List.of(5, 2, 2));
        var student4 = new Student("Николай", "ПРО", 2, List.of(4, 3, 5));
        var student5 = new Student("Алексей", "ИТЦЭ", 2, List.of(3, 2, 3));
        var student6 = new Student("Георгий", "ИТЦЭ", 3, List.of(2, 2, 3));
        var student7 = new Student("Маргарита", "ИТЦЭ", 3, List.of(3, 5, 4));
        var student8 = new Student("Юлия", "ИТЦЭ", 3, List.of(2, 2, 3));

        studentsNew.add(student);
        studentsNew.add(student1);
        studentsNew.add(student2);
        studentsNew.add(student3);
        studentsNew.add(student4);
        studentsNew.add(student5);
        studentsNew.add(student6);
        studentsNew.add(student7);
        studentsNew.add(student8);

        Student.printStudents(studentsNew, 2);

    }
}