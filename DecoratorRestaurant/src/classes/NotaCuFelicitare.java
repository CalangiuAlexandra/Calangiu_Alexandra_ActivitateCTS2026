package classes;

public class NotaCuFelicitare extends NotaDecorator {
    public NotaCuFelicitare(Nota nota) {
        super(nota);
    }

    @Override
    public void printeaza() {
        super.printeaza();
        adaugaFelicitare();
    }

    private void adaugaFelicitare() {
        System.out.println("La multi ani!");
    }
}
