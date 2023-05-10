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
        return this.first.getMovie();
    }
    
    public String last(){
        return this.last.getMovie();
    }
    
    public String actual(){
        return this.actual.getMovie();
    }
    
    public String search(int i){
        String msg;
        if(i <= this.size()){
            actual = first;
            for(int z = 0; z < i; z++){
                actual = actual.getSiguiente();
            }
            msg = actual.getMovie();
        }else{
            msg = "La posicion solicitada no existe";
        }
        
        return msg;
    }
    
    public void add(String movie){
        Nodo toAdd = new Nodo();
        toAdd.setMovie(movie);
        this.actual = toAdd;
        
        if (this.size == 0){
            this.first = toAdd;
            this.last = toAdd;
            toAdd.setAnterior(null);
            toAdd.setSiguiente(null);
        }else{
            toAdd.setAnterior(last);
            last.setSiguiente(toAdd);
            toAdd.setSiguiente(null);
            last = toAdd;
        }
    }
    
    public void move(ListaPeliculas listaA, ListaPeliculas listaB){
        listaB.add(listaA.actual());
        listaA.actual.getAnterior().setSiguiente(listaA.actual.getSiguiente());
        listaA.actual.getSiguiente().setAnterior(listaA.actual.getAnterior());
    }
}
