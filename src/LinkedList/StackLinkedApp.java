/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author Sheila
 */
public class StackLinkedApp {

    public static void main(String[] args) {
        stacklinkedlist stack = new stacklinkedlist();
        stack.push(1, "VCD");
        stack.push(2, "TV");
        stack.display();
        stack.push(3, "kulkas");
        stack.push(4, "PC");
        stack.push(5, "rice cooker");
        stack.push(6, "dispenser");
        stack.display();
        stack.pop();
        stack.pop();
        stack.display();
    }
    
}
