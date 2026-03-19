package classes;

class RestaurantFacade {
    private Masa masa;
    private Curatenie curatenie;
    private Servetele servetele;

    public RestaurantFacade() {
        this.masa = new Masa();
        this.curatenie = new Curatenie();
        this.servetele = new Servetele();
    }

    public boolean verificaMasa() {
        return masa.esteLibera()
                && curatenie.esteCurata()
                && servetele.areServetele();
    }
}
