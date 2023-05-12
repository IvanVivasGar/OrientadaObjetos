package edu.udls.proyectoblockbuster.modelo;

/**
 *
 * @author Ivan
 */

public class Node {
    private String movie;
    private Node previous;
    private Node next;
    
    public Node(){}
    
    public void setMovie(String movie){
        this.movie = movie;
    }
    
    public String getMovie(){
        return this.movie;
    }
    
    public void setPrevious(Node previous){
        this.previous = previous;
    }
    
    public Node getPrevious(){
        return this.previous;
    }
    
    public void setNext(Node next){
        this.next = next;
    }
    
    public Node getNext(){
        return this.next;
    }
}
