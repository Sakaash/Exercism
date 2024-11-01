package Grains;

import java.util.Scanner;

public class FindNumberOfGrains {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Total number of grains on the chessboard");
        System.out.println("2. Find number of grains in a square");
        int choice;

        while (true) {
            choice = scanner.nextInt();
            if(choice==1 || choice==2)
                break;
            System.out.println("Enter your choice within given options");
        }

        switch (choice) {
            case 1:
                System.out.println(grainsOnSquare(64));
                break;
            case 2:
                int square = 0;
                try {
                    System.out.println("Enter the square which you want to find");
                    while (true) {
                        square = scanner.nextInt();
                        if(square>=1 && square<=64)
                            break;
                        System.out.println("Enter the square number between 1and 64.");
                    }
                } catch (Exception e) {
                    System.out.println(e.getStackTrace());
                }
                System.out.println(grainsOnSquare(square));
                break;
        }
        scanner.close();            
    }
    static long grainsOnSquare(int square) {
        return (long)Math.pow(2, square-1);
    }
}
