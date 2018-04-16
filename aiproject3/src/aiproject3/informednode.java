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
class informednode{

        public final String value;
        public double g_scores;
        public final double h_scores;
        public double f_scores = 0;
        public informedEdge[] adjacencies;
        public informednode parent;

        public informednode(String val, double hVal){
                value = val;
                h_scores = hVal;
        }
       

        public String toString(){
                return value;
        }
        /*
          public ArrayList<informednode> getChildren(){
        ArrayList<informednode> childNodes = new ArrayList<>();
        for(Edge e :this.adjacencies){
            childNodes.add( e.target);
        }
        return childNodes;
    }
*/
}
