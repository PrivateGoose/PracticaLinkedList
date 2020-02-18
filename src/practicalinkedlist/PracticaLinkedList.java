/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicalinkedlist;

import java.util.*;

public class PracticaLinkedList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Primer ejemplo usando la primera clase
        LinkedList<Empleado> personas=new LinkedList<>();
        
        personas.add(new Empleado("Aleksandr",1200000));
        personas.add(new Empleado("Anton",700000));
        personas.add(new Empleado("Gyorgy",3000000));
        personas.add(new Empleado("Masha",5000000));
        personas.add(new Empleado("Pavla",2500000));
        
        for(Empleado e: personas){
            
            System.out.println(e);
            
        }
        
        System.out.println();
        
        //Segundo ejemplo usando la segunda clase
        
        LinkedList<Maquinaria> maquinas=new LinkedList<>();
        
        maquinas.add(new Maquinaria("prensa de laton", 1200));
        maquinas.add(new Maquinaria("Torno para moldear barro", 350));
        maquinas.add(new Maquinaria("Congelador para Helados", 335));
        maquinas.add(new Maquinaria("Granizador", 300));
        
         for(Maquinaria m: maquinas){
            
            System.out.println(m);
            
        }
        
         System.out.println();
        
        ListIterator<Maquinaria> iteradorM=maquinas.listIterator();
        
        iteradorM.next();
        
        iteradorM.add(new Maquinaria("Sierra de mesa",2100));
        
        maquinas.remove();
        
        
         for(Maquinaria m: maquinas){
            
            System.out.println(m);
            
        }
        
        
        System.out.println("La cantidad de elementos es de: "+maquinas.size());
        
        
    }
    
}
