/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author Sheila
 */
class Stack2 {
    
    public int id;
    public String nama;
    public Stack2 link;
}

class stacklinkedlist{
    Stack2 top;
    
    public stacklinkedlist(){
        top=null;
    }
    
    public void push(int id, String nama){
        Stack2 st = new Stack2();
        if(st == null){
            return;
        }
        st.id = id;
        st.nama = nama;
        st.link = top;
        top = st;
    }
    
    public boolean isEmpty(){
        return top == null;
    }
    
    public void pop(){
        top = top.link;
    }
    
    public void display(){
        Stack2 st = top;
        System.out.println("Stack(top --> bottom) :");
        while (st != null){
            System.out.print("{"+st.id+", "+st.nama+"}");
            System.out.println();
            st = st.link;
        }
        System.out.println();
    }
}
