/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.practica1;

/**
 *
 * @author kevin
 */
public class Practica1 {

    public static void main(String[] args) {
        Metodos obj = new Metodos();
        int opc;
        do {
            opc = obj.menu();
            switch (opc) {
                case 1:
                    obj.carXcar();
                case 2: 
                    obj.caracteres();
                case 3: 
                    obj.palindromo();
                case 4:
                    obj.conteo();
            }
        } while (opc != 0);
    }
}
