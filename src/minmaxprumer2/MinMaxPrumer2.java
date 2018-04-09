/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minmaxprumer2;

import java.util.Scanner;

/**
 *
 * @author tomas.zach
 */
public class MinMaxPrumer2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in, "CP1250");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int soucet = 0, pocet = 0;
        // nekonečná smyčka
        while (true) {
            System.out.print("vlož "+pocet+",číslo: ");
            int vstup = sc.nextInt();
            if (vstup == 0) break;
            soucet = soucet + vstup;
            if (vstup < min) min = vstup;
            if (vstup > max) max = vstup;
            System.out.println ("mimum: " +min);
            System.out.println ("maximum: "+max);
            System.out.println ("průměr: "+ ((float) soucet/pocet));
        
            
        }
        }
    }
    

