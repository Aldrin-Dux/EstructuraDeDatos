/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package matrices;

import java.util.Scanner;

/**
 *
 * @author utpl
 */
public class Metodos {

    Scanner entrada;
    int[][] myMat;
    int[][] myMat2;

    public Metodos(int n, int m) {
        this.entrada = new Scanner(System.in);
        this.myMat = new int[n][m];
        this.myMat2 = new int[n][m];
    }

    public int menu() {
        System.out.println("Llenar matriz        [1]");
        System.out.println("Presentar matriz     [2]");
        System.out.println("Transponer matriz    [3]");
        System.out.println("Presentar traspuesta [4]");
        System.out.println("Salir                [0]");
        return entrada.nextInt();
    }

    public void llenaMatris() {
        for (int i = 0; i < myMat.length; i++) {
            for (int j = 0; j < myMat.length; j++) {
                System.out.println("Elemento [" + i + "]{" + j + "]: ");
                myMat[i][j] = entrada.nextInt();
            }
        }
    }

    public void presentaMatris(int[][] x) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                System.out.print(x[i][j] + "\t ");
            }
            System.out.println(" ");
        }
    }

    public void transponer() {
        for (int i = 0; i < myMat.length; i++) {
            for (int j = 0; j < myMat[0].length; j++) {
                myMat2[j][i] = myMat[i][j];
            }
        }
    }

    public void transponer2() {
        for (int i = 0; i < myMat.length - 1; i++) {
            for (int j = i + 1; j < myMat[0].length; j++) {
                int aux = myMat[i][j];
                myMat[i][j] = myMat[j][i];
                myMat[j][i] = aux;
            }
        }
    }

    public void transponer3(int n, int m) {
        int aux;
        n = n - 1;
        m = m - 1;
        for (int i = 0; i < myMat.length; i++) {
            for (int j = 0; j < myMat[0].length; j++) {
                if (myMat[i][j] == myMat[n - m][m]) {
                    aux = myMat[i][j];
                    myMat[i][j] = myMat[n][m - n];
                    myMat[j][i] = aux;
                    n--;
                    m--;
                }
            }
        }
    }
}
