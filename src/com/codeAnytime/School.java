package com.codeAnytime;

public class School {
    private String name;
    private Teachers teachers;
    private Students students;

    public School(String name, Teachers teachers, Students students) {
        this.name = name;
        this.teachers = teachers;
        this.students = students;
    }

    public String getName() {
        return name;
    }

    public Teachers getTeachers() {
        return teachers;
    }

    public Students getStudents() {
        return students;
    }
}
