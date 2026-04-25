package classes;

public class PlataCard implements MetodaPlata {
    @Override
    public void plateste(double suma) {
        System.out.println("Plata cu cardul: " + suma + " lei");
    }
}
