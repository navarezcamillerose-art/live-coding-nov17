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
    
        int[] grades = {88, 79, 65};
        int passingMark = 75;

        // Test the iterative method (Part A)
        int loopResult = countPassing(grades, passingMark);
        System.out.println("Loop Result: " + loopResult); // Should print 2

        // Test the recursive method (Part B)
        int recursiveResult = countPassingRecursive(grades, passingMark, 0);
        System.out.println("Recursive Result: " + recursiveResult); // Should print 2
    }

    // Part A: Iterative method with a loop
    public static int countPassing(int[] grades, int passingMark) {
        // Initialize a counter to keep track of passing grades
        int count = 0;

        // Loop through every element in the grades array
        for (int i = 0; i < grades.length; i++) {
            // Check if the current grade meets or exceeds the passing mark
            if (grades[i] >= passingMark) {
                count++;
            }
        }

        return count;
    }

    // Part B: Recursive method (no loops, index starts at 0)
    public static int countPassingRecursive(int[] grades, int passingMark, int index) {
        // Stop when the index reaches the end of the array
        if (index == grades.length) {
            return 0;
        }

        int thisOne = (grades[index] >= passingMark) ? 1 : 0;

        // Add current match and move to the next index
        return thisOne + countPassingRecursive(grades, passingMark, index + 1);
    }

}
