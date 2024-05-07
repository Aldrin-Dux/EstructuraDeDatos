/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.practica3;

/**
 *
 * @author kevin
 */
public class Practica3 {

    public static void main(String[] args) {
        System.out.println(fibo(10));
        System.out.println(potencia(2,6));
    }

    public static int fibo(int num) {
        if (num == 0) {
            return 0;
        }
        if (num == 1) {
            return 1;
        } else {
            return fibo(num - 1) + fibo(num - 2);
        }

    }

    public static int potencia(int base, int exponente) {
        if (exponente == 0) {
            return 1;
        } else if (exponente == 1) {
            return base;
        } else {
            return base*potencia(base, exponente - 1);
        }
    }
}
