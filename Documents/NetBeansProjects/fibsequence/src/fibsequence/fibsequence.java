/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibsequence;

import java.util.ArrayList;
import java.util.Scanner;

public class fibsequence {

    enum TempInst{celsius, Celsius, Fahrenheit, fahrenheit};
       
    public static void main(String[] args) {
                   
        ArrayList<Integer> FibList = new ArrayList<>();
        int n =1, m = 2, fibnum;
        FibList.add(n);
        FibList.add(m);
        
        TempInst temp;
        int tempvalue;
        int celsius;
                
        for (int i = 1; i<20; i++){
                        
            int a = FibList.get(i);
            int b = FibList.get(i - 1);
            int FibNum = a + b;
            FibList.add(FibNum);
        }
        System.out.println(FibList);
        tempvalue = FibList.get(9);
         System.out.println(tempvalue);
         
        System.out.println("Would you like the temperature to be displayed in fahrenheit or celsius? (Type in all lowercase)");
        Scanner myNumber = new Scanner(System.in);
        temp = TempInst.valueOf(myNumber.next());
        
        
           switch ( temp ) {
   case fahrenheit:
      System.out.println("The current temperature is " + tempvalue + " degrees fahrenheit.");
      break;
   case celsius:
       celsius = ((5*(tempvalue - 32))/9);
      System.out.println("The current temperature is " + celsius + " degrees celsius.");
      break;
   case Fahrenheit:
      System.out.println("The current temperature is " + tempvalue + " degrees fahrenheit.");
      break;
   case Celsius:
       celsius = ((5*(tempvalue - 32))/9);
      System.out.println("The current temperature is " + celsius + " degrees celsius.");
      break;
        }    
    }
    
    }