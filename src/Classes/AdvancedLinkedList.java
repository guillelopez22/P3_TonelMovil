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
public class AdvancedLinkedList extends LinkedList {
        public AdvancedLinkedList() {
    super();
  }

  public void insert(Object o, int n) {

    if (isEmpty() || n <= 0) {
      insert(o);
    } else {
     
      Node iterator = first;

      for (int i = 1; i < n; i++) {
        if (iterator.getNext() == null)
          break;
        iterator = iterator.getNext();
      }

      Node tmp = new Node(o, iterator.getNext());
      iterator.setNext(tmp);
    }
  }

  public Object extract(int n) {
    if (n <= 0 ||
        isEmpty() ||
        first.getNext() == null) { 
      return extract();
    }

    Node prev;
    {
      prev = first;
      Node current = first.getNext();
      int i = 1;
      while (current.getNext() != null && i != n) {
        prev = current;
        current = current.getNext();
        i++;
      }
    }

    Object info = prev.getNext().getInfo();
    prev.setNext(prev.getNext().getNext());
    return info;
  }

  public String toString(int n) {
    String out = null;
    if (!isEmpty()) {
      Node temp = first;
      
      for (int i = 0; i < n; i++) {
        temp = temp.getNext();
        if (temp == null)
          return out;
      }
      out = temp.getInfo().toString();
    }
    return out;
  }

  public String toString() {
    String out = null;
    
    if (!isEmpty()) {
      out = "";
      Node temp = first;
      while (temp != null) {
        out = out + temp.getInfo() + " ";
        temp = temp.getNext();
      }
    }
    
    return out.trim();
  }
}
