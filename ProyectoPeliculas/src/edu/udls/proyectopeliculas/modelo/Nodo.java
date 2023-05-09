/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.udls.proyectopeliculas.modelo;

/**
 *
 * @author Ivan
 */
public class Nodo {
    private String pelicula;
    private Nodo anterior;
    private Nodo siguiente;
    
    public Nodo(){}
    
    public void setPelicula(String pelicula){
        this.pelicula = pelicula;
    }
    
    public String getPelicula(){
        return this.pelicula;
    }
    
    public void setAnterior(Nodo anterior){
        this.anterior = anterior;
    }
    
    public Nodo getAnterior(){
        return this.anterior;
    }
    
    public void setSiguiente(Nodo Siguiente){
        this.siguiente = siguiente;
    }
    
    public Nodo getSiguiente(){
        return this.siguiente;
    }
}
