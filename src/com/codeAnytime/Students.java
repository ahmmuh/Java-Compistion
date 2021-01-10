package com.codeAnytime;

public class Students {
    private String name;
    private String book;
    private String pencil;
    private String table;

    public String getName() {
        return name;
    }

    public String getBook() {
        return book;
    }

    public String getPencil() {
        return pencil;
    }

    public String getTable() {
        return table;
    }

    public Students(String name, String book, String pencil, String table) {
        this.name = name;
        this.book = book;
        this.pencil = pencil;
        this.table = table;
    }

    public  void playing(){
        System.out.println("a studen is playing");
    }
}
