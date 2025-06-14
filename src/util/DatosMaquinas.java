package src.util;

import src.model.Maquina;

import java.util.List;
// Esta clase es la encargada de almacenar los datos obtenidos desde la clase LectorArchivo.java
public class DatosMaquinas {
    private int piezasTotales;
    private List<Maquina> maquinas;

    public DatosMaquinas(int piezasTotales, List<Maquina> maquinas) {
        this.piezasTotales = piezasTotales;
        this.maquinas = maquinas;
    }

    public int getPiezasTotales() {
        return piezasTotales;
    }

    public List<Maquina> getMaquinas() {
        return maquinas;
    }


}
