package Main.java.org.resturant;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private final LocalDate dateAdded = LocalDate.now();
    private Date lastUpdated;

    public ArrayList<MenuItem> getMenuItems() {
        return menuItems;
    }

    protected void addMenuItem(MenuItem newItem){
        String message = "Item has already been added";
        if (menuItems.contains(newItem)){
            System.out.println(message);
            return;
        }
        for (MenuItem item: menuItems){
            if (item.equals(newItem)){
                System.out.println(message);
                return;
            }
        }
        menuItems.add(newItem);
        lastUpdated = new Date();
    }

    public void removeMenuItem(MenuItem item){
        menuItems.remove(item);
        lastUpdated = new Date();
    }

    @Override
    public String toString() {
        StringBuilder appetizers = new StringBuilder();
        for (MenuItem item: menuItems){
            if (item.getCategory().toLowerCase().equals("appetizer")){
                appetizers.append("\n" + (item));
            }
        }
        StringBuilder mainCourse = new StringBuilder();
        for (MenuItem item: menuItems){
            if (item.getCategory().toLowerCase().equals("main course")){
                mainCourse.append("\n" + (item));
            }
        }
        StringBuilder dessert = new StringBuilder();
        for (MenuItem item: menuItems){
            if (item.getCategory().toLowerCase().equals("dessert")){
                dessert.append("\n" + (item));
            }
        }
        return "Resturant Menu \n" + "\n" + "Appetizers" + "\n" + appetizers + "\n" +
        "\nMain Course" + "\n" + mainCourse + "\n" +
        "\nDessert" + "\n" + dessert;

    }

    public boolean isNew(){
        LocalDate today = LocalDate.now();
        double daysBetween = dateAdded.until(today, ChronoUnit.DAYS);
        System.out.println(daysBetween + " days since it was added");
        return daysBetween < 90;
    }
}
