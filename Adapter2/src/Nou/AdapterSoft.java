package Nou;

import Existent.ISoftPrinare;

public class AdapterSoft implements ISoftPrinare {
    private ASoftOnline softOnline;

    public AdapterSoft(ASoftOnline softOnline) {
        this.softOnline = softOnline;
    }

    @Override
    public void afiseaza() {
        this.softOnline.printeazaOnline();
    }
}
