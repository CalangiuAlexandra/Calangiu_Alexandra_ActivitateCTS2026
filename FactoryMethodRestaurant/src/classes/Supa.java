package classes;

public class Supa extends FelMancare {
    public Supa(String tip) {
        this.tip = tip;
    }

    @Override
    public String toString() {
        return "Supa{" +
                "tip='" + tip + '\'' +
                '}';
    }

    @Override
    public String descriere() {
        return "Aceasta este " + this.tip;
    }
}
