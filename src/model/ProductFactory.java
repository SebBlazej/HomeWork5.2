package model;

public class ProductFactory {

    public Product getProduct(String name, String description, double netPrice, String category){
        return new Product(name.trim(), description.trim(), netPrice, getCategoryFromString(category));
    }

    private Category getCategoryFromString(String category){
        category = category.toLowerCase().trim();
        if(category.equals("drinks")) return Category.DRINKS;
        else if(category.equals("toys")) return Category.TOYS;
        else return Category.OTHER;
    }
}
