package de.ait.homework43;

import com.github.javafaker.Faker;

public class AmazonApp {
    public static void main(String[] args) {

        Faker faker = new Faker();

        Book book = new Book(faker.book().title(), 19.95, faker.book().author());
        Book book2 = new Book(faker.book().title(), 39.0, faker.book().author());
        Book book3 = new Book(faker.book().title(), 15.99, faker.book().author());
        Book book4 = new Book(faker.book().title(), 19, faker.book().author());

        Electronics electronics = new Electronics(faker.commerce().productName(), 100.0, faker.commerce().material());
        Electronics electronics2 = new Electronics(faker.commerce().productName(), 200.0, faker.commerce().material());
        Electronics electronics3 = new Electronics(faker.commerce().productName(), 300.0, faker.commerce().material());
        Electronics electronics4 = new Electronics(faker.commerce().productName(), 400.0, faker.commerce().material());


        Cart cart = new Cart();
        cart.addProduct(book);
        cart.addProduct(book2);
        cart.addProduct(book3);
        cart.addProduct(book4);

        Cart<Electronics> electronicsCart = new Cart<>();
        electronicsCart.addProduct(electronics);
        electronicsCart.addProduct(electronics2);
        electronicsCart.addProduct(electronics3);
        electronicsCart.addProduct(electronics4);

        //System.out.println("Total price " + cart.getTotalPrice() + " EUR");
        System.out.println("Total price electronics" + electronicsCart.getTotalPrice() + " EUR");

        System.out.println("------------");
        //cart.getProductsInfo();
        electronicsCart.getProductsInfo();

        System.out.println("------delete------");
        //cart.removeProductByName(book.getName());
        electronicsCart.removeProductByName(electronics.getName());
        System.out.println("------------");
        //cart.getProductsInfo();
        electronicsCart.getProductsInfo();
    }
}
