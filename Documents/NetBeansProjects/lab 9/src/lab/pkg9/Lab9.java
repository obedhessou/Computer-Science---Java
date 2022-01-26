/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab.pkg9;
import java.util.Scanner;

/**
 *
 * @author Jesus My Lord
 */
public class Lab9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.print("Input total sales of month: ");
       double totalSales = input.nextDouble();
       double stateTax = totalSales * 0.04;
       double countyTax = totalSales * 0.02;
       double totalSalesTax = stateTax + countyTax;
       System.out.println("County Tax: $" + countyTax);
       System.out.println("State Tax: $" + stateTax);
       System.out.println("Total Sales Tax: $" + totalSalesTax);
       
      // create a 2d array
        int[][] a = {
            {1, 2, 3}, 
            {4, 5, 6, 9}, 
            {7}, 
        };
      
        // calculate the length of each row
        System.out.println("Length of row 1: " + a[0].length);
        System.out.println("Length of row 2: " + a[1].length);
        System.out.println("Length of row 3: " + a[2].length);
    }
}
      
   

    