package classes;

public class PlataPayPal implements MetodaPlata {
    @Override
    public void plateste(double suma) {
        System.out.println("Plata prin PayPal: " + suma + " lei");
    }
}
