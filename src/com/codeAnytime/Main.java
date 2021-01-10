package com.codeAnytime;

public class Main {

    public static void main(String[] args) {
	Teachers teachers = new Teachers("John", "john@email.com","0734 754392,","B2");
	Students students = new Students("Joe biden", "English beginner", "Black pencil", "Table 2");
	School school = new School("English School",teachers, students);
        System.out.println("Student is "+ school.getStudents().getName());
        System.out.println("Teacher is " + school.getTeachers().getName());
        System.out.println(school.getTeachers());

    }
}
