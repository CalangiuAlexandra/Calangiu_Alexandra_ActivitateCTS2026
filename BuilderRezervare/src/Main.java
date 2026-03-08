import classes.IRezervareBuilder;
import classes.Rezervare;
import classes.RezervareBuilder;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        IRezervareBuilder builder = new RezervareBuilder();
        Rezervare rezervare = builder.setAsezareGeam(false).setDecorareMese(true).setGenMuzica("HipHop").setMuzicaAmbientala(true).setScaundeErgonomice(false).build();
        System.out.println(rezervare);
    }
}