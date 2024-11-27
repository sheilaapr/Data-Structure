/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author Sheila
 */
class Queue{
    private queuelinked front;
    private queuelinked rear;
    
    public Queue(){
        queuelinked q = null;
        rear = q;
        front = q;
    }
    
    public void insert(int nim, String nama){
        queuelinked temp = new queuelinked(nim, nama);
        if(rear == null){
            queuelinked q = temp;
            rear = q;
            front = q;
            return;
        }
        rear.next = temp;
        rear = temp;
    }
    
    public queuelinked remove(){
        if(front == null){
            return null;
        }
        queuelinked temp = front;
        front = front.next;
        if(front == null){
            rear = null;
        }
        return temp;
    }
    
    public void displayqueue(){
        System.out.println("Queue (front --> rear) :");
        for(queuelinked current = front; current != null; current = current.next){
            System.out.println(current.nim+" "+current.nama);
        }
        System.out.println("");
    }
}

class queuelinked{
    public int nim;
    public String nama;
    public queuelinked next;
    
    public queuelinked(int nim, String nama){
        this.nim = nim;
        this.nama = nama;
        this.next = null;
    }
}