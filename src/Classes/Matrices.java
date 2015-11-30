/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author isaac
 */
public class Matrices {

    public Matrices() {

    }

    private int MatrizCoeficiente[][] = new int[51][51];
    private int MatrizAdyacencia[][] = new int[51][51];

    public int getMatrizCoeficiente(int i, int j) {
        return MatrizCoeficiente[i][j];
    }

    public int getMatrizAdyacencia(int i, int j) {
        return MatrizAdyacencia[i][j];
    }

    public void setMatrizCoeficiente(int i, int j, int mCoeficiente) {
        this.MatrizCoeficiente[i][j] = mCoeficiente;
    }

    public void setMatrizAdyacencia(int i, int j, int mAdyacencia) {
        this.MatrizAdyacencia[i][j] = mAdyacencia;
    }
    
    public void print(){
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("["+MatrizAdyacencia[i][j]+"]");
            }
            System.out.println("");
        }
    }
    public void print2(){
        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {
                System.out.print("["+MatrizCoeficiente[i][j]+"]");
            }
            System.out.println("");
        }
    }
}
