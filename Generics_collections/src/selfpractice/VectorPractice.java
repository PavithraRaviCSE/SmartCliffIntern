package selfpractice;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Vector;

public class VectorPractice {
	
	    private Vector<Product> products;

	    public VectorPractice() {
	        products = new Vector<>();
	    }

	    public void addProduct(String name, String category, double price) {
	        products.add(new Product(name, category, price));
	    }

	    public boolean removeProductByName(String name) {
	        Iterator<Product> iterator = products.iterator();
	        while (iterator.hasNext()) {
	            Product product = iterator.next();
	            if (product.getName().equalsIgnoreCase(name)) {
	                iterator.remove();
	                return true;
	            }
	        }
	        return false;
	    }

	    public boolean removeProductsByCategory(String category) {
	        boolean removed = false;
	        Iterator<Product> iterator = products.iterator();
	        while (iterator.hasNext()) {
	            Product product = iterator.next();
	            if (product.getCategory().equalsIgnoreCase(category)) {
	                iterator.remove();
	                removed = true;
	            }
	        }
	        return removed;
	    }
	    public boolean searchProductByName(String name) {
	        for (Product product : products) {
	            if (product.getName().equalsIgnoreCase(name)) {
	                return true;
	            }
	        }
	        return false;
	    }

	    public boolean isEmpty() {
	        return products.isEmpty();
	    }

	    // Listing Products
	    public void listProducts() {
	        for (Product product : products) {
	            System.out.println(product);
	        }
	    }

	    public int size() {
	        return products.size();
	    }

	    public void increaseCapacity(int amount) {
	        products.ensureCapacity(products.size() + amount);
	    }

	    public void trimToSize() {
	        products.trimToSize();
	    }

	    public void iterateProducts() {
	        for (Product product : products) {
	            System.out.println(product);
	        }
	    }

	    public Product[] toArray() {
	        Product[] array = new Product[products.size()];
	        products.toArray(array);
	        return array;
	    }

	    public void sortByName() {
	        products.sort(Comparator.comparing(Product::getName));
	    }

	    public void sortByPrice() {
	        products.sort(Comparator.comparingDouble(Product::getPrice));
	    }

	    public boolean updateProductCategory(String name, String newCategory) {
	        for (Product product : products) {
	            if (product.getName().equalsIgnoreCase(name)) {
	                product.setCategory(newCategory);
	                return true;
	            }
	        }
	        return false;
	    }

	    public boolean updateProductPrice(String name, double newPrice) {
	        for (Product product : products) {
	            if (product.getName().equalsIgnoreCase(name)) {
	                product.setPrice(newPrice);
	                return true;
	            }
	        }
	        return false;
	    }

	    public void clear() {
	        products.clear();
	    }
	    
	    public static void main(String[] args) {
	        VectorPractice vp = new VectorPractice();
	        vp.addProduct("Laptop", "Electronics", 1200.99);
	        vp.addProduct("Smartphone", "Electronics", 799.49);
	        vp.addProduct("Table", "Furniture", 150.89);
	        vp.addProduct("Chair", "Furniture", 89.99);

	        System.out.println("Listing all products:");
	        vp.listProducts();

	        System.out.println("\nRemoving 'Table': " + vp.removeProductByName("Table"));

	        System.out.println("Removing all 'Furniture' products: " + vp.removeProductsByCategory("Furniture"));

	        System.out.println("Searching for 'Laptop': " + vp.searchProductByName("Laptop"));

	        System.out.println("Is the product vector empty? " + vp.isEmpty());
	        System.out.println("\nListing all products after removal:");
	        vp.listProducts();

	        System.out.println("Current size: " + vp.size());
	        vp.increaseCapacity(10);
	        System.out.println("Capacity increased.");
	        vp.trimToSize();
	        System.out.println("Capacity trimmed to size.");

	        System.out.println("\nIterating over products:");
	        vp.iterateProducts();
	        System.out.println("Converting to array:");
	        Product[] productArray = vp.toArray();
	        for (Product p : productArray) {
	            System.out.println(p);
	        }

	        vp.addProduct("Notebook", "Stationery", 2.99);
	        vp.addProduct("Pen", "Stationery", 1.29);
	        System.out.println("\nListing all products before sorting:");
	        vp.listProducts();
	        vp.sortByName();
	        System.out.println("Products sorted by name:");
	        vp.listProducts();
	        vp.sortByPrice();
	        System.out.println("Products sorted by price:");
	        vp.listProducts();

	        System.out.println("Updating 'Pen' category and price:");
	        vp.updateProductCategory("Pen", "Office Supplies");
	        vp.updateProductPrice("Pen", 1.99);
	        vp.listProducts();

	        vp.clear();
	        System.out.println("All products cleared. Is vector empty? " + vp.isEmpty());
	    }
	
	}

	class Product {
	    private String name;
	    private String category;
	    private double price;

	    public Product(String name, String category, double price) {
	        this.name = name;
	        this.category = category;
	        this.price = price;
	    }

	    @Override
	    public String toString() {
	        return "Name: " + name + ", Category: " + category + ", Price: " + price;
	    }

	    public String getName() {
	        return name;
	    }

	    public String getCategory() {
	        return category;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setCategory(String category) {
	        this.category = category;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }
	}


