/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanUTS;

/**
 *
 * @author Sheila
 */
public class SortLinkedList {
    private Link first;
    private int iter;
    
    public SortLinkedList(){
        first = null;
        iter = 0;
    }
    
    public boolean isEmpty(){
        return(first == null);
    }
    
    public void insert (char kata){
        Link newLink = new Link(kata);
        newLink.next = first;
        first = newLink;
    }
    
    public void insertToList(char kata){
        Link newLink = null;
        if(iter == 0){
            newLink = new Link(kata);
            newLink.next = first;
        }else{
            newLink = new Link(kata);
            for(int i = 0; i < iter; i++){
                if(first.toString().compareTo(String.valueOf(kata)) < 0){
                    newLink.next = first;
                }
            }
        }
        first = newLink;
        iter++;
    }
    
    public Link remove(){
        Link temp = first;
        first = first.next;
        return temp;
    }
    
    public void displayList(){
        Link current = first;
        while(current != null){
            current.displayLink();
            current = current.next;
        }
        System.out.println("");
    }
}
