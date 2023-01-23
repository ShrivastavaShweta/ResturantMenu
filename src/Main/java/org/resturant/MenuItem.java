package Main.java.org.resturant;

import java.util.Date;

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

//    public boolean isNew() {
//        return isNew;
//    }
//
//    public void setNew(boolean aNew) {
//        isNew = aNew;
//    }


}
