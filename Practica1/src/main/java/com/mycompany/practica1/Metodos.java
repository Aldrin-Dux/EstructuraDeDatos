/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.practica1;

import java.util.Scanner;

/**
 *
 * @author kevin
 */
public class Metodos {

    Scanner sc = new Scanner(System.in);

    public int menu() {
        System.out.println("MENU PRINCIPAL");
        System.out.println("Salir del ciclo [0]");
        System.out.println("Imprimir caracter por caracter [1]");
        System.out.println("Imprimir numero de caracteres [2]");
        System.out.println("Imprimir si es palindromo [3]");
        System.out.println("Imprimir si es vocal o consonante [4]");
        return sc.nextInt();
    }

    public void carXcar() {
        String cadena;
        sc.nextLine();
        System.out.println("Digite la cadena a imprimir: ");
        cadena = sc.nextLine();
        System.out.println("La cadena es: " + cadena);
        System.out.println("El tamaño de la cadena es: " + cadena.length());
        for (int i = 0; i < cadena.length(); i++) {
            System.out.println(cadena.substring(i, i + 1));
        }

    }

    public void caracteres() {
        String cadena;
        char caracter;
        int cont = 0;
        sc.nextLine();
        System.out.println("Digite la cadena: ");
        cadena = sc.nextLine();
        System.out.println("Ingrese el caracter que desea ver: ");
        caracter = sc.next().charAt(0);
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.charAt(i) == caracter) {
                cont++;
            }
        }
        System.out.println("El caracter " + caracter + " se repite: " + cont + " veces");
    }

    public String eliminarEspacios(String cad) {
        return cad.replace(" ", "");
    }

    public void palindromo() {
        String cadena, cad;
        boolean sies = true;
        int i = 0;
        sc.nextLine();
        System.out.println("Digite la cadena a verificar: ");
        cadena = sc.nextLine();
        cad = eliminarEspacios(cadena);
        while (i < cad.length() / 2 && (sies)) {
            if (cad.charAt(i) != cad.charAt(cad.length() - 1 - i)) {
                sies = false;

            }
            i++;

        }
        if (sies == false) {
            System.out.println("No es palindromo");
        } else {
            System.out.println("Si es palindromo");
        }

    }

    public void conteo() {
        String cadena, cad;
        int voc = 0, con = 0;
        sc.nextLine();
        System.out.println("Digite la cadena a verificar: ");
        cadena = sc.nextLine();
        cad = eliminarEspacios(cadena);
        cad = cad.toLowerCase();
        for (int i = 0; i < cad.length(); i++) {
            if ((cad.charAt(i) == 'a') || (cad.charAt(i) == 'e') || (cad.charAt(i) == 'i')
                    || (cad.charAt(i) == 'o') || (cad.charAt(i) == 'u')) {
                voc++;
            } else {
                con++;
            }
        }
        System.out.println("Existen "+voc+" vocales y "+con+" consonantes...");

    }

}
