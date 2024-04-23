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
        Metodos obj = new Metodos();
        int opc, num,pos;
        do {
            opc = obj.menu();
            switch (opc) {
                case 1:
                    obj.leerLleno();
                    break;
                case 2:
                    obj.leerSig();
                    break;
                case 3:
                    obj.presentar();
                    break;
                case 4:
                    System.out.println("Numero a buscar?");
                    num = obj.sc.nextInt();
                    if (obj.secuencial(num) != -1) {
                        System.out.println("Esta en posicion " + obj.secuencial(num));
                    } else {
                        System.out.println("No esta...");
                    }
                    break;
                case 5:
                    System.out.println("Numero a eliminar");
                    num = obj.sc.nextInt();
                    obj.eliminar(num);
                    break;
                case 6:
                    System.out.println("Numero a insertar");
                    num = obj.sc.nextInt();
                    System.out.println("Posicion?");
                    pos=obj.sc.nextInt();
                    obj.insertar(num,pos);
                    break;
                default:
                    break;
            }
        } while (opc
                != 0);
    }
}
