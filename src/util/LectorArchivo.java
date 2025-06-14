package src.util;

import src.model.Maquina;

import java.io.*;
import java.util.*;

public class LectorArchivo {

    public static DatosMaquinas leerArchivo(String rutaArchivo) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(rutaArchivo));
        List<Maquina> maquinas = new ArrayList<>();

        // Leer la primera línea (cantidad total de piezas a producir)
        int piezasTotales = Integer.parseInt(br.readLine().trim());

        // Leer las líneas restantes (máquinas y producción)
        String linea;
        while ((linea = br.readLine()) != null) {
            String[] partes = linea.split(",");
            if (partes.length == 2) {
                String nombre = partes[0].trim();
                int produccion = Integer.parseInt(partes[1].trim());
                maquinas.add(new Maquina(nombre, produccion));
            }
        }
        br.close();
        return new DatosMaquinas(piezasTotales, maquinas);
    }
}

