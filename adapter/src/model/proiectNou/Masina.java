package model.proiectNou;

public class Masina extends AMasina{


    public Masina(String marca, int nrKm, String culoare) {
        super(marca, nrKm, culoare);
    }

    @Override
    public void inchiriazaMasina() {
        System.out.println("S-a inchiriat masina "+ super.marca);
    }
}
