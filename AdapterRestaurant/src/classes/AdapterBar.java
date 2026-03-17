package classes;

public class AdapterBar implements SoftBar {
    private SoftBucatarie softBucatarie;

    public AdapterBar(SoftBucatarie softBucatarie) {
        this.softBucatarie = softBucatarie;
    }

    @Override
    public void printeazaFactura() {
        softBucatarie.tiparesteBon();
    }
}
