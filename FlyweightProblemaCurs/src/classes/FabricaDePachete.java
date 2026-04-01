package classes;

import java.util.HashMap;

public class FabricaDePachete {
    private HashMap<Integer, IPachetTuristic> pachete = new HashMap<>();

    public IPachetTuristic getPachet(int cod, String hotel, String destinatie, boolean micDejun) {
        if (!pachete.containsKey(cod)) {
            pachete.put(cod, new PachetTuristic(cod, hotel, destinatie, micDejun));
        }

        return pachete.get(cod);
    }
}
