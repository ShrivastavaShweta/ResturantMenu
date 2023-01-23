package Main.java.org.resturant;

import java.util.ArrayList;
import java.util.Date;

public class Menu {
    private ArrayList<MenuItem> menuItems = new ArrayList<>();
    private Date lastUpdated;

    public void addMenuItem(MenuItem item){
        menuItems.add(item);
    }

    public void printMenu(){
        System.out.println(menuItems);
    }
}
