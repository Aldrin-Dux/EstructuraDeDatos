/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica2;

import java.util.Scanner;
import java.io.*;

/**
 *
 * @author kevin
 */
public class Metodos {

    Scanner sc;
    File archivo;

    public Metodos() {
        this.sc = new Scanner(System.in);
        this.archivo = new File("Practica.txt");
    }

    public File otroArchivo(String otro) {
        return this.archivo = new File(otro);
    }

    public int menu() {
        System.out.println("Escribir archivo [1]");
        System.out.println("Leer archivo [2]");
        System.out.println("Ingresar un nuevo archivo [3]");
        System.out.println("Salir [0]");
        return sc.nextInt();
    }

    public void escribir() {
        FileWriter escribir;
        PrintWriter linea;
        String _nombre = "", _correo = "", _dir = "";

        if (!archivo.exists()) {
            try {
                archivo.createNewFile();
            } catch (Exception e) {

            }
        }
        try {
            sc.nextLine();
            System.out.println("Digite el nombre: ");
            _nombre = sc.nextLine();
            System.out.println("Digite el correo: ");
            _correo = sc.nextLine();
            System.out.println("Digite la direccion: ");
            _dir = sc.nextLine();
            escribir = new FileWriter(archivo, true);
            linea = new PrintWriter(escribir);
            linea.println(_nombre + "\n" + _correo + "\n" + _dir);
            linea.close();
        } catch (Exception e) {
        }
    }

    public void leer() {
        FileReader leer;
        BufferedReader almacenamiento;
        String cadena = "", nombre = "", correo = "", dir = "";
        try {
            leer = new FileReader(archivo);
            almacenamiento = new BufferedReader(leer);
            while (cadena != null) {
                try {
                    cadena = almacenamiento.readLine();
                    nombre = cadena;
                    cadena = almacenamiento.readLine();
                    correo = cadena;
                    dir = cadena;
                    if (cadena != null) {
                        System.out.printf("Nombre: %s\nCorreo: %s\nDireccion: %s\n",
                                nombre, correo, dir);
                    }
                } catch (Exception e) {
                }
            }
            almacenamiento.close();
            leer.close();
        } catch (Exception e) {

        }
    }

}
