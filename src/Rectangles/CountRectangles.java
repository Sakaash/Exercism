package Rectangles;

import java.util.Scanner;

// Sample Input (Give an empty line after the input to process)

//    +--+
//   ++  |
// +-++--+
// |  |  |
// +--+--+
// 

public class CountRectangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a ASCII diagram with any empty line:");
        StringBuilder asciiRectangle = new StringBuilder();
        String line;
        while (!(line = scanner.nextLine()).isEmpty()) {
            asciiRectangle.append(line).append('\n');
        }
        scanner.close();
        String[] diagram = asciiRectangle.toString().split("\n");
        int rectangleCount = countRectangles(diagram);
        System.out.println(rectangleCount);
    }

    private static int countRectangles(String[] diagram) {
        int count = 0;
        int rows = diagram.length;
        int cols = diagram[0].length();

        for (int topRow = 0; topRow < rows; topRow++) {
            for (int leftCol = 0; leftCol < cols; leftCol++) {
                if (diagram[topRow].charAt(leftCol) == '+') {
                    for (int bottomRow = topRow+1; bottomRow < rows; bottomRow++) {
                        for (int rightCol = leftCol+1; rightCol < cols; rightCol++) {
                            if (diagram[bottomRow].charAt(rightCol) == '+'
                                && checkRectangle(diagram, topRow, leftCol, bottomRow, rightCol))
                                count++;
                        }
                    }
                }
            }
        }
        return count;
    }

    private static boolean checkRectangle(String[] diagram, int topRow, int leftCol, int bottomRow, int rightCol) {
        for (int col = leftCol; col <= rightCol; col++) {
            if(diagram[topRow].charAt(col)!='-' && diagram[topRow].charAt(col)!='+')
                return false;
            if(diagram[bottomRow].charAt(col)!='-' && diagram[bottomRow].charAt(col)!='+')
                return false;
            
        }
        for(int row = topRow; row <= bottomRow; row++) {
            if(diagram[row].charAt(leftCol)!='|' && diagram[row].charAt(leftCol)!='+')
                return false;
            if(diagram[row].charAt(rightCol)!='|' && diagram[row].charAt(rightCol)!='+')
                return false;
        }
        return true;
    }
}
