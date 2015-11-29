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
    private int size = 0;

    public lista_lugares() {
        head = new Nodo_lista_lugares();
    }

    public void insert(Lugar value, int pos) {
        Nodo_lista_lugares newNodo_lista_lugares = new Nodo_lista_lugares(value);
        Nodo_lista_lugares newHead = head;
        int cont = 0;
        if (pos == 0) {
            newNodo_lista_lugares.setNext(head);
            this.setHead(newNodo_lista_lugares);
        }
        while (newHead.getNext() != null) {
            newHead = newHead.getNext();
            cont++;
            if (cont == pos) {
                break;
            }
        }
        Nodo_lista_lugares n = newHead.getNext();
        newHead.setNext(newNodo_lista_lugares);
        newNodo_lista_lugares.setNext(n);
    }

    public void setHead(Nodo_lista_lugares head) {
        this.head = head;
    }
    

    public int find(int num) {
        return 0;
    }

    public Lugar get(int pos) {
        Nodo_lista_lugares temp = head;
        Lugar valor = temp.getValue();
        for (int i = 0; i < pos; i++) {
            temp = temp.getNext();
            valor = temp.getValue();

        }
        return valor;
    }

    public void delete(int pos) {
        Nodo_lista_lugares temp = head;
        for (int i = 1; i < pos - 1; i++) {
            temp = temp.getNext();
        }
        Nodo_lista_lugares temp2 = temp.getNext();
        temp.setNext(temp2.getNext());
    }

    public Lugar first() {
        return head.getValue();
    }

    public void Print_Lista() {
        Nodo_lista_lugares temp = head;
        int cont = 0;
        while (temp != null) {
            if (cont == 0) {
                System.out.print("[H]");
            }
            if (temp.getNext() != null) {
                System.out.print("[" + temp.getValue() + "] - ");
                cont++;
            } else {
                System.out.print("[" + temp.getValue() + "]");
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
