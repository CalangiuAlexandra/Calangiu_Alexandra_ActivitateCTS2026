package model;

import java.util.ArrayList;
import java.util.List;

public class Florarie {
    private String nume;
    private String adresa;
    private List<String> flori;

    public Florarie(String nume, String adresa, List<String> flori) {
        this.nume = nume;
        this.adresa = adresa;
        this.flori = flori;
    }

    public void conbstruiesteBuchet(String floare){
        List<String> buchet = new ArrayList<>();
        buchet.add(floare);
    }

    public void decoreazaRestaurant(){
        System.out.println("Floraraia "+this.nume+ " se va ocupa de aranjamente pt nunta");
    }
}
