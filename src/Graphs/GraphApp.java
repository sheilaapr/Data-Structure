/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Graphs;

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
        
        theGraph.addEdge(0, 1); //AB
        theGraph.addEdge(1, 2); //BC
        theGraph.addEdge(0, 3); //AD
        theGraph.addEdge(3, 4); //DE
        theGraph.display();
        
        theGraph.dfs();
        theGraph.bfs();
        theGraph.mst();
    }
}
