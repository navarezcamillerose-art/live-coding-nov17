/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livecoding2.nov17;

import java.util.Scanner;

/**
 *
 * @author NAVAREZ_CPE113
 */
public class Livecoding2Nov17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Call the method directly inside print statements
        System.out.println(computeAverage(5, 2));
        System.out.println(computeAverage(10, 0));
    }

    public static double computeAverage(int total, int count) {
        //check the count if 0 or less to avoid a division by zero error.
        if (count <= 0) {
            return 0.0;
        }
        //cast total to a double  so java keeps decimal points
        return (double) total / count;
    }
}
