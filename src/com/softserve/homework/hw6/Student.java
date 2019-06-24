package com.softserve.homework.hw6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Student {
    private String name;
    private Integer course;
    private static  List<Student> students1 = new ArrayList<Student>();
    private static NameCompare nameComp = new NameCompare();
    private static CourseCompare courseComp = new CourseCompare();


    public Student(String name, Integer course) {
        this.name = name;
        this.course = course;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCourse() {
        return course;
    }

    public void setCourse(Integer course) {
        this.course = course;
    }

    public static void printStudents(List<Student> students, Integer course) {
        ListIterator<Student> litr = students.listIterator();

        while (litr.hasNext()) {
            Student element = (Student) litr.next();
            if ((element.getCourse().equals(course))) {
                students1.add(element);
            }

        }
        if (students1.isEmpty()) {
            System.out.println("No such course number :(");
        } else {
            System.out.println(students1);
        }
    }

    @Override
    public String toString() {
        return "StudentName " + name + ", course " + course;
    }

    public static void main(String[] args) throws IOException {
        List<Student> student = new ArrayList<Student>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(br.readLine());
        student.add(new Student("Yurii", 5));
        student.add(new Student("Vasil", 3));
        student.add(new Student("Petro", 2));
        student.add(new Student("Taras", 1));
        student.add(new Student("Oleg", 4));

        Student.printStudents(student, a);
        student.sort(Student.getNameComparator());
        System.out.println(student);
        student.sort(Student.getCourseComparator());
        System.out.println(student);



    }
    public static Comparator<Student> getNameComparator(){
        return nameComp;
    }
    public static Comparator<Student> getCourseComparator(){
        return courseComp;
    }

    static class NameCompare implements Comparator<Student>{

        @Override
        public int compare(Student s1, Student s2) {
            return s1.getName().compareTo(s2.getName());
        }
    }

    static class CourseCompare implements Comparator<Student>{

        @Override
        public int compare(Student s1, Student s2) {
            return s1.getCourse() - s2.getCourse();
        }
    }
}
