package Nou;

public class SoftOnline extends ASoftOnline{
    public SoftOnline(String denumire) {
        super(denumire);
    }

    @Override
    public void printeazaOnline() {
        System.out.println("S-a printat online folosind softul " + this.denumire);
    }
}
