/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aiproject3;

import java.util.ArrayList;

/**
 *
 * @author Melih
 */
class Node{

        public final String value;
      
        public Edge[] adjacencies;
        public Node parent;
/*
        public Node(String val, double hVal){
                value = val;
                h_scores = hVal;
        }*/
        public Node(String val){
                value = val;
               
        }

        public String toString(){
                return value;
        }
        
          public ArrayList<Node> getChildren(){
        ArrayList<Node> childNodes = new ArrayList<>();
        for(Edge e :this.adjacencies){
            childNodes.add( e.target);
        }
        return childNodes;
    }

}
