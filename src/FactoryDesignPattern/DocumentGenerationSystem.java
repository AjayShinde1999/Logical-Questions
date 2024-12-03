package FactoryDesignPattern;

import java.util.Scanner;

interface Document {
    void generate();
}

class PDFDocument implements Document {

    @Override
    public void generate() {
        System.out.println("Generating PDF Document");
    }
}

class HTMLDocument implements Document {

    @Override
    public void generate() {
        System.out.println("Generating HTML Document");
    }
}

class DocumentFactory {

    public Document createDocument(String format) {
        if (format.equalsIgnoreCase("pdf")) {
            return new PDFDocument();
        } else if (format.equalsIgnoreCase("html")) {
            return new HTMLDocument();
        } else {
            throw new IllegalArgumentException("Unknown format " + format);
        }
    }
}

public class DocumentGenerationSystem {
    public static void main(String[] args){
        DocumentFactory documentFactory = new DocumentFactory();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the document format");
        String format = sc.nextLine();

        Document document = documentFactory.createDocument(format);
        document.generate();
    }

}
