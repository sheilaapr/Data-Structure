/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LinkedList;

/**
 *
 * @author Sheila
 */
public class QueueLinkedApp {

    public static void main(String[] args) {
        Queue tq = new Queue();
        tq.insert(1665100, "Dee");
        tq.insert(1665200, "Deaja");
        tq.displayqueue();
        tq.insert(1665300, "Ami");
        tq.insert(1665400, "Haya");
        tq.insert(1665500, "Yati");
        tq.displayqueue();
        tq.remove();
        tq.remove();
        tq.displayqueue();
    }

}
