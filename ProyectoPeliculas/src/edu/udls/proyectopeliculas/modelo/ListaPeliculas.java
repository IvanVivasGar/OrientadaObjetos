/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.udls.proyectopeliculas.modelo;

/**
 *
 * @author Ivan
 */
public class ListaPeliculas {
    Nodo first;
    Nodo actual;
    Nodo last;
    int size;
    
    public ListaPeliculas(){}
    
    public int size(){
        return this.size;
    }
    
    public String first(){
        return this.first.getPelicula();
    }
    
    public String last(){
        return this.last.getPelicula();
    }
    
    public String actual(){
        return this.actual.getPelicula();
    }
    
    public String search(int i){
        String msg;
        if(i <= this.size()){
            actual = first;
            for(int z = 0; z < i; z++){
                actual = actual.getSiguiente();
            }
            msg = actual.getPelicula();
        }else{
            msg = "La posicion solicitada no existe";
        }
        
        return msg;
    }
    
    public 
}
