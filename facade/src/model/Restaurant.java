package model;

import java.util.List;

public class Restaurant {
    private List<String> meniu;
    private String adresa;
    private int pretMeniu;

    public Restaurant(List<String> meniu, String adresa, int pretMeniu) {
        this.meniu = meniu;
        this.adresa = adresa;
        this.pretMeniu = pretMeniu;
    }

    public void afisareMeniu(){
        for (var elem : meniu){
            System.out.println("Fel din meniu:"+elem);
        }
    }


    public void rezervaRestaurant(){
        System.out.println("s-a rezervat restaurantul cu meniul ");
        afisareMeniu();
    }
}
