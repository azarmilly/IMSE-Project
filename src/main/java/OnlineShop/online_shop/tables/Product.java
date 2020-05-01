package OnlineShop.online_shop.tables;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity // This tells Hibernate to make a table out of this class

public class Product {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Integer productId;

    private double price;

    private String description;

    private boolean availability;

    private double rating;

    private int manufacturerId;

    public Integer getId() {
        return productId;
    }

    public void setId(Integer id) {
        this.productId = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

    public int getManufacturerId() {
        return manufacturerId;
    }

    public void setManufactorerId(int manufacturerId) {
        this.manufacturerId = manufacturerId;
    }
}
