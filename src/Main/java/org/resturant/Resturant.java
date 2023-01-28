package Main.java.org.resturant;

public class Resturant {

    public static void main(String[] args) {
        MenuItem item1 = new MenuItem("Pepperoni Pizza",7.39, "The classic pizza","Main Course");
        MenuItem item2 = new MenuItem("Toasted Raviolli",6.89, "A St Louis favourite","Appetizer");
        MenuItem item3 = new MenuItem("Chocolate Cake",4.99, "Rich and decadent cake","Dessert");
        MenuItem item4 = new MenuItem("Veggie Pizza",6.39, "Choose your own veggie toppings pizza","Main Course");
        MenuItem item5 = new MenuItem("Garlic Breadsticks",6.39, "Cheesy and Garlicky","Appetizer");
        MenuItem item6 = new MenuItem("Garlic Breadsticks",6.39, "Cheesy and Garlicky","Appetizer");

        //System.out.println(item2);

        Menu menu = new Menu();
        menu.addMenuItem(item1);
        menu.addMenuItem(item2);
        menu.addMenuItem(item3);
        menu.addMenuItem(item4);
        menu.addMenuItem(item5);
        menu.addMenuItem(item6);

        //System.out.println(menu.getMenuItems().size());
        System.out.println(menu);

        //test .equal method
        System.out.println(item1.equals(item2));
        System.out.println(item5.equals(item6));

        //remove item
        menu.removeMenuItem(item4);
        System.out.println(menu);


    }
}
