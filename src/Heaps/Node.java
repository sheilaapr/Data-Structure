/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heaps;

/**
 *
 * @author Sheila
 */
public class Node {
    private int data;
    
    public Node(int key){
        this.data = key;
    }
    
    public int getKey(){
        return data;
    }
    
    public void setKey(int newVal){
        this.data = newVal;
        }
}