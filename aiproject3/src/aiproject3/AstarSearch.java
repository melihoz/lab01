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
     public class AstarSearch {
       public static void AstarSearch(informednode source, informednode goal){

         //       Set<informednode> explored = new HashSet<informednode>();
                ArrayList<informednode> explored = new ArrayList<informednode>();


                PriorityQueue<informednode> queue = new PriorityQueue<informednode>(20, 
                        new Comparator<informednode>(){
                                 //override compare method
                 public int compare(informednode i, informednode j){
                    if(i.f_scores > j.f_scores){
                        return 1;
                    }

                    else if (i.f_scores < j.f_scores){
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
                             System.out.println();
                             System.out.println();
                           
                       List<informednode> path = printPath(goal);
                       System.out.println("Astar Path: " + path);
                       found = true;
                        }

                        //check every child of current node
                        for(informedEdge e : current.adjacencies){
                                informednode child = e.target;
                                double cost = e.cost;
                                double temp_g_scores = current.g_scores + cost;
                                double temp_f_scores = temp_g_scores + child.h_scores;


                                /*if child node has been evaluated and 
                                the newer f_score is higher, skip*/
                                
                                if((explored.contains(child)) && 
                                        (temp_f_scores >= child.f_scores)){
                                        continue;
                                }
                                

                                /*else if child node is not in queue or 
                                newer f_score is lower*/
                                
                                else if((!queue.contains(child)) || 
                                        (temp_f_scores < child.f_scores)){

                                        child.parent = current;
                                        child.g_scores = temp_g_scores;
                                        child.f_scores = temp_f_scores;

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
