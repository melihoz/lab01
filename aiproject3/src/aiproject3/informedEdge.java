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
class informedEdge{
        //public final double cost;
   
        public final informednode target;
        public double cost;
        
       public informedEdge(informednode targetNode,double costVal){
                target=targetNode;
                  cost = costVal;
            }
            }
