package com.codeAnytime;

public class Teachers {
    private String name;
    private String email;
    private String tfn;

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getTfn() {
        return tfn;
    }

    public String getStudentClass() {
        return studentClass;
    }

    public Teachers(String name, String email, String tfn, String studentClass) {
        this.name = name;
        this.email = email;
        this.tfn = tfn;
        this.studentClass = studentClass;
    }

    private String studentClass;

    public void helpStudents(){
        System.out.println("A teacher helps students in the class");
    }

}
