package com.junitDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Student {

    private String name;
    private int studentId;
    private int age;

    public Student(String name, int studentId, int age) {
        this.name = name;
        this.studentId = studentId;
        this.age = age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;

        Student student = (Student) obj;

        return studentId == student.studentId &&
                age == student.age &&
                Objects.equals(name, student.name);
    }

    public static List<Student> getStudentList() {
        List<Student> students = new ArrayList<>();

        Student student1 = new Student("John", 101, 20);
        Student student2 = new Student("Jane", 102, 21);
        Student student3 = new Student("Bob", 103, 22);

        students.add(student1);
        students.add(student2);
        students.add(student3);

        return students;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
