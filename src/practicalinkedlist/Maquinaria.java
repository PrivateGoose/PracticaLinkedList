/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicalinkedlist;

/**
 *
 * @author compumax
 */
public class Maquinaria {
    
    String nombre;
    int consumoEnergia;

    public Maquinaria(String nombre, int consumoEnergia) {
        this.nombre = nombre;
        this.consumoEnergia = consumoEnergia;
    }
    
    @Override
     public String toString(){
         return "Nombre: "+getNombre()+" Consumo de energía: "+getConsumoEnergia();
     }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(int consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }
     
     
    
    
}
