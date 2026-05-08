package main;

import model.PachetMasinaAdapter;
import model.proiectExistent.IPachetTuristic;
import model.proiectExistent.Pachet;
import model.proiectNou.AMasina;
import model.proiectNou.Masina;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        IPachetTuristic pachet1 = new Pachet(3000,"Barcelona",5);
        pachet1.rezervaPachet();
        pachet1.descriere();

        AMasina masina = new Masina("Audi",20000,"rosu");
        masina.inchiriazaMasina();


        System.out.println("Apel metoda inchiriaza masina dupa ce am adaptat");
        IPachetTuristic pachetAdaptat = new PachetMasinaAdapter(masina);
        pachetAdaptat.rezervaPachet();

    }
}
