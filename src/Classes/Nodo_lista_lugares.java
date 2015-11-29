/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author jordi
 */
public class Nodo_lista_lugares {
    
    Lugar value = new Lugar();
    Nodo_lista_lugares next;

    public Nodo_lista_lugares(Lugar value) {
        this.value = value;
    }

    public Nodo_lista_lugares() {

    }

    public Lugar getValue() {
        return value;
    }

    public void setValue(Lugar value) {
        this.value = value;
    }

    public Nodo_lista_lugares getNext() {
        return next;
    }

    public void setNext(Nodo_lista_lugares next) {
        this.next = next;
    }
    
    
    
}
