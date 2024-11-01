package Resistor;

import java.util.HashMap;
import java.util.Scanner;

public class Color {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final HashMap<String, Integer> map = new HashMap<>();
        map.put("black", 0);
        map.put("brown", 1); 
        map.put("red", 2);
        map.put("orange", 3);
        map.put("yellow", 4);
        map.put("green", 5);
        map.put("blue", 6);
        map.put("violet", 7);
        map.put("grey", 8);
        map.put("white", 9);
        System.out.println("Availabe colors are"+ "\n"+map.keySet());
        System.out.println("Enter a valid color to find its color code :");
        String color;
        while (true) {
            color = scanner.nextLine().toLowerCase();
            if(map.containsKey(color))
                break;
            System.out.println("Please enter one of the available colors!!!");
        }
        System.out.println("Color Code : "+map.get(color));
        scanner.close();
    }
}

