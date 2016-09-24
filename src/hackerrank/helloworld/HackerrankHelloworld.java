/*
 *  This work by Randy Urtubia is licensed under the Creative Commons.
 * 
 *  Attribution: You must give appropriate credit, provide a link to the license, and indicate if changes were made.
 *    You may do so in any reasonable manner, but not in any way that suggests the licensor endorses you or your use.
 *  NonCommercial: You may not use the material for commercial purposes.
 *  ShareAlike: If you remix, transform, or build upon the material, you must distribute your contributions under the same license as the original.
 * 
 *  Based on a work at http://www.notnull.cl.
 *  To view a copy of this license, visit http://creativecommons.org/licenses/by-nc-sa/4.0/.
 */
package hackerrank.helloworld;

import java.util.Scanner;

/**
 *
 * @author Randy
 */
public class HackerrankHelloworld {

    public static void main(String[] args) {
    
        
    Scanner scan = new Scanner(System.in);
    
    String inputString = scan.nextLine();
    scan.close();
    
    System.out.println("Hello World!");
    System.out.println(inputString);
    
        
    }
    
}
