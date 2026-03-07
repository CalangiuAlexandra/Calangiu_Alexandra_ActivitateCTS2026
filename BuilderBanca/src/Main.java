import builder.ContBancar;
import builder.ContBancarBuilder;

public class Main {

    public static void main(String[] args) {

        ContBancar cont1 = new ContBancarBuilder("Ion Popescu")
                .setContSalariu(true)
                .setCardAtasat(true)
                .build();

        ContBancar cont2 = new ContBancarBuilder("Maria Ionescu")
                .setInternetBanking(true)
                .build();

        ContBancar cont3 = new ContBancarBuilder("Andrei Popa")
                .build();

        System.out.println(cont1);
        System.out.println(cont2);
        System.out.println(cont3);
    }
}