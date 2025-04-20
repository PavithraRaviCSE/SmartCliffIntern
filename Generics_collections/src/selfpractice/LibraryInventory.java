package selfpractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class LibraryInventory {
	    ArrayList<Book1> list;

	    LibraryInventory() {
	        list = new ArrayList<>();
	    }

	    void add(int id, String title, String author, int copies) {
	        this.list.add(new Book1(id, title, author, copies));
	    }

	    public static void main(String args[]) {
	  
	        LibraryInventory lib = new LibraryInventory();
	        lib.add(1, "a", "ravi", 3);
	        lib.add(1, "a", "ravi1", 1);
	        lib.add(2, "b", "kani", 2);
	        lib.add(3, "c", "moni", 4); 
	        lib.add(4, "d", "ravi", 5);

	        lib.getDetail();

	        if(lib.remove("a")) {
	            System.out.println("Successfully removed");
	        } else {
	            System.out.println("No such book exists");
	        }

	        lib.search("a");
	        lib.search("e");

	        System.out.println("ASCENDING ORDER");
	        lib.sortinAscending();
	        lib.getDetail();

	        System.out.println("DESCENDING ORDER");
	        lib.sortinDescending();
	        lib.getDetail();

	        System.out.println("Sort by author");
	        lib.sortByAuthor();
	        lib.getDetail();

	        System.out.println("Inventory is empty: " + lib.isEmpty());

	        lib.increaseCapacity(10);

	        System.out.println("Size of inventory: " + lib.size());

	        String[] bookTitles = lib.toArray();
	        System.out.println("Books in array form: " + Arrays.toString(bookTitles));

	        lib.lendBook("b");
	        lib.getDetail();
	        lib.returnBook("b");
	        lib.getDetail();
	    }

	    void sortByAuthor() {
	        Collections.sort(list, (l1, l2) -> l1.getAuthor().compareTo(l2.getAuthor()));
	    }

	    void sortinAscending() {
	        Collections.sort(list, (l1, l2) -> l1.getTitle().compareTo(l2.getTitle()));
	    }

	    void sortinDescending() {
	        Collections.sort(list, (l1, l2) -> l2.getTitle().compareTo(l1.getTitle()));
	    }

	    void search(String title) {
	        for (Book1 c : list) {
	            if (c.getTitle().equalsIgnoreCase(title)) {
	                System.out.println(true);
	                return;
	            }
	        }
	        System.out.println(false);
	    }

	    void getDetail() {
	        for (Book1 c: this.list) {
	            System.out.println(c.toString());
	        }
	    }

	    boolean remove(String title) {
	        Iterator<Book1> iterator = list.iterator();
	        while (iterator.hasNext()) {
	            Book1 c = iterator.next();
	            if (c.getTitle().equalsIgnoreCase(title)) {
	                iterator.remove();
	                return true;
	            }
	        }
	        return false;
	    }

	    void getBookAuthor(String title) {
	        for (Book1 c: list) {
	            if (c.getTitle().equalsIgnoreCase(title)) {
	                System.out.println(c.getAuthor());
	            }
	        }
	    }

	    boolean isEmpty() {
	        return list.isEmpty();
	    }

	    public void increaseCapacity(int amount) {
	        ((ArrayList<Book1>) list).ensureCapacity(list.size() + amount);
	    }

	    public int size() {
	        return list.size();
	    }

	    String[] toArray() {
	        String[] titles = new String[list.size()];
	        for (int i = 0; i < list.size(); i++) {
	            titles[i] = list.get(i).getTitle();
	        }
	        return titles;
	    }

	    void lendBook(String title) {
	        for (Book1 c: list) {
	            if (c.getTitle().equalsIgnoreCase(title)) {
	                if (c.getCopies() > 0) {
	                    c.setCopies(c.getCopies() - 1);
	                    System.out.println("Lent out a copy of: " + title);
	                } else {
	                    System.out.println("No copies available for: " + title);
	                }
	                return;
	            }
	        }
	        System.out.println("No such book exists");
	    }

	    void returnBook(String title) {
	        for (Book1 c: list) {
	            if (c.getTitle().equalsIgnoreCase(title)) {
	                c.setCopies(c.getCopies() + 1);
	                System.out.println("Returned a copy of: " + title);
	                return;
	            }
	        }
	        System.out.println("No such book exists");
	    }
	}

	class Book1 {
	    private int id;
	    private String title;
	    private String author;
	    private int copies;

	    Book1(int id, String title, String author, int copies) {
	        this.id = id;
	        this.title = title;
	        this.author = author;
	        this.copies = copies;
	    }

	    public String toString() {
	        return "id: " + id + ", title: " + title + ", author: " + author + ", copies: " + copies;
	    }

	    public String getTitle() {
	        return title;
	    }

	    public String getAuthor() {
	        return author;
	    }

	    public int getId() {
	        return id;
	    }

	    public int getCopies() {
	        return copies;
	    }

	    public void setCopies(int copies) {
	        this.copies = copies;
	    }
	}
