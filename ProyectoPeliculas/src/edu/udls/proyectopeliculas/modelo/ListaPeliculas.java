package edu.udls.proyectopeliculas.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author Ivan
 */
public class ListaPeliculas {
    public Nodo first;
    public Nodo actual;
    public Nodo last;
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
            size++;
        }else{
            toAdd.setSiguiente(null);
            toAdd.setAnterior(last);
            last.setSiguiente(toAdd);
            last = toAdd;
            size++;
        }
    }
    
    public static void move(ListaPeliculas removeFromList, ListaPeliculas addToList){
        addToList.add(removeFromList.actual.getMovie());
        removeFromList.actual = removeFromList.actual.getAnterior();
        removeFromList.actual.setSiguiente(removeFromList.actual.getSiguiente().getSiguiente());
        removeFromList.actual.getSiguiente().getSiguiente().setAnterior(removeFromList.actual);
        removeFromList.size--;
        addToList.size++;
        JOptionPane.showMessageDialog(null, "Pelicula agregada con exito");
    }
    
    public static void moveAll(ListaPeliculas removeFromList, ListaPeliculas addToList){
        removeFromList.actual = removeFromList.first;
        for(int i = 0; i <= removeFromList.size(); i++){
            addToList.add(removeFromList.actual());
            removeFromList.actual.getAnterior().setSiguiente(removeFromList.actual.getSiguiente());
            removeFromList.actual.getSiguiente().setAnterior(removeFromList.actual.getAnterior());
            removeFromList.size--;
            addToList.size++;
            removeFromList.actual = removeFromList.actual.getSiguiente();
        }
    }
    
    public String enlist(ListaPeliculas list){
        String relist = "";
        
        list.actual = list.first;
        JOptionPane.showMessageDialog(null, "Todo bien hasta ahora");
        for(int i = 0; i <= list.size; i++){
            relist += (i+1) + ". " + list.actual.getMovie() + "\n";
            list.actual = list.actual.getSiguiente();
        }
        return relist;
    }
}
