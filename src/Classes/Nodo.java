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
public class Nodo {

    Relacion_Destinos RelacionDestinos = new Relacion_Destinos();
    Nodo next;
    int value;
    Nodo padre;
    Nodo izquierda;
    Nodo derecha;
    

    public Nodo(Relacion_Destinos RelacionDestinos) {
        this.RelacionDestinos = RelacionDestinos;
    }

    public Nodo() {

    }

    public Relacion_Destinos getRelacionDestinos() {
        return RelacionDestinos;
    }

    public void setRelacionDestinos(Relacion_Destinos RelacionDestinos) {
        this.RelacionDestinos = RelacionDestinos;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
    
        
    public Nodo(int value){
        this.value = value;
    }
    
    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Nodo getPadre() {
        return padre;
    }

    public void setPadre(Nodo padre) {
        this.padre = padre;
    }

    public Nodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(Nodo izquierda) {
        this.izquierda = izquierda;
    }

    public Nodo getDerecha() {
        return derecha;
    }

    public void setDerecha(Nodo derecha) {
        this.derecha = derecha;
    }
    
    
}
