package com.example.proiectsp;

import java.util.ArrayList;
import java.util.List;

class Section implements Element {
    private String title;
    private Section parent;
    private List<Element> content;

    public Section(String title) {
        this.title = title;
        this.parent = null;
        this.content = new ArrayList<>();
    }

    public void add(Element element) {
        if (element != null) {
            if (element instanceof Section) {
                // Check if the element is already part of another section
                if (((Section) element).hasParent()) {
                    throw new IllegalArgumentException("Element is already part of another section.");
                }
                ((Section) element).parent = this;
            }
            this.content.add(element);
        }
    }

    private boolean hasParent() {
        return this.parent != null;
    }

    @Override
    public void print() {
        System.out.println("Section: " + title);
        for (Element element : content) {
            element.print();
        }
    }
}
