/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import static Windows.MainWindow.lugares;
import static Windows.MainWindow.relaciones;
import static Windows.MainWindow.size;
import static Windows.MainWindow.size2;

/**
 *
 * @author Memo
 */
public class Dijkstra {
    Lugar origin = new Lugar();
    public Dijkstra(Lugar origin){
        this.origin = origin;
    }
    public Lista_Relacion algorithm(){
        int tsize= 0;
        lista_lugares todos = lugares;
        for (int i = 0; i < size2; i++) {
            todos.insert(lugares.get(i), tsize);
            tsize++;
        }
        Lista_Relacion dij = new Lista_Relacion();
        int size_dij = 0;
        lista_lugares conjunto = new lista_lugares();
        int cont_conjunto = 0;
        conjunto.insert(origin, cont_conjunto);
        cont_conjunto++;
        Lista_Relacion rel = new Lista_Relacion();
        
        
        do{
        
        
        int cont_rel = 0;
        for (int i = 0; i < size; i++) {
            if (origin.getNombre().equals(relaciones.get(i).getPunto1().getNombre()) || origin.getNombre().equals(relaciones.get(i).getPunto2().getNombre())) {
                rel.insert(relaciones.get(i), cont_rel);
                cont_rel ++;
            }
        }
        int temp = 800000000;
        Relacion_Destinos a_ingresar = new Relacion_Destinos();
        for (int i = 0; i < cont_rel; i++) {
            if (temp > rel.get(i).getDistancia()) {
                temp = rel.get(i).getDistancia();
                a_ingresar = rel.get(i);
            }
        }
        dij.insert(a_ingresar, size_dij);
        size_dij++;
        Lugar a_conjunto = new Lugar();
        if (!conjunto.get(cont_conjunto - 1).getNombre().equals(a_ingresar.getPunto1().getNombre())) {
            a_conjunto.setNombre((a_ingresar.getPunto1().getNombre()));
        }else if(!conjunto.get(cont_conjunto - 1).getNombre().equals(a_ingresar.getPunto2().getNombre())){
            a_conjunto.setNombre(a_ingresar.getPunto1().getNombre());
        }
        conjunto.insert(a_conjunto, cont_conjunto);
        cont_conjunto++; 
        }while(cont_conjunto == tsize);
        
        return dij;
    }
}
