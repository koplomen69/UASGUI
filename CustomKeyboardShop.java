package UASgui;

import java.util.Scanner;

public class CustomKeyboardShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Keyboard options and prices
        String[] keyboardOptions = {"Mechanical Keyboard", "Ergonomic Keyboard", "Wireless Keyboard"};
        double[] keyboardPrices = {100.0, 150.0, 120.0};

        // Display available keyboard options
        System.out.println("Welcome to the Custom Keyboard Shop!");
        System.out.println("Available Keyboard Options:");

        for (int i = 0; i < keyboardOptions.length; i++) {
            System.out.println(i + 1 + ". " + keyboardOptions[i] + " - $" + keyboardPrices[i]);
        }

        // Get user input for the selected keyboard
        System.out.print("Enter the number corresponding to your desired keyboard: ");
        int selectedOption = scanner.nextInt();

        // Validate user input
        if (selectedOption < 1 || selectedOption > keyboardOptions.length) {
            System.out.println("Invalid input. Please try again.");
            return;
        }

        // Calculate the total price
        double totalPrice = keyboardPrices[selectedOption - 1];

        // Get user input for additional accessories
        System.out.println("Do you want to add any accessories?");
        System.out.println("1. Keycap set - $20");
        System.out.println("2. Wrist rest - $15");
        System.out.println("3. No, thanks");

        System.out.print("Enter the number corresponding to your choice: ");
        int accessoryChoice = scanner.nextInt();

        // Validate user input
        if (accessoryChoice < 1 || accessoryChoice > 3) {
            System.out.println("Invalid input. Please try again.");
            return;
        }

        // Add accessory price to the total price
        if (accessoryChoice == 1) {
            totalPrice += 20.0;
        } else if (accessoryChoice == 2) {
            totalPrice += 15.0;
        }

        // Get user input for shipping method
        System.out.println("Select your shipping method:");
        System.out.println("1. Standard Shipping - $10");
        System.out.println("2. Express Shipping - $20");

        System.out.print("Enter the number corresponding to your choice: ");
        int shippingChoice = scanner.nextInt();

        // Validate user input
        if (shippingChoice < 1 || shippingChoice > 2) {
            System.out.println("Invalid input. Please try again.");
            return;
        }

        // Add shipping cost to the total price
        if (shippingChoice == 1) {
            totalPrice += 10.0;
        } else if (shippingChoice == 2) {
            totalPrice += 20.0;
        }

        // Display the final details and total price
        System.out.println();
        System.out.println("Order Summary:");
        System.out.println("Keyboard: " + keyboardOptions[selectedOption - 1] + " - $" + keyboardPrices[selectedOption - 1]);

        if (accessoryChoice == 1) {
            System.out.println("Accessory: Keycap set - $20");
        } else if (accessoryChoice == 2) {
            System.out.println("Accessory: Wrist rest - $15");
        }

        System.out.println("Shipping method: " + (shippingChoice == 1 ? "Standard Shipping - $10" : "Express Shipping - $20"));
        System.out.println("Total price: $" + totalPrice);
    }
}

