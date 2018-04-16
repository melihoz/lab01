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
import java.util.Stack;

/**
 * depth first search implementation using a stack structure instead of a queue
 * structure as exhibited in the breadth first search algorithm
 */
public class DepthFirstSearch extends AbstractSearch{

   

    public DepthFirstSearch(Node start, Node goalNode){
        super(start, goalNode);
        this.startNode = start;
        this.goalNode = goalNode;
    }

    public boolean compute(){
        if(this.startNode.equals(goalNode)){
            System.out.println("Goal Node Found at 0 depth");
            System.out.println(startNode);
        }
        Stack<Node> nodeStack = new Stack<Node>();
        ArrayList<Node> explored = new ArrayList<Node>();

         nodeStack.push(this.startNode);
        // explored.add(this.startNode);
        while(!nodeStack.isEmpty()){
            
            Node current = nodeStack.pop();
            explored.add(current);
            
            if(current.equals(goalNode)){
                System.out.print("DepthFirst Path: "+explored);
                System.out.println("Goal node found");
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
                                
                                else if((!nodeStack.contains(child)))
                                        child.parent = current;
                                        
                                        if(nodeStack.contains(child)){
                                                nodeStack.remove(child);
                                        }

                                        nodeStack.push(child);

                                }

                        }
    return false;
    }}
            /*
            else {
                explored.add(current);
                nodeStack.addAll(current.getChildren());
            }
        }
        return false;
    }

}*/