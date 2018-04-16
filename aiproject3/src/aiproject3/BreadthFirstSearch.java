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
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

/**
 * basic breadth first search in java
 */
public class BreadthFirstSearch extends AbstractSearch {

   
    public BreadthFirstSearch(Node start, Node goalNode){
        super(start, goalNode);
        this.startNode = start;
        this.goalNode = goalNode;
    }

    public boolean compute(){

        if(this.startNode.equals(goalNode)){
            System.out.println("Goal Node Found!");
            System.out.println(startNode);
        }

        Queue<Node> queue = new LinkedList<Node>();
        ArrayList<Node> explored = new ArrayList<Node>();
        queue.add(this.startNode);
       // explored.add(startNode);

        while(!queue.isEmpty()){
            Node current = queue.remove();
            explored.add(current);
            if(current.equals(this.goalNode)) {
                System.out.println(explored);
                return true;
            }            
       for(Edge e : current.adjacencies){
                                Node child = e.target;
                                

                                /*if child node has been evaluated and 
                                the newer f_score is higher, skip*/
                                
                                if(explored.contains(child)) {
                                        continue;
                                }
                                

                                /*else if child node is not in queue or 
                                newer f_score is lower*/
                                
                                else if((!queue.contains(child)))
                                        child.parent = current;
                                        
                                        if(queue.contains(child)){
                                                queue.remove(child);
                                        }

                                        queue.add(child);

                                }

                        }
    return false;}}
            /*
            
            
            else{
                if(current.getChildren().isEmpty())
                    return false;
                else
                    queue.addAll(current.getChildren());
                
            }
            explored.add(current);
        }

        return false;

    }

}
*/