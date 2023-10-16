package com.example.proiectsp;

import com.example.proiectsp.Image;
import com.example.proiectsp.Paragraph;

import java.util.ArrayList;
import java.util.List;
class SubChapter {
    private String name;
    private List<Image> images;
    private List<Paragraph> paragraphs;
    private List<Table> tables;

    public SubChapter(String name) {
        this.name = name;
        this.images = new ArrayList<>();
        this.paragraphs = new ArrayList<>();
        this.tables = new ArrayList<>();
    }
    public void createNewImage(String imageName) {
        images.add(new Image(imageName));
    }

    public void createNewParagraph(String text) {
        paragraphs.add(new Paragraph(text));
    }

    public void createNewTable(String title) {
        tables.add(new Table(title));
    }
    public void print() {
        System.out.println("SubChapter: " + name);
        for (Image image : images) {
            image.print();
        }
        for (Paragraph paragraph : paragraphs) {
            paragraph.print();
        }
        for (Table table : tables) {
            table.print();
        }
    }
}