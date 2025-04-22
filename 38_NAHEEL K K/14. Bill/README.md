# Billing System in Java

This Java program allows users to input multiple orders, each containing multiple products, and generates a detailed bill for each order. It uses basic Object-Oriented Programming concepts and interfaces.

## Features

- Accepts multiple orders with variable numbers of products.
- Ensures product IDs are unique within each order.
- Calculates the total price per product and the net total per order.
- Displays a formatted invoice with date and time.

## Structure

- **`BillGen` Interface**: Contains the method `calculate()` to compute the total cost of a product.
- **`Product` Class**: Implements `BillGen` and holds product details like name, ID, quantity, unit price, and total.
- **`Main` Class**: Handles user input, order creation, validation of unique product IDs, and invoice printing.

## How to Run

1. Compile the program:
   ```bash
   javac module_3/Main.java
