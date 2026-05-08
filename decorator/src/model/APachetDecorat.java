package model;

public abstract class APachetDecorat implements IPachet{


    protected IPachet pachet;

    public APachetDecorat(IPachet pachet) {
        this.pachet = pachet;
    }

    @Override
    public void vindePachet() {
        pachet.vindePachet();
    }

    public abstract void anuleazaVanarePachet();
}
