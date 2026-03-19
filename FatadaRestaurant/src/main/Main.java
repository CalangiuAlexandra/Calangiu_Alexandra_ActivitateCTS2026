package main;

import classes.RestaurantFacade;

public class Main {
    public static void main(String[] args) {
        RestaurantFacade facade = new RestaurantFacade();
        if (facade.verificaMasa()) {
            System.out.println("Clientul poate fi asezat la masa si servit");
        } else {
            System.out.println("Masa este inca in lucru");
        }
    }
}
