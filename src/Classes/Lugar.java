/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Windows.MainWindow;
import static Windows.MainWindow.ContadorNodos;
/**
 *
 * @author Memo
 */
public class Lugar {
    public String nombre;
    boolean visitado;
    public int ID;
    public LinkedList Adyacentes = new LinkedList();
    public LinkedList LugaresAdyacentes = new LinkedList();
    public LinkedList Coeficientes = new LinkedList();
    public LinkedList ListaAux = new LinkedList();
    
    
    
    public LinkedList getCoeficientes() {
        return Coeficientes;
    }

    public void setCoeficientes(LinkedList Coeficientes) {
        this.Coeficientes = Coeficientes;
    }
    
    

    public LinkedList getLugaresAdyacentes() {
        return LugaresAdyacentes;
    }

    public void setLugaresAdyacentes(LinkedList LugaresAdyacentes) {
        this.LugaresAdyacentes = LugaresAdyacentes;
    }
    
    

    public LinkedList getAdyacentes() {
        return Adyacentes;
    }

    public void setAdyacentes(LinkedList Adyacentes) {
        this.Adyacentes = Adyacentes;
    }

    
    
    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
        ContadorNodos++;
    }
    
    public boolean isVisitado() {
        return visitado;
    }

    public void setVisitado(boolean visitado) {
        this.visitado = visitado;
    }
    public Lugar() {
    }

    public Lugar(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
