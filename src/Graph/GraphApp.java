/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graph;

/**
 *
 * @author Sheila
 */
public class GraphApp {

    public static void main(String[] args) {
        Graph theGraph = new Graph();
        theGraph.addVertex('A'); //0
        theGraph.addVertex('B'); //1
        theGraph.addVertex('C'); //2
        theGraph.addVertex('D'); //3
        theGraph.addVertex('E'); //4

        theGraph.addEdge(0, 2); //AC
        theGraph.addEdge(1, 0); //BA
        theGraph.addEdge(1, 4); //BE
        theGraph.addEdge(4, 2); //EC
        theGraph.addEdge(3, 4); //DE

        theGraph.display();
        theGraph.connectivity();
    }
}
