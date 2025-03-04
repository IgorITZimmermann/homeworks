package de.ait.homework43;

import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

@Slf4j
public class Cart <T extends Product>  {

    private List<T> products = new ArrayList<>();

    public void addProduct(T product) {
        log.info("Product {} added to cart", product.getName());
        products.add(product);
    }

    public boolean removeProductByName(String productName) {
        Iterator<T> iterator = products.iterator();
        while (iterator.hasNext()) {
            T currentProduct = iterator.next();
            if(productName.equals(currentProduct.getName())){
                iterator.remove();
                log.info("Product {} removed from cart", productName);
                return true;
            }
        }
        return false;
    }

    public double getTotalPrice() {
        double totalprice = 0;

        if(products.isEmpty()){
            log.info("No products in cart");
        }
        else {
            for(T product : products) {
                totalprice = totalprice + product.getPrice();
            }
        }

        return totalprice;
    }

    public void getProductsInfo() {
        for(T product : products) {
            log.info("Product: {}", product.getDescription());
        }
    }

    public List<T> sortCartByPrice() {
        return products.stream()
                .sorted()
                .collect(Collectors.toList());
    }

    public List<T> filterProductsByPriceRange(double minPrice, double maxPrice) {
        return products.stream()
                .filter(product -> product.getPrice() > minPrice && product.getPrice() < maxPrice)
                .collect(Collectors.toList());
    }

    public T getProductWithMinPrice() {
        return products.stream()
                .min(Comparator.comparingDouble(Product::getPrice))
                .orElse(null);
    }

    public T getProductWithMaxPrice() {
        return products.stream()
                .max(Comparator.comparingDouble(Product::getPrice))
                .orElse(null);
    }

    public List<T> filterProductsByFirstLetterOfName(String firstLetter) {
        return products.stream()
                .filter((product -> product.getName().toUpperCase().startsWith(
                        firstLetter.trim().toUpperCase())))
                .collect(Collectors.toList());
    }

    public List<T> filterProductsBySubstringInName(String substring) {
        return products.stream()
                .filter((product -> product.getName().toUpperCase().contains(
                        substring.trim().toUpperCase())))
                .collect(Collectors.toList());
    }

    public List<T> filterProductsByExactName(String name) {
        return products.stream()
                .filter((product -> product.getName().equalsIgnoreCase(name)))
                .collect(Collectors.toList());
    }

}
