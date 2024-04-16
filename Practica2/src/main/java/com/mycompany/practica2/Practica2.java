/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.practica2;

/**
 *
 * @author kevin
 */
public class Practica2 {

    public static void main(String[] args) {
        Metodos obj = new Metodos();
        int opcion;

        do {
            opcion = obj.menu();
            switch (opcion) {
                case 1:
                    obj.escribir();
                    break;
                case 3:
                    obj.setArchivo("otraPractica.txt");
                    obj.escribir();
                    break;
                case 2:
                    obj.leer();
                    break;
                default: break;
            }
        } while (opcion != 0);
    }
}
