import builder.PachetTransport;
import builder.PachetTransportBuilder;

public class Main {
    public static void main(String[] args) {

        PachetTransport pachet = new PachetTransportBuilder()
                .setWifi(true)
                .setAerConditionat(true)
                .setTelevizor(true)
                .build();

        System.out.println(pachet);
    }
}