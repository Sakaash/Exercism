package BottleSong;

import java.util.Scanner;

public class CreateSong {
    public static void main(String[] args) {
        String[] numbers = {"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};
        for (int i = 10; i > 0; i--) {
            printVerse(i, numbers);
        }
    }
    public static void printVerse(int count, String[] numbers) {
        System.out.println(numbers[count-1] + " green bottles hanging on the wall,");
        System.out.println(numbers[count-1] + " green bottles hanging on the wall,");
        System.out.println("And if one green bottle should accidentally fall,");

        if (count - 1 > 0) {
            System.out.println("There'll be "+numbers[count-2]+" green bottles hanging on the wall.");
        } else {
            System.out.println("There'll be no green bottles hanging on the wall.");            
        }
        System.out.println();
    }
}
