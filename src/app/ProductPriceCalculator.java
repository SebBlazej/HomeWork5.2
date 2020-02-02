package app;

import model.Product;

class ProductPriceCalculator {

    double getGrossPrice(Product product){
        double vatValue = product.getNetPrice() * product.getCategory().getVatPercent();
        return product.getNetPrice() + vatValue;
    }

}
