package selfpractice;

import java.util.*;
import java.util.Stack;

public class StackPractice {

    private Stack<Book> stack;

    public StackPractice() {
        stack = new Stack<>();
    }
    public void pushBook(String title, String author, int year) {
        stack.push(new Book(title, author, year));
    }

    public Book popBook() {
        if (!stack.isEmpty()) {
            return stack.pop();
        }
        return null;
    }

    public Book peekBook() {
        if (!stack.isEmpty()) {
            return stack.peek();
        }
        return null;
    }

    public boolean containsBook(String title) {
        for (Book book : stack) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                return true;
            }
        }
        return false;
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }

    public void listBookTitles() {
        for (Book book : stack) {
            System.out.println(book.getTitle());
        }
    }

    public int size() {
        return stack.size();
    }

    public void increaseCapacity(int amount) {
        stack.ensureCapacity(stack.size() + amount);
    }

    public void iterateBooks() {
        for (Book book : stack) {
            System.out.println(book.getTitle());
        }
    }

    public Book[] toArray() {
        Book[] array = new Book[stack.size()];
        stack.toArray(array);
        return array;
    }

    public boolean updateBookAuthor(String title, String newAuthor) {
        for (Book book : stack) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.setAuthor(newAuthor);
                return true;
            }
        }
        return false;
    }

    public boolean updateBookYear(String title, int newYear) {
        for (Book book : stack) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.setYear(newYear);
                return true;
            }
        }
        return false;
    }

    public void clear() {
        stack.clear();
    }

    public static void main(String[] args) {
        StackPractice sp = new StackPractice();

        sp.pushBook("The Great Gatsby", "F. Scott Fitzgerald", 1925);
        sp.pushBook("To Kill a Mockingbird", "Harper Lee", 1960);
        sp.pushBook("1984", "George Orwell", 1949);

        System.out.println("Listing all book titles:");
        sp.listBookTitles();

        System.out.println("\nPopping the top book: " + sp.popBook());

        System.out.println("Peeking at the top book: " + sp.peekBook());

        System.out.println("Does 'To Kill a Mockingbird' exist? " + sp.containsBook("To Kill a Mockingbird"));

        System.out.println("Is the stack empty? " + sp.isEmpty());

        System.out.println("Total number of books in the stack: " + sp.size());

        System.out.println("\nIterating over the books:");
        sp.iterateBooks();

        System.out.println("\nConverting the stack to an array:");
        Book[] bookArray = sp.toArray();
        System.out.println(Arrays.toString(bookArray));

        System.out.println("\nUpdating '1984' author and year:");
        sp.updateBookAuthor("1984", "Eric Arthur Blair");
        sp.updateBookYear("1984", 1948);
        sp.iterateBooks();

        sp.clear();
        System.out.println("Clearing the stack: Is it empty now? " + sp.isEmpty());
    }
}

class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Title: " + title + ", Author: " + author + ", Year: " + year;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
