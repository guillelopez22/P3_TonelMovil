/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;
import Classes.Lista_Relacion;
import static Windows.MainWindow.ContadorNodos;
import static Windows.MainWindow.lugares;
import static Windows.MainWindow.places;
import static Windows.MainWindow.relaciones;

/**
 *
 * @author isaac
 */
public class Dijkstra {
   //public lista_lugares Aux = new lista_lugares();
   //public AdvancedLinkedList acum = new AdvancedLinkedList();

    
    
    public Dijkstra() {
    }
    
    
    
  /* public AdvancedLinkedList Dijkstra(int origen, int fin){
        acum.insert(0, 0);
        for (int i = 1; i < ContadorNodos; i++) {
            acum.insert(99999999);
        }
        for (int i = 1; i < ContadorNodos; i++) {
            //System.out.println(places.getLugar(i).getID());
            if(lugares.get(i).getID()==origen){
                //System.out.println(places.getLugar(i).getID());
                //Aux = (AdvancedLinkedList) places.getLugar(i).getCoeficientes();
                Aux.insert(lugares.get(i));
                if((Integer)Aux.get(i).getCoeficientes().get()!=0){
                    acum.extract(i);
                    acum.insert(Aux.get(i).getCoeficientes().get(), i);
                }
            }
        }
        acum.print();
        return acum;
    }
    */
    
    
    
    
}
