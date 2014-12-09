package me.briandubois;

/**
 * @author Brian DuBois
 */
public class Grades {
    public static void main(String[] args) {
        Student student1 = new Student("Mary Marmalaide");
        Student student2 = new Student("Mike Wazousky");

        student1.inputGrades();
        System.out.println(student1.printName() + "'s average is " + student1.getAverage());

        System.out.println();

        student2.inputGrades();
        System.out.println(student2.printName() + "'s average is " + student2.getAverage());
    }
}