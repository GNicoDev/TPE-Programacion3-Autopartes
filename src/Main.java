package src;
import src.model.Maquina;
import src.util.DatosMaquinas;
import src.util.LectorArchivo;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        File archivo = new File("data/configuración.txt");

        System.out.println("Ruta absoluta esperada: " + archivo.getAbsolutePath());
        System.out.println("¿Existe el archivo?: " + archivo.exists());
        System.out.println("¿Se puede leer el archivo?: " + archivo.canRead());
        System.out.println("¿Es un archivo válido?: " + archivo.isFile());



        String rutaArchivo = "data/configuración.txt"; // Asegúrate de que el archivo esté en la ubicación correcta

        try {
            DatosMaquinas datos = LectorArchivo.leerArchivo(rutaArchivo);

            System.out.println("Piezas Totales a producir: " + datos.getPiezasTotales());
            System.out.println("Máquinas disponibles:");

            List<Maquina> maquinas = datos.getMaquinas();
            for (Maquina maquina : maquinas) {
                System.out.println(maquina.getNombre() + " → " + maquina.getProduccion() + " piezas");
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}
