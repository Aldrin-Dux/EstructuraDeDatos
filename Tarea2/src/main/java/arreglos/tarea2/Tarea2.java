/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package arreglos.tarea2;

/**
 *
 * @author kevin
 */
public class Tarea2 {
    
    public static void main(String[] args) {
        int n;
        Metodos metodos = new Metodos();
        System.out.println("Ingrese a cuantos pacientes desea registrar");
        n = metodos.sc.nextInt();
        metodos.Preguntar(n);
    }
}
