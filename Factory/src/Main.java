import agentie.Agentie;
import factory.PachetFactory;
import pachete.PachetTuristic;

public class Main {
    public static void main(String[] args) {
        Agentie agentie = Agentie.getInstanta();

        PachetTuristic p1 = PachetFactory.createPachet("cazare");
        PachetTuristic p2 = PachetFactory.createPachet("transport");
        PachetTuristic p3 = PachetFactory.createPachet("complet");

        agentie.adaugaPachet(p1);
        agentie.adaugaPachet(p2);
        agentie.adaugaPachet(p3);

        p1.descriere();
        p2.descriere();
        p3.descriere();

        System.out.println(agentie);
    }
}