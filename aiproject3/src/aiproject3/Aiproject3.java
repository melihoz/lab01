package aiproject3;

import java.util.PriorityQueue;
import java.util.HashSet;
import java.util.Set;
import java.util.List;
import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

public class Aiproject3 {

    /**
     * @param args the command line arguments
     */
           public static void main(String[] args){

                //initialize the graph base on the Romania map
                Node nn1 = new Node("Arad");
                Node nn2 = new Node("Zerind");
                Node nn3 = new Node("Oradea");
                Node nn4 = new Node("Sibiu");
                Node nn5 = new Node("Fagaras");
                Node nn6 = new Node("Rimnicu Vilcea");
                Node nn7 = new Node("Pitesti");
                Node nn8 = new Node("Timisoara");
                Node nn9 = new Node("Lugoj");
                Node nn10 = new Node("Mehadia");
                Node nn11 = new Node("Drobeta");
                Node nn12 = new Node("Craiova");
                Node nn13 = new Node("Bucharest");
                Node nn14 = new Node("Giurgiu");
 
                //initialize the edges

                //Arad
                nn1.adjacencies = new Edge[]{
                        new Edge(nn2),
                        new Edge(nn4),
                        new Edge(nn8)
                };
                 
                 //Zerind
                nn2.adjacencies = new Edge[]{
                        new Edge(nn1),
                        new Edge(nn3)
                };
                 

                 //Oradea
                nn3.adjacencies = new Edge[]{
                        new Edge(nn2),
                        new Edge(nn4)
                };
                 
                 //Sibiu
                nn4.adjacencies = new Edge[]{
                        new Edge(nn1),
                        new Edge(nn5),
                        new Edge(nn3),
                        new Edge(nn6),
                };
                 

                 //Fagaras
                nn5.adjacencies = new Edge[]{
                        new Edge(nn4),

                        //178
                        new Edge(nn13)
                };
                 
                 //Rimnicu Vilcea
                nn6.adjacencies = new Edge[]{
                        new Edge(nn4),
                        new Edge(nn7),
                        new Edge(nn12)
                };
                 
                 //Pitesti
                nn7.adjacencies = new Edge[]{
                        new Edge(nn6),
                        new Edge(nn13),
                        new Edge(nn12)
                };
                 
                 //Timisoara
                nn8.adjacencies = new Edge[]{
                        new Edge(nn1),
                        new Edge(nn9)
                };
                 
                 //Lugoj
                nn9.adjacencies = new Edge[]{
                        new Edge(nn8),
                        new Edge(nn10)
                };

                 //Mehadia
                nn10.adjacencies = new Edge[]{
                        new Edge(nn9),
                        new Edge(nn11)
                };
                 
                 //Drobeta
                nn11.adjacencies = new Edge[]{
                        new Edge(nn10),
                        new Edge(nn12)
                };

                 //Craiova
                nn12.adjacencies = new Edge[]{
                        new Edge(nn11),
                        new Edge(nn6),
                        new Edge(nn7)
                };

                //Bucharest
                nn13.adjacencies = new Edge[]{
                        new Edge(nn7),
                        new Edge(nn14),
                        new Edge(nn5)
                };
                 
                 //Giurgiu
                nn14.adjacencies = new Edge[]{
                        new Edge(nn13)
                };
                 informednode n1 = new informednode("Arad",366);
                 informednode n2 = new informednode("Zerind",374);
                 informednode n3 = new  informednode("Oradea",380);
                 informednode n4 = new  informednode("Sibiu",253);
                 informednode n5 = new  informednode("Fagaras",178);
                 informednode n6 = new  informednode("Rimnicu Vilcea",193);
                 informednode n7 = new  informednode("Pitesti",98);
                 informednode n8 = new  informednode("Timisoara",329);
                 informednode n9 = new  informednode("Lugoj",244);
                 informednode n10 = new  informednode("Mehadia",241);
                 informednode n11 = new  informednode("Drobeta",242);
                 informednode n12 = new  informednode("Craiova",160);
                 informednode n13 = new  informednode("Bucharest",0);
                 informednode n14 = new  informednode("Giurgiu",77);
 
                //initialize the edges

                //Arad
                n1.adjacencies = new informedEdge[]{
                        new informedEdge(n2,75),
                        new informedEdge(n4,140),
                        new informedEdge(n8,118)
                };
                 
                 //Zerind
                n2.adjacencies = new informedEdge[]{
                        new informedEdge(n1,75),
                        new informedEdge(n3,71)
                };
                 

                 //Oradea
                n3.adjacencies = new informedEdge[]{
                        new informedEdge(n2,71),
                        new informedEdge(n4,151)
                };
                 
                 //Sibiu
                n4.adjacencies = new informedEdge[]{
                        new informedEdge(n1,140),
                        new informedEdge(n5,99),
                        new informedEdge(n3,151),
                        new informedEdge(n6,80),
                };
                 

                 //Fagaras
                n5.adjacencies = new informedEdge[]{
                        new informedEdge(n4,99),

                        //178
                        new informedEdge(n13,211)
                };
                 
                 //Rimnicu Vilcea
                n6.adjacencies = new informedEdge[]{
                        new informedEdge(n4,80),
                        new informedEdge(n7,97),
                        new informedEdge(n12,146)
                };
                 
                 //Pitesti
                n7.adjacencies = new informedEdge[]{
                        new informedEdge(n6,97),
                        new informedEdge(n13,101),
                        new informedEdge(n12,138)
                };
                 
                 //Timisoara
                n8.adjacencies = new informedEdge[]{
                        new informedEdge(n1,118),
                        new informedEdge(n9,111)
                };
                 
                 //Lugoj
                n9.adjacencies = new informedEdge[]{
                        new informedEdge(n8,111),
                        new informedEdge(n10,70)
                };

                 //Mehadia
                n10.adjacencies = new informedEdge[]{
                        new informedEdge(n9,70),
                        new informedEdge(n11,75)
                };
                 
                 //Drobeta
                n11.adjacencies = new informedEdge[]{
                        new informedEdge(n10,75),
                        new informedEdge(n12,120)
                };

                 //Craiova
                n12.adjacencies = new informedEdge[]{
                        new informedEdge(n11,120),
                        new informedEdge(n6,146),
                        new informedEdge(n7,138)
                };

                //Bucharest
                n13.adjacencies = new informedEdge[]{
                        new informedEdge(n7,101),
                        new informedEdge(n14,90),
                        new informedEdge(n5,211)
                };
                 
                 //Giurgiu
                n14.adjacencies = new informedEdge[]{
                        new informedEdge(n13,90)
                };

                AstarSearch.AstarSearch(n1,n13);
                Greedysearch.Greedysearch(n1,n13);
                BreadthFirstSearch bfs = new BreadthFirstSearch(nn1,nn13);
                DepthFirstSearch dfs = new DepthFirstSearch(nn1,nn13);
                DepthLimitedSearch dfs1 = new DepthLimitedSearch(nn1,nn13);
                if(dfs1.compute());
                if(bfs.compute());
                 if(dfs.compute());
           

                


        }

       

     
        
}



