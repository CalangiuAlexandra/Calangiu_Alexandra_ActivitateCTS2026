package classes;


import java.util.ArrayList;
import java.util.List;

public class Spital implements ISpital {
    private String nume;
    private List<Pacient> listaPacient = new ArrayList<>();

    public Spital(String nume) {
        this.nume = nume;
    }

    @Override
    public void aboneazaPacient(Pacient pacient) {
        listaPacient.add(pacient);
    }

    @Override
    public void dezaboneazaPacient(Pacient pacient) {
        listaPacient.remove(pacient);
    }

    @Override
    public void notificaPacient(String mesaj) {
        for(Pacient pacient : listaPacient){
            pacient.notificare(mesaj);
        }
    }

    public void notificaVirusNou(){
        notificaPacient("A aparut un virus nou");
    }
    public void notificaEpidemie(){
        notificaPacient("A aparut o epidemie");
    }
}
