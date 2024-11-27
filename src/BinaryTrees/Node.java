/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BinaryTrees;

/**
 *
 * @author Sheila
 */

public class Node {
   public  int id;
   public String data;
   public Node leftChild;
   public Node rightChild;
   
    public void displayNode(){
        System.out.print("{" + id +", "+ data+"}");
    }
}

class Stack {
    private java.util.Stack<Node> stack;

    public Stack() {
        stack = new java.util.Stack<>();
    }

    public void push(Node node) {
        stack.push(node);
    }

    public Node pop() {
        return stack.pop();
    }

    public boolean isEmpty() {
        return stack.isEmpty();
    }
}


