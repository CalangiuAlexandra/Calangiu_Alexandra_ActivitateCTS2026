import classes.FelMancare;
import factory.FabricaDesert;
import factory.FabricaMancare;
import factory.FabricaSupa;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        FabricaMancare fabricaDesert = new FabricaDesert();
        FabricaMancare fabricaSupe = new FabricaSupa();

        FelMancare desert = fabricaDesert.creeazaObiect("Papanasi");
        System.out.println(desert);
        FelMancare supaTaietei = fabricaSupe.creeazaObiect("Supa taietei");
        System.out.println(supaTaietei);
    }
}