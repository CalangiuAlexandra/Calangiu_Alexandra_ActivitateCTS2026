package classes;

public class Optiuni {
    private boolean cina;
    private int numarExcursii;

    public Optiuni(boolean cina, int numarExcursii) {
        this.cina = cina;
        this.numarExcursii = numarExcursii;
    }

    public boolean isCina() {
        return cina;
    }

    public int getNumarExcursii() {
        return numarExcursii;
    }
}
