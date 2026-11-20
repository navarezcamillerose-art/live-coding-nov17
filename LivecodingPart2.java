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
    
        Scanner input = new Scanner(System.in);

        // 1. Ask how many grades will be entered
        System.out.print("How many grades? ");
        int n = input.nextInt();

        // 2. Create the array and fill it with numbers you type
        int[] grades = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter grade " + (i + 1) + ": ");
            grades[i] = input.nextInt();
        }

        // 3. Ask for the passing mark
        System.out.print("Enter passing mark: ");
        int passingMark = input.nextInt();

        // Test the iterative method (Part A)
        int loopResult = countPassing(grades, passingMark);
        System.out.println("Loop Result: " + loopResult);

        // Test the recursive method (Part B)
        int recursiveResult = countPassingRecursive(grades, passingMark, 0);
        System.out.println("Recursive Result: " + recursiveResult);

        // Example call to computeAverage (using sum of all grades and count)
        int total = 0;
        for (int grade : grades) {
            total += grade;
        }

        double average = computeAverage(total, grades.length);
        System.out.println("Average: " + average);

        input.close();
       

    }

    // Part A: Iterative method with a loop
    static int countPassing(int[] grades, int passingMark) {
        int count = 0;

        for (int i = 0; i < grades.length; i++) {
            if (grades[i] >= passingMark) {
                count++;
            }
        }

        return count;
    }

    // Part B: Recursive method (no loops, index starts at 0)
     static int countPassingRecursive(int[] grades, int passingMark, int index) {
        if (index == grades.length) {
            return 0;
        }

        int thisOne = (grades[index] >= passingMark) ? 1 : 0;

        return thisOne + countPassingRecursive(grades, passingMark, index + 1);
    }

    static double computeAverage(int total, int count) {
        if (count <= 0) {
            return 0.0;
        }
        return (double) total / count;
    }
}

//What does each recursive call do to index, and why must it change?
//Each call passes index + 1 so it moves to the next grade. If it didn't change, it would just keep checking the same spot over and over and never finish.
//What happens if you delete the base case entirely?
//Without the base case to stop it, it keeps going past the array and crashes with an error.
