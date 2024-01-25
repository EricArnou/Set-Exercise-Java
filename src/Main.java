import ericarnou68.entities.Student;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Set<Student> studentSet = new HashSet<>();
        List<String> courses = Arrays.asList("A","B","C");
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < courses.size(); i++) {
            System.out.print("How many students for course "+ courses.get(i) +"?");
            int numberOfStudents = sc.nextInt();
                for (int j = 0; j < numberOfStudents; j++) {
                    System.out.print("Enter #" +(j+1)+" student's id: ");
                    studentSet.add(new Student(sc.nextInt()));
                }
            System.out.println();
        }
        System.out.println("Total students: " + studentSet.size());
    }
}