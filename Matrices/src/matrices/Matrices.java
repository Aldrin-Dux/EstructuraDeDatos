/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

/**
 *
 * @author utpl
 */
public class Matrices {

    public static void main(String[] args) {
        Metodos obj = new Metodos(4, 4);
        int opc, num, resp;
        do {
            opc = obj.menu();
            switch (opc) {
                case 1 ->
                    obj.llenaMatris();
                case 2 ->
                    obj.presentaMatris(obj.myMat);
                case 3 ->
                    obj.transponer3(4, 4);
                case 4 ->
                    obj.presentaMatris(obj.myMat2);
            }
        } while (opc != 0);
    }
}
