/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package arreglos.metodoordenacion;

/**
 *
 * @author kevin
 */
public class MetodoOrdenacion {

    int[] x = {2, 4, 7, 2, 5, 94, 66, 76, 86, 43, 64, 45, 65, 45};
    int ev = x.length;

    public void burbuja1() {
        for (int i = 0; i < ev - 1; i++) {
            for (int j = 0; j < ev - 1; j++) {
                if (x[j + 1] < x[j]) {
                    int r = x[j];
                    x[j] = x[j + 1];
                    x[j + 1] = r;

                }
            }

        }
        for (int i = 0; i < ev; i++) {

            System.out.printf("%d-", x[i]);

        }
    }
}
