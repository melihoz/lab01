/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aiproject3;

/**
 *
 * @author Melih
 */
public abstract class AbstractSearch {

    Node startNode;
    Node goalNode;

    public AbstractSearch(Node startNode, Node goalNode){
        this.startNode = startNode;
        this.goalNode = goalNode;
    }

    public abstract boolean compute();

}