/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab07;

import java.util.Scanner;

/**
 *
 * @author Melih ÖZ
 */
public class Lab07 {

  
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
         System.out.println("please enter student count");
        int count =s.nextInt();
        csestudent[] studentArray = new csestudent[count];

        int length = studentArray.length;
       
        for (int i = 0; i < length; i++) {
            studentArray[i] = new csestudent();
            
            System.out.println("please enter student nameeeeeee");
            studentArray[i].name = s.next();

            System.out.println("please enter student mark");
            studentArray[i].mark = s.nextInt();

        }

        for (int i = 0; i < length; i++) {
            for (int k = 0; k < length - 1; k++) {
                if (studentArray[k].mark > studentArray[k + 1].mark) {   //comparing array values

                    int temp = 0;
                    String tempname = "";
                    temp = studentArray[k].mark;     //storing value of array in temp variable 
                    tempname = studentArray[k].name;
                    studentArray[k].name = studentArray[k + 1].name;
                    studentArray[k].mark = studentArray[k + 1].mark;    //swaping values
                    studentArray[k + 1].mark = temp;    //now storing temp value in array
                    studentArray[k + 1].name = tempname;

                }
            }
        }
        for (int i = 0; i < length; i++) {

            System.out.println(studentArray[i].name);

            System.out.println(studentArray[i].mark);

        }
    }

}

