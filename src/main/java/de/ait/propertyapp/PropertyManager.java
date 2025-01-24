package de.ait.propertyapp;

/* Главный класс для управления объектами недвижимости. */
/* Main class for managing property objects. */
public class PropertyManager {
    public static void main(String[] args) {
        Apartment apartment = new Apartment("Москва, ул. Ленина, д. 10", 5, 50, true);
        House house = new House("Екатеринбург, ул. Луначарского, д. 25", 120, 500, true);
        CommercialProperty commercialProperty = new CommercialProperty("Санкт-Петербург, ул. Строителей, д. 12", 200, "Офис");

        Apartment badApartment =  new Apartment(null,3,78, true);

        RealEstateAgency realEstateAgency = new RealEstateAgency();
        realEstateAgency.addProperty(apartment);
        realEstateAgency.addProperty(house);
        realEstateAgency.addProperty(commercialProperty);
        realEstateAgency.addProperty(badApartment);

        realEstateAgency.printAllDetails();

        realEstateAgency.calculateTotalPrice();

    }
}
