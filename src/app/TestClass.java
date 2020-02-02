package app;

import model.Category;
import model.Product;
import model.ProductFactory;

import java.util.Locale;
import java.util.Scanner;

public class TestClass {
    public static void main(String[] args) {
        String name;
        String description;
        double netPrice;
        String category;

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Enter product name:");
        name = scanner.nextLine();
        System.out.println("Enter description:");
        description = scanner.nextLine();
        System.out.println("Enter net price:");
        netPrice = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter category - toys/drinks:");
        category = scanner.nextLine();

        ProductFactory productFactory = new ProductFactory();
        Product product = productFactory.getProduct(name, description, netPrice, category);
        ProductPriceCalculator productPriceCalculator = new ProductPriceCalculator();

        System.out.println(product.toString());
        System.out.println("Gross price is - " + productPriceCalculator.getGrossPrice(product));

    }

}
