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
* Depth Limited Search Class
*/
public class DepthLimitedSearch extends AbstractSearch {

   Node startNode;
   Node goalNode;
   int depth = 0;
   int limit = 7
           ;

   public DepthLimitedSearch(Node start, Node goalNode){
       super(start, goalNode);
       this.startNode = start;
       this.goalNode = goalNode;
   }

   public boolean compute(){
       Stack<Node> nodeStack = new Stack<>();
       ArrayList<Node> explored = new ArrayList<>();
       nodeStack.add(startNode);

       depth = 0;

       while(!nodeStack.isEmpty()){
           if(depth <= limit) {
               depth++;
               Node current = nodeStack.pop();
               explored.add(current);
               
               if (current.equals(goalNode)) {
                   System.out.print(explored);
                   System.out.println("Goal node found");
                   return true;}
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
           else
           {
               System.out.println("Path not found");
              return false;
           }
  
       }
   return false; } 
       
   }