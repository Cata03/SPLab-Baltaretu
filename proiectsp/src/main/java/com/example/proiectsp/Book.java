package com.example.proiectsp;

import java.util.ArrayList;
import java.util.List;

class Book {
    private String title;
    private List<Author> authors;
    private TableOfContents tableOfContents;
    private List<Element> content;

    public Book(String title) {
        this.title = title;
        this.authors = new ArrayList<>();
        this.content = new ArrayList<>();
    }

    public void addAuthor(Author author) {
        authors.add(author);
    }

    public Section createSection(String name) {
        Section section = new Section(name);
        content.add(section);
        return section;
    }

    public void addContent(Element element) {
        content.add(element);
    }

    public void print() {
        System.out.println("Book Title: " + title);

        // Print Authors
        System.out.println("Authors:");
        for (Author author : authors) {
            System.out.print("Author: ");
            author.print();
        }

        // Print Table of Contents
        if (tableOfContents != null) {
            tableOfContents.print();
        }

        // Print Sections and Other Elements
        for (Element element : content) {
            if (element instanceof Section) {
                System.out.print("Section: ");
            }
            element.print();
        }
    }
}
