package com.example.proiectsp;

class Table {
    private String title;

    public Table(String title) {
        this.title = title;
    }

    public void print() {
        System.out.println("Table with title: " + title);
    }
}