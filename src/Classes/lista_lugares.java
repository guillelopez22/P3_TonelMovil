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
public class lista_lugares{

    Nodo_lista_lugares head;
    public int tamano;

    public lista_lugares() {
        this.head = null;
        this.tamano = 0;
    }

    public Nodo_lista_lugares getHead() {
        return head;
    }

    public void setHead(Nodo_lista_lugares head) {
        this.head = head;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    public void insert(Lugar lugar) {
        Nodo_lista_lugares newNodo = new Nodo_lista_lugares(lugar);
        Nodo_lista_lugares temp = head;
        if (tamano == 0) {
            this.setHead(newNodo);
            tamano++;
        } else {
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(newNodo);
            tamano++;
        }
    }

    public void delete(int pos) {
        Nodo_lista_lugares temp = head;
        Nodo_lista_lugares temp2 = null;
        int cont = 0;
        while (temp.getNext() != null) {
            if (cont == pos - 1) {
                temp2 = temp;
            }

            if (cont == pos) {
                temp = temp.getNext();
                break;
            }
            temp = temp.getNext();
            cont++;
        }

        temp2.setNext(temp);
    }

    public void Print_Lista() {
        Nodo_lista_lugares temp = head;
        while (temp != null) {
            System.out.println(temp.getLugar());
            temp = temp.next;
        }
    }

    public Nodo_lista_lugares get(int pos) {
        Nodo_lista_lugares temp = head;
        Lugar temp2=temp.getLugar();
        for (int i = 0; i < pos; i++) {
            temp = temp.getNext();
            temp2=temp.getLugar();
        }
        return temp;
    }

    

}
