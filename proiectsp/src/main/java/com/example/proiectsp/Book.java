package com.example.proiectsp;

import com.example.proiectsp.Author;

import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private List<Author> authors;
    private TableOfContents tableOfContents;
    private List<Chapter> chapters;

    public Book(String title) {
        this.title = title;
        this.authors = new ArrayList<>();
        this.chapters = new ArrayList<>();
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public Chapter getChapter(int index) {
        return chapters.get(index);
    }
    public Chapter createChapter(String name) {
        Chapter chapter = new Chapter(name);
        chapters.add(chapter);
        return chapter;
    }
    public void print() {
        System.out.println("Book Title: " + title);
        for (Author author : authors) {
            author.print();
        }
        tableOfContents.print();
        for (Chapter chapter : chapters) {
            chapter.print();
        }
    }
}