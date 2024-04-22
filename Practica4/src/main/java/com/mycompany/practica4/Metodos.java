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
    
    public Metodos(){
        this.sc=new Scanner(System.in);
        this.myArray=new int[10];
        this.ev=0;
    }
    public int menu(){
        System.out.println("Insertar lleno            [1]");
        System.out.println("Insertar en espacio libre [2]");
        System.out.println("Presentar                 [3]");
        System.out.println("Salir                     [0]");
        return sc.nextInt();
    }
    public void leerLleno(){
        for(int i=0; i<myArray.length;i++){
            System.out.println("Intertar elemento de posicion "+(i+1));
            myArray[i]=sc.nextInt();
        }
        ev=myArray.length;
    }
    public void leerSig(){
        if(ev<myArray.length){
            System.out.println("Inserte elemento: ");
                    myArray[ev]=sc.nextInt();
        }else
            System.out.println("Arreglo lleno...");
    }
    public void presentar(){
        for(int i=0;i<ev;i++){
        System.out.print(myArray[i]+", ");}
    }
}
