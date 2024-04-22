/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica4;

/**
 *
 * @author utpl
 */
public class Arreglos01 {

    public static void main(String[] args) {
        Metodos obj = new Metodos(5);
        Metodos obj1 = new Metodos(10);
        int opc;
        do {
            opc = obj.menu();
            switch (opc) {
                case 1 -> obj.leerLleno();
                case 2 -> obj.leerSig();
                case 3 -> obj.presentar();
                case 4 -> obj1.presentar();
                default -> {
                }
            }
        } while (opc != 0);

    }
}
