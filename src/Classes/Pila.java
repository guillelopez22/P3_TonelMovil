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
public class Pila {
   private Nodo TOS;
   public Pila(){
       TOS = null;
   }
   
   public void push(int x){
       Nodo nuevo;
       nuevo = new Nodo();
       nuevo.value = x;
       if(TOS == null){
           nuevo.next = null;
           TOS = nuevo;
       }
       else{
           nuevo.next = TOS;
           TOS = nuevo;
       }
   }
    
   public int pop(){
       if(TOS!=null){
           int info = TOS.value;
           TOS = TOS.next;
           return info;
       }
       else{
           return Integer.MAX_VALUE;
       }
   }
   
   public void peek(){
       Nodo n = TOS;
       System.out.println(n.getValue());
   }
}
