/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author isaac
 */
public class LinkedList {
        
  protected Node first;
  int size=0;

  public LinkedList() {
    first = null;
  }

  public void insert(Object o) {

    Node temp = new Node(o, null);

    temp.setNext(first);
    first = temp;
    size++;
  }

  public Object get(){
      Object out = null;
      if(!isEmpty()){
          out = first.getInfo();
      }
      return out;
  }
  
  public Lugar getLugar(){
      Lugar out = null;
      if(!isEmpty()){
          out = (Lugar)first.getInfo();
      }
      return out;
  }
  
  public Object extract() {
    Object out = null;

    if (!isEmpty()) {
      out = first.getInfo();
      first = first.getNext();
    }
    return out;
    
  }

  public void print(int n) {
    if (!isEmpty()) {
      Node temp = first;

      for (int i = 0; i < n; i++) {
        temp = temp.getNext();
        if (temp == null)
          return;
      }
      System.out.println(temp.getInfo());
    }
  }

  public void print() {
    if (!isEmpty()) {
      Node temp = first;
      while (temp != null) {
        System.out.println(temp.getInfo());
        temp = temp.getNext();
      }
    }
  }

  public boolean isEmpty() {
    if (first == null)
      return true;
    else
      return false;
  }
  
  public LinkedList Voltear(LinkedList ListaAVoltear){
      LinkedList lista = new LinkedList();
      for (int i = 0; i < this.size; i++) {
          lista.insert(ListaAVoltear.extract());
      }
      return lista;
  }
  
}
