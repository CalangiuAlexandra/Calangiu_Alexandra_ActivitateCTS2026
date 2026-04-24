package classes;

public class ProxyStergereCont implements StergereCont {
    private StergereCont stergere;

    public ProxyStergereCont() {
        this.stergere = new StergereContConcret();
    }

    @Override
    public void sterge(Utilizator utilizator) {

        if (utilizator.getRol().equals("admin")) {
            stergere.sterge(utilizator);
        } else {
            System.out.println("Acces interzis!");
        }
    }
}
