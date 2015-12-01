package Classes;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *    //(2+3*(20/(15-10))*33)

 * @author isaac
 */
public class Node {

    private Object info;
    private Node next;

    public Node() {
        info = null;
        next = null;
    }

    public Node(Object o, Node n) {
        setInfo(o);
        setNext(n);
    }

    public void setInfo(Object o) {
        info = o;
    }

    public void setNext(Node n) {
        next = n;
    }

    public Object getInfo() {
        return info;
    }

    public Node getNext() {
        return next;
    }
}
