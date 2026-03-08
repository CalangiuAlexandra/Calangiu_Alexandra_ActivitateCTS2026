package classes;

public class Desert extends FelMancare {
    public Desert(String tip) {
        this.tip = tip;
    }

    @Override
    public String toString() {
        return "Desert{" +
                "tip='" + tip + '\'' +
                '}';
    }

    @Override
    public String descriere() {
        return "Aceasta este " + this.tip;
    }
}
