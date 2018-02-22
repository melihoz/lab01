/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cse102lab02;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
/**
 *
 * @author Melih Öz
 */
public class CSE102LAB02 {

    /**
     * @param args the command line arguments
     */





  public static Queue Queuebuilder(int k){
       Queue<String> que = new LinkedList<>();
        Scanner s= new Scanner(System.in);
           for (int i=0; i<k;i++)
        {   System.out.print("enter word "+(i+1)+" ");
            String ss=s.next();
            que.add(ss);
        }
           return que;
      }
   public static Stack Reverse(Queue q)
   {  Stack stack1= new Stack();
      Stack stack2= new Stack();
      System.out.print("words in order ");
     
            while(!q.isEmpty())
{   System.out.print(q.peek()+" ");
    stack1.push(q.remove());
              
}           System.out.println(); 
            System.out.print("words in reverse order ");
            while(!stack1.isEmpty()){
             System.out.print(stack1.peek()+" ");
             stack2.push(stack1.pop());
            }
   System.out.println();
   return stack2; }
   
   public static Stack Remove(Stack stack)
   {
        Stack stack2= new Stack();
      
     while(!stack.isEmpty())
     {
 
         if(stack2.isEmpty())
         {
             stack2.push(stack.pop());
             
         }
        else if(stack2.peek().equals(stack.peek()))
         {
             stack2.pop();
             stack.pop();
         }
       else  if(!(stack2.peek().equals(stack.peek())))
         {
              stack2.push(stack.pop());
              
         }
      
         
    }
     
    System.out.print("words after removing ");
  while(!stack2.isEmpty())
      {
             System.out.print(stack2.pop()+" ");
     }

   
   
        
   return stack2; }
   
   

   public static void main(String[] args) {
    
      System.out.print("Enter the number of words ");  
      Scanner s= new Scanner(System.in);
      int count=s.nextInt();
      
      Queue que= Queuebuilder(count);
      Stack stackreverse=Reverse(que);
      Remove(stackreverse);
    
   } } 