/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Classes.Nodo;

/**
 *
 * @author Memo
 */
public class Lista_Relacion {
    Nodo head;
    private int size = 0;

    public Lista_Relacion() {
        head = new Nodo();
    }

    public void insert(Relacion_Destinos value, int pos) {
        Nodo newNodo = new Nodo(value);
        Nodo newHead = head;
        int cont = 0;
        if (pos == 0) {
            newNodo.setNext(head);
            this.setHead(newNodo);
        }
        while (newHead.getNext() != null) {
            newHead = newHead.getNext();
            cont++;
            if (cont == pos) {
                break;
            }
        }
        Nodo n = newHead.getNext();
        newHead.setNext(newNodo);
        newNodo.setNext(n);
    }

    public void setHead(Nodo head) {
        this.head = head;
    }

    public int find(int num) {
        return 0;
    }

    public Relacion_Destinos get(int pos) {
        Nodo temp = head;
        Relacion_Destinos valor = temp.getRelacionDestinos();
        for (int i = 0; i < pos; i++) {
            temp = temp.getNext();
            valor = temp.getRelacionDestinos();

        }
        return valor;
    }

    public void delete(int pos) {
        Nodo temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.getNext();
        }
        Nodo temp2 = temp.getNext();
        temp.setNext(temp2.getNext());
    }

    public Relacion_Destinos first() {
        return head.getRelacionDestinos();
    }

    public void Print_Lista() {
        Nodo temp = head;
        int cont = 0;
        while (temp != null) {
            if (cont == 0) {
                System.out.print("[H]");
            }
            if (temp.getNext() != null) {
                System.out.print("[" + temp.getRelacionDestinos() + "] - ");
                cont++;
            } else {
                System.out.print("[" + temp.getRelacionDestinos() + "]");
                cont++;
            }
            temp = temp.next;
        }
        System.out.println("");
    }

    public void setSize(int size) {
        this.size = size;
    }
    public int getSize(){
        return size;
    }
}
