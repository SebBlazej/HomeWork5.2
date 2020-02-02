package model;

public class ProductFactory {

    public Product getProduct(String name, String description, double netPrice, String category){
        return new Product(name.trim(), description.trim(), netPrice, getCategoryFromString(category));
    }

    private Category getCategoryFromString(String category){
        category = category.toLowerCase().trim();
        return switch(category) {
            case "drinks" -> Category.DRINKS;
            case "toys" -> Category.TOYS;
            default -> Category.OTHER;
        };
    }
}
