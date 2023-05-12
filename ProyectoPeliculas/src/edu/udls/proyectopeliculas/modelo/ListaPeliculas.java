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
    
    public Nodo search(String value){
        boolean found = false;
        int i = 0;
        value = value.replaceAll("\\s", "").toLowerCase();
        JOptionPane.showMessageDialog(null, value);
        
        this.actual = this.first;
        do{
            int positionComaId = this.actual().replaceAll("\\s", "").indexOf(",");
            int positionComaName = this.actual().replaceAll("\\s", "").indexOf(",", positionComaId + 1);
            if(this.actual().replaceAll("\\s", "").toLowerCase().substring(0, positionComaId) == value || this.actual().replaceAll("\\s", "").toLowerCase().substring(positionComaId + 1, positionComaName) == value){
                found = true;
                JOptionPane.showMessageDialog(null, "Pelicula encontrada " + this.actual.getMovie());
            }else if(this.actual.getSiguiente() != null){
                this.actual = this.actual.getSiguiente();
            }
        }while(found == false || i < this.size);
        return this.actual;
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
        
        if(removeFromList.size == 0){
            JOptionPane.showMessageDialog(null, "No hay peliculas para mover");
        }
        else if(removeFromList.size == 1){
            addToList.add(removeFromList.actual.getMovie());
            removeFromList.clean();
        }else if(removeFromList.actual == removeFromList.first){
            addToList.add(removeFromList.actual.getMovie());
            removeFromList.first = removeFromList.first.getSiguiente();
            removeFromList.first.getAnterior().setSiguiente(null);
            removeFromList.first.setAnterior(null);
            removeFromList.actual = removeFromList.first;
        }else if(removeFromList.actual == removeFromList.last){
            addToList.add(removeFromList.actual.getMovie());
            removeFromList.last = removeFromList.last.getAnterior();
            removeFromList.last.getSiguiente().setAnterior(null);
            removeFromList.last.setSiguiente(null);
            removeFromList.actual = removeFromList.last;
        }else{
            addToList.add(removeFromList.actual.getMovie());
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
        String relist = "";
        
        if(list.actual != null){
            int i = 1;
            String temporalValue = list.actual.getMovie();
            boolean reunitedValues = false;

            if(list.size >= 1){
                list.actual = list.first;
                do{
                    relist += (i) + ". " + list.actual.getMovie() + "\n";
                    i++;
                    list.actual = list.actual.getSiguiente();
                }while(list.actual != null);
            }else{
                relist = " ";
            }
        
            list.actual = list.first;
            do{
                if(list.actual() == temporalValue){
                    reunitedValues = true;
                }else{
                    list.actual = list.actual.getSiguiente();
                }
            }while(reunitedValues == false);
        }else{
            relist = "";
        }
        return relist;
    }
}
