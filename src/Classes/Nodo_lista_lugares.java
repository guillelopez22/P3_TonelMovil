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
    
    Nodo_lista_lugares next;
    Lugar lugar;

    
    public Nodo_lista_lugares(Lugar lugar) {
        this.next=null;
        this.lugar=lugar;        
    }

   
    

    public Nodo_lista_lugares getNext() {
        return next;
    }

    public void setNext(Nodo_lista_lugares next) {
        this.next = next;
    }

    public Lugar getLugar() {
        return lugar;
    }

    public void setLugar(Lugar lugar) {
        this.lugar = lugar;
    }
    
    
    
}
