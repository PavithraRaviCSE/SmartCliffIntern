package com.selfpractice;

public class MobileRequirements {
	public static void main(String args[]) {
		String brand = "Samsung";
        String model = "Galaxy S20";
        double price = 999.99;
        String color = "Black";
        int storageCapacity = 128;
        int ram = 8;
        float screenSize = 6.2f;
        String processor = "Snapdragon 865";
        int cameraResolution = 64;
        int batteryCapacity = 4000;

        System.out.println("Sample Mobile Requirements:");
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Price: $" + price);
        System.out.println("Color: " + color);
        System.out.println("Storage Capacity: " + storageCapacity + "GB");
        System.out.println("RAM: " + ram + "GB");
        System.out.println("Screen Size: " + screenSize + " inches");
        System.out.println("Processor: " + processor);
        System.out.println("Camera Resolution: " + cameraResolution + "MP");
        System.out.println("Battery Capacity: " + batteryCapacity + "mAh");
	}
}
