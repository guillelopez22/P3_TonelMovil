/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author Memo
 */
public class Relacion_Destinos {
    int distancia;
    Lugar punto1, punto2;

    public Relacion_Destinos() {
    }



    
    public Relacion_Destinos(int distancia, Lugar punto1, Lugar punto2) {
        this.distancia = distancia;
        this.punto1 = punto1;
        this.punto2 = punto2;
    }

    public int getDistancia() {
        return distancia;
    }

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }

    public Lugar getPunto1() {
        return punto1;
    }

    public void setPunto1(Lugar punto1) {
        this.punto1 = punto1;
    }

    public Lugar getPunto2() {
        return punto2;
    }

    public void setPunto2(Lugar punto2) {
        this.punto2 = punto2;
    }

    @Override
    public String toString() {
        return ""+distancia;
    }
    
    
}
