/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aiproject3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

/**
 *
 * @author Melih
 */
public class Greedysearch {
     public static void Greedysearch(informednode source, informednode goal){

                ArrayList<informednode> explored = new ArrayList<>();

                PriorityQueue<informednode> queue = new PriorityQueue<informednode>(20, 
                        new Comparator<informednode>(){
                                 //override compare method
                 public int compare(informednode i, informednode j){
                    if(i.h_scores > j.h_scores){
                        return 1;
                    }

                    else if (i.h_scores < j.h_scores){
                        return -1;
                    }

                    else{
                        return 0;
                    }
                 }

                        }
                        );

                //cost from start
                source.g_scores = 0;

                queue.add(source);

                boolean found = false;

                while((!queue.isEmpty())&&(!found)){

                        //the node in having the lowest f_score value
                        informednode current = queue.poll();

                        explored.add(current);

                        //goal found
                        if(current.value.equals(goal.value)){
                          
                       List<informednode> path = printPath(goal);
                       System.out.println("Greedy Path: " + path);
                       found = true;
                        }

                        //check every child of current node
                        for(informedEdge e : current.adjacencies){
                                informednode child = e.target;
                                double cost = e.cost;
                                double temp_h_scores = current.h_scores + cost;
                               


                                /*if child node has been evaluated and 
                                the newer f_score is higher, skip*/
                                
                                if((explored.contains(child)) && 
                                        (temp_h_scores >= child.h_scores)){
                                        continue;
                                }
                                

                                /*else if child node is not in queue or 
                                newer f_score is lower*/
                                
                                else if((!queue.contains(child)) || 
                                        (temp_h_scores < child.h_scores)){

                                        child.parent = current;
                                 
                                        

                                        if(queue.contains(child)){
                                                queue.remove(child);
                                        }

                                        queue.add(child);

                                }

                        }

                }

        }
        public static List<informednode> printPath(informednode target){
                List<informednode> path = new ArrayList<informednode>();
        
        for(informednode node = target; node!=null; node = node.parent){
            path.add(node);
        }

        Collections.reverse(path);

        return path;
        }
    
}

    

