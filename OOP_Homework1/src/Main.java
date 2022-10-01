/*Create a class called Invoice
that a hardware store might use to represent an invoice for an item sold at the store.

An Invoice should include four attributes—
a part number (type string),
a part description (type string),
a quantity of the item being purchased (type int) and
a price per item (type int).

Your class should have a constructor that initializes the four attributes.
Provide a set and a get method for each attribute.

In addition, provide a method named getInvoiceAmount that calculates the invoice amount
(i.e., multiplies the quantity by the price per item), then returns the amount as an int value.

If the quantity is not positive, it should be set to 0.
If the price per item is not positive, it should be set to 0.
Write a test program that demonstrates class Invoice’s capabilities.
* */

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Invoice [] invoice = new Invoice [5];
        invoice[0] = new Invoice("Part01", "this is first part description", 2, 20);
        invoice [1] = new Invoice("Part02", "Quantity will be negative", -2, 2);
        invoice [2] = new Invoice("Part03", "Price will be negative", 3, -5);

        for (Invoice i :invoice) {
            System.out.println(i);

        }

    }
}