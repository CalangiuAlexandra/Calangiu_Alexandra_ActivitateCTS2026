package main;

import classes.AdapterBar;
import classes.SoftBar;
import classes.SoftBucatarie;

public class Main {
    public static void main(String[] args) {
        SoftBucatarie bucatarie = new SoftBucatarie();

        SoftBar bar = new AdapterBar(bucatarie);

        bar.printeazaFactura();
    }
}
