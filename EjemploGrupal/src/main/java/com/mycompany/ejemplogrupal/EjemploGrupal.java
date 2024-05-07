/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.ejemplogrupal;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class EjemploGrupal {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] arreglo;
        int cantidad;
        System.out.println("Ingrese cuantas frutas va a ingresar: ");
        cantidad = sc.nextInt();
        sc.nextLine();
        arreglo = new String[cantidad];
        for (int f = 0; f < cantidad; f++) {
            System.out.println("Ingrese una fruta: ");
            arreglo[f] = sc.nextLine();
        }
        System.out.println();
        for (int f = 0; f < cantidad; f++) {
            System.out.printf(arreglo[f] + " ");
        }

    }
}
