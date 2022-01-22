import java.util.*;
import java.io.*;

public class Puzzle {


    public static void main(String[] args) throws Exception {
        Scanner reader = new Scanner(System.in);

        System.out.println("\n\tWelcome to 8-Puzzle\n");
        System.out.println("Select difficulty:");
        System.out.println(" 1: Easy");
        System.out.println(" 2: Medium");
        System.out.println(" 3: Hard");
        int difficulty = reader.nextInt();

        System.out.println("\nSelect search algorithm:");
        System.out.println(" 1: Breadth-First Search");
        System.out.println(" 2: Depth-First Search");
        System.out.println(" 3: Greedy Best-First Search");
        System.out.println(" 4: Uniform Cost Search");
        System.out.println(" 5: A* with h1");
        System.out.println(" 6: A* with h2");
        int algorithm = reader.nextInt();

        int[] root;
        switch(difficulty){
            case 1:
                root = new int[] {1,3,4,8,6,2,7,0,5};
            case 2:
                root = new int[] {2,8,1,0,4,3,7,6,5};
            case 3:
                root = new int[] {5,6,7,4,0,8,3,2,1};
        }

        int[] goal = {1,2,3,8,0,4,7,6,5};
        switch(algorithm){
            case 1:
                

            case 2:

            case 3:

            case 4:

            case 5:

            case 6:
        }

    }
}
