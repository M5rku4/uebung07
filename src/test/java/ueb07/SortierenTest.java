package ueb07;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SortierenTest {
    /*@Test
    void TestBUB() {
        Student[] students = {
                new Student(100, "Hans"),
                new Student(99, "Peter"),
                new Student(101, "Günther"),
                new Student(9999999, "Georg"),
                new Student(1, "Yannik")
        };
        Student[] studentsSorted = {
                new Student(1, "Yannik"),
                new Student(99, "Peter"),
                new Student(100, "Hans"),
                new Student(101, "Günther"),
                new Student(9999999, "Georg")
        };
        Sortieren.bubblesort(students);
        assertArrayEquals(studentsSorted, students);
    } */
    @Test
    void TestBubble(){
        Student[] students = {
                new Student(100, "Hans"),
                new Student(99, "Peter"),
                new Student(101, "Georg"),
                new Student(9999999, "Georg"),
                new Student(1, "Yannik")
        };
        Student[] studentsSorted = {
                new Student(101, "Georg"),
                new Student(9999999, "Georg"),
                new Student(100, "Hans"),
                new Student(99, "Peter"),
                new Student(1, "Yannik")
        };
        Sortieren.bubblesort2(students, Student.sortNameAndMat);
        assertArrayEquals(studentsSorted, students);
    }
}