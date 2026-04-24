package main;

import classes.ProxyStergereCont;
import classes.StergereCont;
import classes.Utilizator;

public class Main {
    public static void main(String[] args) {
        StergereCont serviciu = new ProxyStergereCont();

        Utilizator admin = new Utilizator("Ion", "admin");
        Utilizator user = new Utilizator("Maria", "user");

        serviciu.sterge(admin);
        serviciu.sterge(user);
    }
}
