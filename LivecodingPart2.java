/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package livecoding.part2;

/**
 *
 * @author NAVAREZ_CPE113
 */
public class LivecodingPart2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        
    }

   public static int countPassing(int[] grades, int passingMark) {
    // Step 1: Initialize a counter to keep track of passing grades
    int count = 0;
    
    // Step 2: Loop through every element in the grades array
    for (int i = 0; i < grades.length; i++) {
        // Step 3: Check if the current grade meets or exceeds the passing mark
        if (grades[i] >= passingMark) {
            count++; // Increment our counter
        }
    }
    
    // Step 4: Return the final total count
    return count;

   }
}