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
    private String movie;
    private Nodo anterior;
    private Nodo siguiente;
    
    public Nodo(){}
    
    public void setMovie(String movie){
        this.movie = movie;
    }
    
    public String getMovie(){
        return this.movie;
    }
    
    public void setAnterior(Nodo anterior){
        this.anterior = anterior;
    }
    
    public Nodo getAnterior(){
        return this.anterior;
    }
    
    public void setSiguiente(Nodo siguiente){
        this.siguiente = siguiente;
    }
    
    public Nodo getSiguiente(){
        return this.siguiente;
    }
}
