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

    Relacion_Destinos value = new Relacion_Destinos();
    Nodo next;

    public Nodo(Relacion_Destinos value) {
        this.value = value;
    }

    public Nodo() {

    }

    public Relacion_Destinos getValue() {
        return value;
    }

    public void setValue(Relacion_Destinos value) {
        this.value = value;
    }

    public Nodo getNext() {
        return next;
    }

    public void setNext(Nodo next) {
        this.next = next;
    }
}
