package model;

import java.util.ArrayList;
import java.util.List;

public class Facade {

    public void organizeazaNunta(){

        List<String> flori = new ArrayList<>();
        flori.add("Floare1");
        flori.add("Floare2");
        flori.add("Floare3");
        flori.add("Floare4");
        flori.add("Floare5");
        Florarie florarie = new Florarie("IRIS","ADRESA",flori);
        florarie.conbstruiesteBuchet("Liliac");
        florarie.conbstruiesteBuchet("Cala");
        florarie.decoreazaRestaurant();

        Lautar lautar = new Lautar("Nume Lautari",10000);
        lautar.inchiriazaLautar();

        List<String> men  = new ArrayList<>();
        men.add("Fel1");
        men.add("Fel2");
        men.add("Fel3");
        Restaurant restaurant = new Restaurant(men,"adresa restaurant",120);
        restaurant.afisareMeniu();
        restaurant.rezervaRestaurant();

    }

}
