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
    
    public void clean(){
        this.first = null;
        this.actual = null;
        this.last = null;
        size = 0;
    }
    
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
        }else {
            toAdd.setSiguiente(null);
            toAdd.setAnterior(last);
            last.setSiguiente(toAdd);
            last = toAdd;
        }
        size++;
    }
    
    public static void move(ListaPeliculas removeFromList, ListaPeliculas addToList){
        addToList.add(removeFromList.actual.getMovie());
        if(removeFromList.actual == removeFromList.first){
            removeFromList.first = removeFromList.first.getSiguiente();
            removeFromList.first.getAnterior().setSiguiente(null);
            removeFromList.first.setAnterior(null);
            removeFromList.actual = removeFromList.actual;
        }else if(removeFromList.actual == removeFromList.last){
            removeFromList.last = removeFromList.last.getAnterior();
            removeFromList.last.getSiguiente().setAnterior(null);
            removeFromList.last.setSiguiente(null);
            removeFromList.actual = removeFromList.last;
        }else{
            removeFromList.actual = removeFromList.actual.getAnterior();
            removeFromList.actual.setSiguiente(removeFromList.actual.getSiguiente().getSiguiente());
            removeFromList.actual.getSiguiente().getSiguiente().setAnterior(removeFromList.actual);
        }
        removeFromList.size--;
    }
    
    public static void moveAll(ListaPeliculas removeFromList, ListaPeliculas addToList){
        removeFromList.actual = removeFromList.first;
        do{
            addToList.add(removeFromList.actual());
            removeFromList.actual = removeFromList.actual.getSiguiente();
        }while(removeFromList.actual != null);
        removeFromList.clean();
    }
    
    public String enlist(ListaPeliculas list){
        int i = 1;
        String relist = "";
        
        list.actual = list.first;
        do{
            relist += (i) + ". " + list.actual.getMovie() + "\n";
            i++;
            list.actual = list.actual.getSiguiente();
        }while(list.actual != null);
        return relist;
    }
}
