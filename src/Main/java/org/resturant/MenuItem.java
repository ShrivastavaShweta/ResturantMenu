package Main.java.org.resturant;

import java.util.Date;
import java.util.Objects;

public class MenuItem {
    private String name;
    private double price;
    private String description;
    String category;
    //boolean isNew;
    private Date dateAdded;

    public MenuItem(String name, double price, String description, String category) {
        this.name = name;
        this.price = price;
        this.description = description;
        this.category = category;
        this.dateAdded = new Date();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Date getDateAdded() {
        return dateAdded;
    }

    @Override
    public String toString() {
        String newText = isNew() ? " - NEW!" : "";
        return  name + newText + "\n" + description + "\n" + category.toUpperCase() + " | $" + price;
    }

    @Override
    public boolean equals(Object objectToBeCompared) {
        if (this == objectToBeCompared) return true;
        if (objectToBeCompared == null || getClass() != objectToBeCompared.getClass()) return false;
        MenuItem otherItem = (MenuItem) objectToBeCompared;
        return this.name.equals(otherItem.getName());
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    boolean isNew(){
        return true;
    }
}
