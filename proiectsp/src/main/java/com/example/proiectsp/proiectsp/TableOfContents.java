package proiectsp;

import java.util.List;

class TableOfContents {
    private List<Element> elements;
    public void addElement(Element element) {
        elements.add(element);
    }
    public void print() {
        for (Element element : elements) {
            element.print();
        }
    }
}