package classes;

public class PlataCash implements MetodaPlata {
    @Override
    public void plateste(double suma) {
        System.out.println("Plata cash: " + suma + " lei");
    }
}
