/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package edu.udls.arboles.modelo;

/**
 *
 * @author Ivan
 */
public class Arbol {
    Nodo raiz;
    int tamano;
    
    public Arbol(){}
    
    public int verTamano(){
        return this.tamano;
    }
    
    public void limpiar(){
        raiz = null;
        tamano = 0;
    }
    
    public void insertar(int valor){
        Nodo nuevoDato = new Nodo();
        nuevoDato.setValor(valor);
        if(this.raiz == null){
            this.raiz = nuevoDato;
        }
        else insertar(nuevoDato, this.raiz);
    }
    
    public void insertar(Nodo nuevoDato, Nodo padre){
        if(nuevoDato.getValor() < padre.getValor()){
            if(padre.getIzquierda() == null){
                padre.setIzquerda(nuevoDato);
            }else insertar(nuevoDato, padre.getIzquierda());
        }else{
            if(padre.getDerecha() == null){
                padre.setDerecha(nuevoDato);
            }else insertar(nuevoDato, padre.getDerecha());
        }
    }
    
    // R I D
    public String imprimirPre(Nodo n){
        if(n != null) return " " + n.getValor();
        imprimirPre(n.getIzquierda());
        imprimirPre(n.getDerecha());
        return "";
    }
    
    // I D R
    public String imprimirPost(Nodo n){
        imprimirPost(n.getIzquierda());
        imprimirPost(n.getDerecha());
        if(n != null) return " " + n.getValor();
        return "";
    }
    
    // I R D
    public String imprimirIn(Nodo n){
        imprimirIn(n.getIzquierda());
        if(n != null) return " " + n.getValor();
        imprimirIn(n.getDerecha());
    }
}
