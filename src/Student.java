import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.function.Function;


public class Student {

    @Setter
    @Getter

    private String name;
    private String groupName;
    private int courseNum;
    private List<Integer> marks;

    public Student(String name, String groupName, int courseNum, List<Integer> marks) {
        this.name = name;
        this.groupName = groupName;
        this.courseNum = courseNum;
        this.marks = marks;
    }


    public double averageMark() {
        int sum = 0;
        double result;
        for (var element : marks) {
            sum = sum + element;
        }
        result = (double) sum / (marks.size());
        return result;
    }


    public static <T> List<T> filter(Collection<T> collection, Function<T, Boolean> predicate) {
        List<T> students = new ArrayList<>();

        for (T element : collection) {
            if (predicate.apply(element)) {
                students.add(element);
            }
        }
        return students;
    }


    public static void printStudents(List<Student> students, int courseNum) {
        var validStudents = filter(students, student -> student.courseNum == courseNum && student.averageMark() >= 3);

        for (var student : validStudents) {
            System.out.println("Студент " + student.getName() + " обучается на " + courseNum + " курсе.");
        }
    }


}
