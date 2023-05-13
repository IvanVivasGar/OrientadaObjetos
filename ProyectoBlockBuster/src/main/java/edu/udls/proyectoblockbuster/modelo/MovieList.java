package edu.udls.proyectoblockbuster.modelo;
import javax.swing.JOptionPane;

/**
 *
 * @author Ivan
 */
public class MovieList {
    public Node first;
    public Node current;
    public Node last;
    int size;
    
    public MovieList(){}
    
    public int size(){
        return this.size;
    }
    
    public String first(){
        return this.first.getMovieId() + this.first.getMovieName() + this.first.getMovieGenre() + this.first.getMovieYear() + this.first.getMovieLength();
    }
    
    public String current(){
        return this.current.getMovieId() + this.current.getMovieName() + this.current.getMovieGenre() + this.current.getMovieYear() + this.current.getMovieLength();
    }
    
    public String last(){
        return this.last.getMovieId() + this.last.getMovieName() + this.last.getMovieGenre() + this.last.getMovieYear() + this.last.getMovieLength();
    }
    
    public void clean(){
        this.first = null;
        this.current = null;
        this.last = null;
        this.size = 0;
    }
    
    public void add(String movieId, String movieName, String movieGenre, String movieYear, String movieLength){
        Node toAdd = new Node();
        toAdd.setMovieId(movieId);
        toAdd.setMovieName(movieName);
        toAdd.setMovieGenre(movieGenre);
        toAdd.setMovieYear(movieYear);
        toAdd.setMovieLength(movieLength);
        this.current = toAdd;
        
        if (this.size == 0){
            this.first = toAdd;
            this.last = toAdd;
            toAdd.setPrevious(null);
            toAdd.setNext(null);
            this.current = this.first;
        }else {
            toAdd.setNext(null);
            toAdd.setPrevious(last);
            last.setNext(toAdd);
            last = toAdd;
            this.current = this.last;
        }
        size++;
    }
    
    public void move(MovieList destinationList){
        if(this.size == 0){
            JOptionPane.showMessageDialog(null, "No hay peliculas para mover");
        }
        else if(this.size == 1){
            destinationList.add(this.current.getMovieId(), this.current.getMovieName(), this.current.getMovieGenre(), this.current.getMovieYear(), this.current.getMovieLength());
            this.clean();
        }else if(this.current == this.first){
            destinationList.add(this.current.getMovieId(), this.current.getMovieName(), this.current.getMovieGenre(), this.current.getMovieYear(), this.current.getMovieLength());
            this.first = this.first.getNext();
            this.first.getPrevious().setNext(null);
            this.first.setPrevious(null);
            this.current = this.first;
            this.size--;
        }else if(this.current == this.last){
            destinationList.add(this.current.getMovieId(), this.current.getMovieName(), this.current.getMovieGenre(), this.current.getMovieYear(), this.current.getMovieLength());
            this.last = this.last.getPrevious();
            this.last.getNext().setPrevious(null);
            this.last.setNext(null);
            this.current = this.last;
            this.size--;
        }else{
            destinationList.add(this.current.getMovieId(), this.current.getMovieName(), this.current.getMovieGenre(), this.current.getMovieYear(), this.current.getMovieLength());
            this.current = this.current.getPrevious();
            this.current.setNext(this.current.getNext().getNext());
            this.current.getNext().getNext().setPrevious(this.current);
            this.size--;
        }
    }
    
    public void moveAll(MovieList destinationList){
        this.current = this.first;
        do{
            destinationList.add(this.current.getMovieId(), this.current.getMovieName(), this.current.getMovieGenre(), this.current.getMovieYear(), this.current.getMovieLength());
            this.current = this.current.getNext();
        }while(this.current != null);
        this.clean();
    }
    
    public void search(String value){
        boolean found = false;
        int i = 0;
        value = value.replaceAll(" ", "").toLowerCase();
        
        //DECLARAMOS EL PRIMER NODO COMO EL ACTUAL PARA BUSCAR EN TODA LA LISTA
        this.current = this.first;
        do{
            String temporalMovieName = this.current.getMovieName().toLowerCase().replaceAll(",", "").replaceAll(" ", "");
            String temporalMovieId = this.current.getMovieId().toLowerCase().replaceAll(",", "").replaceAll(" ", "");
            if(temporalMovieName.equals(value) || temporalMovieId.equals(value)){
                found = true;
                JOptionPane.showMessageDialog(null, "Pelicula encontrada " + this.current.getMovieName());
            }else if(this.current.getNext() != null && found != true){
                this.current = this.current.getNext();
            }
            i++;
        }while(found == false && i < this.size());
    }
    
    public String enlist(MovieList list){
        String relist = "";
        
        //CONDICION QUE DETERMINA SI EN REALIDAD HAY ALGO EN LA LISTA
        if(list.current != null){
            int i = 1;
            //UN STRING QUE GUARDA EL VALOR DE LA PELICULA ACTUAL PARA QUE AL PASAR DE PELICULA A PELICULA, AL FINAL LA PELICULA SIGA SIENDO LA ACTUAL EN LA QUE EL USUARIO SE QUEDO
            Node temporalValue = list.current;
            boolean reunitedValues = false;

            //CICLO QUE RECORRERA DE PELICULA EN PELICULA Y LA AGREGARA AL STRING PARA MOSTRARLO EN PANTALLA
            list.current = list.first;
            do{
                relist += list.current.getMovieId() + list.current.getMovieName() + list.current.getMovieGenre() + list.current.getMovieYear() + list.current.getMovieLength() + "\n";
                i++;
                list.current = list.current.getNext();
            }while(list.current != null);
        
            //CICLO QUE ESTABLECERA EL ACTUAL COMO EL ACTUAL CON EL QUE ENTRO AL METODO, BUSCANDO UNA IGUALDAD ENTRE EL TEMPORALVALUE Y EL GETMOVIE() DEL NODO ACTUAL
            list.current = list.first;
            do{
                if(list.current == temporalValue){
                    reunitedValues = true;
                }else{
                    list.current = list.current.getNext();
                }
            }while(reunitedValues == false);
        }else{
            relist = "";
        }
        return relist;
    }
}
