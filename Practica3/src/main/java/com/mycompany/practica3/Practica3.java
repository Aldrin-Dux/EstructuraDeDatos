/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.practica3;

/**
 *
 * @author utpl
 */
public class Practica3 {

    public static void main(String[] args) {

    }

    /*public int fibo(int num) {
        if (num == 0) {
            return 0;
        } else if (num == 1) {
            return 1;
        } else {
            return fibo(num - 1) + fibo(num - 2);
        }
    }*/

    public int expo(int e, int b) {
        int pot = 3;
        int num = 4;
        for (int i = 1; i == e; i++) {
            num = num * pot;
        }
        System.out.println("Total: " + num);
        return num;
    }
}
