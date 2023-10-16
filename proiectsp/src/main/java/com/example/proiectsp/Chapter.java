package com.example.proiectsp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Chapter {
    private String name;
    private List<SubChapter> subChapters;

    public Chapter(String name) {
        this.name = name;
        this.subChapters = new ArrayList<>();
    }

    public SubChapter getSubChapter(int index) {
        return subChapters.get(index);
    }

    public SubChapter createSubChapter(String name) {
        SubChapter subChapter = new SubChapter(name);
        subChapters.add(subChapter);
        return subChapter;
    }
    public void print() {
        System.out.println("Chapter: " + name);
        for (SubChapter subChapter : subChapters) {
            subChapter.print();
        }
    }
}