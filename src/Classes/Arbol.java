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
public class Arbol {
    Nodo raiz;
    Pila PilaMinima = new Pila();
    Pila PilaMaxima = new Pila();
    
    public Arbol(int value){
        this.raiz = new Nodo(value);
    }
    
    public Arbol(Nodo raiz){
        this.raiz = raiz;
    }
    
    public Nodo getRaiz(){
        return raiz;
    }
    
    public void setRaiz(Nodo raiz){
        this.raiz = raiz;
    }

    public Pila getPilaMinima() {
        return PilaMinima;
    }

    public void setPilaMinima(Pila PilaMinima) {
        this.PilaMinima = PilaMinima;
    }

    public Pila getPilaMaxima() {
        return PilaMaxima;
    }

    public void setPilaMaxima(Pila PilaMaxima) {
        this.PilaMaxima = PilaMaxima;
    }
    
    public void addNodo(Nodo nodo, Nodo raiz){
        if(raiz == null){
            this.setRaiz(nodo);
        }
        else{
            if(nodo.getValue()<=raiz.getValue()){
                if(raiz.getIzquierda()==null){
                    raiz.setIzquierda(nodo);
                }
                else{
                    addNodo(nodo, raiz.getIzquierda());
                }
            }
            else{
                if(raiz.getDerecha()==null){
                    raiz.setDerecha(nodo);
                }
                else{
                    addNodo(nodo, raiz.getDerecha());
                }
            }
        }
    }
    public void addNodo(Nodo nodo){
        this.addNodo(nodo, this.raiz);
    }
    public boolean removeNodo(Nodo nodo){
        boolean TieneDerecho = nodo.getDerecha() != null? true:false;
        boolean TieneIzquierda = nodo.getIzquierda() != null? true:false;
        
        if(!TieneDerecho && !TieneIzquierda){
            return removeNodoCaso1(nodo);
        }
        if(TieneDerecho && !TieneIzquierda){
            return removeNodoCaso2(nodo);
        }
        if(!TieneDerecho && TieneIzquierda){
            return removeNodoCaso3(nodo);
        }
        return false;
    }
    public boolean removeNodoCaso1(Nodo nodo){
        //SE QUIERE ELIMINAR SOLAMENTE UN NODO SIN HIJOS
        Nodo Izquierdo = nodo.getPadre().getIzquierda();
        Nodo Derecho = nodo.getPadre().getDerecha();
        
        if(Izquierdo == nodo){
            nodo.getPadre().setIzquierda(null);
            return true;
        }
        if(Derecho == nodo){
            nodo.getPadre().setDerecha(null);
            return true;
        }
        return false;
    }
    public boolean removeNodoCaso2(Nodo nodo){
    //SE QUIERE ELIMINAR UN NODO CON UN SUBARBOL HIJO
        Nodo Izquierdo = nodo.getPadre().getIzquierda();
        Nodo Derecho = nodo.getPadre().getDerecha();
        
        Nodo HijoActual = nodo.getIzquierda() != null ?
                nodo.getIzquierda() : nodo.getDerecha();
        
        if(Izquierdo == nodo){
            nodo.getPadre().setIzquierda(HijoActual);
            HijoActual.setPadre(nodo.getPadre());
            nodo.setDerecha(null);
            nodo.setIzquierda(null);
            return true;
        }
        
        if(Derecho == nodo){
            nodo.getPadre().setDerecha(HijoActual);
            HijoActual.setPadre(nodo.getPadre());
            nodo.setDerecha(null);
            nodo.setIzquierda(null);
            return true;
        }
        return false;
        
    }
    public boolean removeNodoCaso3(Nodo nodo){
     //SE QUIERE ELIMINAR DOS SUBARBOLES HIJOS
        Nodo NodoMasALaIzquierda = recorrerIzquierda(nodo.getDerecha());
        if(NodoMasALaIzquierda != null){
            nodo.setValue(NodoMasALaIzquierda.getValue());
            removeNodo(NodoMasALaIzquierda);
            return true;
        }
        return false;
    }
    public Nodo recorrerIzquierda(Nodo nodo){
        if(nodo.getIzquierda()!=null){
            return recorrerIzquierda(nodo.getIzquierda());
        }
        return nodo;
    }
    
    public void Preorden (Nodo data){
        if(data == null)
            return;
        System.out.println(""+data.getValue());
        Preorden(data.getDerecha());
        Preorden(data.getIzquierda());
    }
    
    public void PrintPreorden(){
        Preorden(raiz);
    }
    
    public int Inorder(Nodo data){
        if(data!=null){
            Inorder(data.getIzquierda());
            return data.getValue();
            //Inorder(data.getDerecha());            
           }
        return -1;
    }
    
    public void InordenMin(Nodo data){
        
        if(data!=null){
            InordenMin(data.getIzquierda());
            System.out.println(""+data.getValue());
            PilaMaxima.push(data.getValue());
            InordenMin(data.getDerecha());
        }
    }
    
    public void InordenMax(Nodo data){
        if(data!=null){
            InordenMax(data.getDerecha());
            System.out.println(""+data.getValue());
            PilaMinima.push(data.getValue());
            InordenMax(data.getIzquierda());
        }
    }
}