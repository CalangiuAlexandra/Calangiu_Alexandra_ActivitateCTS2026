import agentie.Agentie;
import pachete.PachetTuristic;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Agentie agentie1 = Agentie.getInstanta();
        Agentie agentie2 = Agentie.getInstanta();

        System.out.println(agentie1 == agentie2); // true

        agentie1.adaugaPachet(new PachetTuristic("Grecia", 500.4));
        agentie1.adaugaPachet(new PachetTuristic("Italia", 1500.42));

        System.out.printf(agentie1.toString());
        System.out.printf(agentie2.toString());
    }
}