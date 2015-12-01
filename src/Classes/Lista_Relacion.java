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
public class Lista_Relacion {

    Nodo head;

    public Lista_Relacion() {
        head = new Nodo();
    }

    public void insert(Relacion_Destinos relacion, int pos) {
        Nodo newNodo = new Nodo(relacion);
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
        Relacion_Destinos valor = temp.getValue();
        for (int i = 0; i < pos; i++) {
            temp = temp.getNext();
            valor = temp.getValue();

        }
        return valor;
    }

    public Relacion_Destinos removeFirst() {
        Relacion_Destinos tmp = first();
        head = head.next;
        return tmp;
    }

    public void delete(int pos) {
        System.out.println(pos);
        if (pos == 0 ) {
            Nodo temp = head;
            head=temp.getNext();
            System.out.println(head.getValue());
            System.out.println(temp.getValue());
            Relacion_Destinos data = temp.getValue();
            
            temp.setValue(null);
            temp.setNext(null);
            
        }else{
            
            Nodo temp = head;
            for (int i = 1; i < pos-1; i++) {
                temp = temp.getNext();
            }
            System.out.println(temp.getValue());
            Nodo temp2 = temp.getNext();
            temp.setNext(temp2.getNext());
            Relacion_Destinos data2= temp2.getValue();
            temp2.setValue(null);
            temp2.setNext(null);
            System.out.println(data2);
        }
    }

    public Relacion_Destinos first() {
        return head.getValue();
    }

    public void Print_Lista() {
        Nodo temp = head;
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

    public int getSize() {
        int cont = 0;
        while (head.getNext() != null) {
            cont++;
        }
        return cont;
    }
}
