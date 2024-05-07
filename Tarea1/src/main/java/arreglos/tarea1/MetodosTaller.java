/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos.tarea1;

import java.io.*;

/**
 *
 * @author kevin
 */
class MetodosTaller {

    File archivo;
    File archivo2;

    public MetodosTaller() {
        this.archivo = new File("Deudas.txt");
        this.archivo2 = new File("Deudas2.txt");
    }

    public void importar() {
        FileReader leer;
        BufferedReader almacenamiento;
        String cadena="";
        String nueva;
        try {
            leer = new FileReader(archivo);
            almacenamiento = new BufferedReader(leer);
            while (cadena != null) {
                cadena = almacenamiento.readLine();
                nueva = cadena.replaceAll("Central de Riesgo", "Liberado");
                guardar(nueva);
            }
            almacenamiento.close();
            leer.close();

        } catch (Exception e) {
        }
    }

    public void guardar(String nueva) {
        FileWriter escribir;
        PrintWriter linea;
        if (!archivo.exists()) {
            try {
                archivo2.createNewFile();
            } catch (Exception e) {
            }
        }
        try {
            escribir = new FileWriter(archivo2, true);
            linea = new PrintWriter(escribir);
            linea.println(nueva);
            linea.close();
        } catch (Exception e) {

        }
    }

}
