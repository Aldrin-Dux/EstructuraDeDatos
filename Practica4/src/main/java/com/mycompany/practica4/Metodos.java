/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica4;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Metodos {

    Scanner sc;
    int[] myArray;
    int ev;

    public Metodos() {
        this.sc = new Scanner(System.in);
        this.myArray = new int[6];
        this.ev = 0;
    }

    public int menu() {
        System.out.println("Insertar lleno            [1]");
        System.out.println("Insertar en espacio libre [2]");
        System.out.println("Presentar                 [3]");
        System.out.println("Buscar sec...             [4]");
        System.out.println("Eliminar                  [5]");
        System.out.println("Insertar                  [6]");
        System.out.println("Burbujear mayor           [7]");
        System.out.println("Salir                     [0]");
        return sc.nextInt();
    }

    public void leerLleno() {
        for (int i = 0; i < myArray.length; i++) {
            System.out.println("Intertar elemento de posicion " + (i + 1));
            myArray[i] = sc.nextInt();
            if (i > 0) {
                if (myArray[i] == myArray[i - 1]) {
                    System.out.println("Numero repetido");
                    i--;
                }
            }
        }
        ev = myArray.length;
    }

    public void leerSig() {
        if (ev < myArray.length) {
            System.out.println("Inserte elemento: ");
            myArray[ev] = sc.nextInt();
        } else {
            System.out.println("Arreglo lleno...");
        }
    }

    public int secuencial(int num) {
        for (int i = 0; i < ev; i++) {
            if (num == myArray[i]) {
                return i;
            }
        }
        return -1;
    }

    public void presentar() {
        for (int i = 0; i < ev; i++) {
            if (i > 0) {
                if (myArray[i] < myArray[i - 1]) {
                    myArray[i - 1] = myArray[i];
                    myArray[i] = myArray[i - 1];
                    i--;
                }
            }
        }
        for (int i = 0; i < ev; i++) {
            System.out.print(myArray[i] + ", ");
        }
        System.out.println();
    }

    public void recorrerIzq(int pos) {
        for (int i = pos; i < ev - 1; i++) {
            myArray[i] = myArray[i + 1];
        }
    }

    public void eliminar(int num) {
        int pos = secuencial(num);
        if (pos != -1) {
            recorrerIzq(pos);
            ev--;
        } else {
            System.out.println("No existe...");
        }
    }

    public void recorrerDer(int pos) {
        for (int i = ev; i > pos; i--) {
            myArray[i] = myArray[i - 1];
        }
    }

    public void insertar(int num, int pos) {
        if (ev < myArray.length) {
            recorrerDer(pos);
            myArray[pos] = num;
            ev++;
        } else {
            System.out.println("Arreglo lleno...");
        }
    }

    public void burbuja1() {
        int aux;
        for (int i = 0; i < ev - 1; i++) {
            for (int j = 0; j < ev - 1; j++) {
                if (myArray[j] > myArray[j + 1]) {
                    aux = myArray[j];
                    myArray[j] = myArray[j + 1];
                    myArray[j + 1] = aux;
                }
            }
        }
    }

    public void burbuja2() {
        int aux;
        for (int i = 0; i < ev - 1; i++) {
            for (int j = i +1; j < ev; j++) {
                if (myArray[i] > myArray[j]) {
                    aux = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = aux;
                }
            }
        }
    }
}
