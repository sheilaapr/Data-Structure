/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package latihanUTS;

/**
 *
 * @author Sheila
 */
public class Link {
    public char Data;
    public Link next;
    
    public Link(char Data){
        this.Data = Data;
    }
    
    public void displayLink(){
        System.out.print(Data + " ");
    }
}
