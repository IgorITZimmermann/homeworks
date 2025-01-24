package de.ait.propertyapp;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class RealEstateAgencyTest {

    public void testApartmentPrice() {
        Apartment apartment = new Apartment("Test Address", 1, 50, true);
        assertEquals(52500, apartment.calculatePrice());
    }

    @Test
    public void testHousePrice() {
        House house = new House("Test Address", 100, 300, true);
        assertEquals(145000, house.calculatePrice());
    }

    @Test
    public void testCommercialPropertyPrice() {
        CommercialProperty commercial = new CommercialProperty("Test Address", 150, "warehouse");
        assertEquals(120000, commercial.calculatePrice());
    }

    @ParameterizedTest
    @CsvSource({
            "100, true, 200, 200, false, 300, 30, 635000.0",
            "50, false, 100, 100, false, 150, 20, 320000.0",
            "150, true, 150, 150, true, 200, 10, 522500.0",
            "200, false, 100, 100, true, 150, 20, 475000.0",
            "250, true, 100, 100, false, 150, 20, 532500.0"
    })
    void testCalculateTotalPrice(double apartmentArea, boolean hasElevator,
                                 double houseArea, double landArea, boolean hasGarage,
                                 double officeArea, double warehouseArea,
                                 double expectedCost) {
        // Arrange
        RealEstateAgency realEstateAgency = new RealEstateAgency();
        Property apartment = new Apartment("Main street", 4, apartmentArea, hasElevator);
        Property house = new House("House Street", houseArea, landArea, hasGarage);
        Property office = new CommercialProperty("Office Street", officeArea, "Office");
        Property warehouse = new CommercialProperty("Warehouse Street", warehouseArea, "Warehouse");
        realEstateAgency.addProperty(apartment);
        realEstateAgency.addProperty(house);
        realEstateAgency.addProperty(office);
        realEstateAgency.addProperty(warehouse);

        // Act
        realEstateAgency.calculateTotalPrice();
        double totalPrice = realEstateAgency.getTotalPrice();

                // Assert
        assertEquals(expectedCost, totalPrice, 0.01);
    }

    @Test
    public void testApartmentCalculatePriceWithElevator() {
        Apartment apartment = new Apartment("Test Address", 5, 50, true);
        double expectedPrice = 50 * 1000 * 1.05; // Area * price per sqm * elevator factor
        assertEquals(expectedPrice, apartment.calculatePrice(), 0.01);
    }

    @Test
    public void testApartmentCalculatePriceWithoutElevator() {
        Apartment apartment = new Apartment("Test Address", 5, 50, false);
        double expectedPrice = 50 * 1000; // Area * price per sqm
        assertEquals(expectedPrice, apartment.calculatePrice(), 0.01);
    }

    @Test
    public void testHouseCalculatePriceWithGarage() {
        House house = new House("Test Address", 100, 300, true);
        double expectedPrice = (100 * 800) + (300 * 200) + 5000; // house area * price + land area * price + garage
        assertEquals(expectedPrice, house.calculatePrice(), 0.01);
    }

    @Test
    public void testHouseCalculatePriceWithoutGarage() {
        House house = new House("Test Address", 100, 300, false);
        double expectedPrice = (100 * 800) + (300 * 200); // house area * price + land area * price
        assertEquals(expectedPrice, house.calculatePrice(), 0.01);
    }

    @Test
    public void testCommercialPropertyOfficePrice() {
        CommercialProperty office = new CommercialProperty("Office Address", 150, "office");
        double expectedPrice = 150 * 1500; // area * price per sqm for office
        assertEquals(expectedPrice, office.calculatePrice(), 0.01);
    }

    @Test
    public void testCommercialPropertyWarehousePrice() {
        CommercialProperty warehouse = new CommercialProperty("Warehouse Address", 200, "warehouse");
        double expectedPrice = 200 * 800; // area * price per sqm for warehouse
        assertEquals(expectedPrice, warehouse.calculatePrice(), 0.01);
    }

    @Test
    public void testRealEstateAgencyAddValidProperty() {
        RealEstateAgency agency = new RealEstateAgency();
        Apartment apartment = new Apartment("Valid Address", 3, 70, true);
        agency.addProperty(apartment);
        assertFalse(agency.getProperties().isEmpty());
        assertEquals(1, agency.getProperties().size());
    }

    @Test
    public void testRealEstateAgencyAddInvalidProperty() {
        RealEstateAgency agency = new RealEstateAgency();
        Apartment invalidApartment = new Apartment(null, 3, -70, true); // Invalid due to null address and negative area
        agency.addProperty(invalidApartment);
        assertTrue(agency.getProperties().isEmpty());
    }

    @Test
    public void testRealEstateAgencyPropertyIsNull() {
        RealEstateAgency agency = new RealEstateAgency();
        Apartment invalidApartment = null; // Invalid due to null address and negative area
        agency.addProperty(invalidApartment);
        assertTrue(agency.getProperties().isEmpty());
    }

    @Test
    public void testRealEstateAgencyCalculateTotalPrice() {
        RealEstateAgency agency = new RealEstateAgency();
        Apartment apartment = new Apartment("Apartment Address", 3, 50, true);
        House house = new House("House Address", 120, 300, true);
        CommercialProperty office = new CommercialProperty("Office Address", 150, "office");

        agency.addProperty(apartment);
        agency.addProperty(house);
        agency.addProperty(office);

        double expectedTotalPrice = apartment.calculatePrice() + house.calculatePrice() + office.calculatePrice();
        agency.calculateTotalPrice();
        assertEquals(expectedTotalPrice, agency.getTotalPrice());
    }


}
