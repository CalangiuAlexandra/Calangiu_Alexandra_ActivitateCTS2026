package classes;

public abstract class NotaDecorator implements Nota {
    protected Nota nota;

    public NotaDecorator(Nota nota) {
        this.nota = nota;
    }

    @Override
    public void printeaza() {
        nota.printeaza();
    }
}
