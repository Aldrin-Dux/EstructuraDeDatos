/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pruebaparcialparalelob;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author utpl
 */
public final class Metodos {

    File archivo;
    Scanner sc;
    int[] myArray;
    int ev;
    String[] nombre;
    String[] calculo;
    String[] programacion;
    String[] logica;
    int id = 0;
    String cadena = "";
    String nomb;
    String cal;
    String pro;
    String log;

    public int menu() {
        System.out.println("Insertar datos                 [1]");
        System.out.println("Salir                          [0]");
        return sc.nextInt();
    }

    public Metodos() {
        this.sc = new Scanner(System.in);
        this.archivo = new File("Aula.txt");
        this.myArray = new int[3];
        this.nombre = new String[myArray.length];
        this.calculo = new String[myArray.length];
        this.programacion = new String[myArray.length];
        this.logica = new String[myArray.length];
    }

    public void guardar() {
        while (id < myArray.length) {
            sc.nextLine();
            System.out.println("Inserte nombre en la posicion " + (id + 1));
            nomb= sc.nextLine();
            System.out.println("Inserte nota de calculo");
            cal= sc.nextLine();
            System.out.println("Inserte nota de programacion");
            pro= sc.nextLine();
            System.out.println("Inserte nota de logica");
            log= sc.nextLine();
            cadena = "Nombre: " + nomb + "\nnota calculo: " + cal + "\nnota "
                    + "programacion: " + pro + "\nnota logica:" + log + "\n";
            almacenar(cadena);
            id++;
        }
    }

    public void importar() {
        FileReader leer;
        BufferedReader almacenamiento;
        String cadena2="";
        String nueva;
        try {
            leer = new FileReader(archivo);
            almacenamiento = new BufferedReader(leer);
            while (cadena2 != null) {
                cadena2 = almacenamiento.readLine();
                nueva = cadena2.replaceAll("Desaprobado", "Liberado");
                almacenar(nueva);
            }
            almacenamiento.close();
            leer.close();

        } catch (Exception e) {
        }
    }

    public void almacenar(String cadena) {
        FileWriter escribir;
        PrintWriter linea;
        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
            } catch (Exception e) {
            }
        }
        try {
            escribir = new FileWriter(archivo, true);
            linea = new PrintWriter(escribir);
            linea.println(cadena);
            linea.close();
        } catch (Exception e) {

        }
    }
    public void arreglos(){
        
    }
}
