package main;

import classes.IReteta;
import classes.ListaRetete;
import classes.Reteta;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<IReteta> retete = new ArrayList<>();
        List<String> solutii = new ArrayList<>();
        solutii.add("Azotat");
        List<Integer> cantitati = new ArrayList<>();
        cantitati.add(15);

        retete.add(new Reteta(solutii, cantitati));
        ListaRetete lista = new ListaRetete(retete);
        ListaRetete copie = lista.copiaza();

        System.out.println(lista);
        System.out.println(copie);
    }
}
