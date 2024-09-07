package oop;

import java.util.Arrays;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Book book1 = new Book("Clean code", 1180);
        Book book2 = new Book("Morze", 180);
        Book book3 = new Book("Black sky", 220);
        Book book4 = new Book("Magic words", 540);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        System.out.println("List of books in the library before replacement:");
        Arrays.stream(books).map(book -> "Book: " + book.getName() + ". Number of page: " + book.getCount()).forEach(System.out::println);
    }
}
