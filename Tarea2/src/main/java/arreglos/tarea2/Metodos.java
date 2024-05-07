/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package arreglos.tarea2;

import java.io.*;
import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Metodos {

    Scanner sc;
    int cedula;
    String apellidos;
    String nombres;
    String fecha;
    double estatura;
    double peso;
    String alergias;
    File archivo;

    public Metodos() {
        this.sc = new Scanner(System.in);
        this.archivo = new File("pacientes.txt");
    }

    public void Preguntar(int n) {
        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese su cedula de identidad: ");
            cedula = sc.nextInt();
            sc.nextLine();
            System.out.println("Ingrese sus Apellidos: ");
            apellidos = sc.nextLine();
            System.out.println("Ingrese sus Nombres: ");
            nombres = sc.nextLine();
            System.out.println("Ingrese su fecha de nacimiento:");
            fecha = sc.nextLine();
            System.out.println("Ingrese su estatura: ");
            estatura = sc.nextDouble();
            System.out.println("Ingrese su peso: ");
            peso = sc.nextDouble();
            sc.nextLine();
            System.out.println("Ingrese sus Alergias: ");
            alergias = sc.nextLine();
            guardar();
        }

    }

    public void guardar() {
        FileWriter escribir;
        String cadena = String.format("Cedula: %d\nNombres y apellidos: %s\n"
                + "Fecha de nacimiento: %s\nEstatura: %.2fcm\n"
                + "Peso: %.2fkg\nAlergias: %s\n", cedula,
                nombres + " " + apellidos, fecha, estatura, peso, alergias);
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
}
