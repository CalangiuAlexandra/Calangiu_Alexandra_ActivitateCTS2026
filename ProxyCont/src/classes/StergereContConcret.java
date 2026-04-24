package classes;

public class StergereContConcret implements StergereCont {
    @Override
    public void sterge(Utilizator utilizator) {
        System.out.println("Cont sters de " + utilizator.getNume());
    }
}