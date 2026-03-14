package main;

import classes.Client;
import classes.IClient;

public class Main {
    public static void main(String[] args) {
        IClient clientExistent = new Client("Test", "test@yahoo.com");

        IClient clientRevenit = clientExistent.copiaza();

        System.out.println(clientExistent);
        System.out.println(clientRevenit);
    }
}
