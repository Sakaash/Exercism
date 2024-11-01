package PythagoreanTriplet;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Triplet {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        List<List<Integer>> list = new ArrayList<>();
        for (int a = 1; a < number; a++) {
            int a2 = a*a;
            for (int b = a+1; b < number; b++) {
                int b2 = b*b;
                int c = number - b - a;
                int c2 = (int)Math.pow(c, 2);
                if(c>b && (a2+b2) == c2 && a+b+c == number){
                    List<Integer> temp = new ArrayList<>();
                    temp.add(a);
                    temp.add(b);
                    temp.add(c);
                    list.add(new ArrayList<>(temp));
                }
            }
        }
        for (List<Integer> li : list) 
            System.out.println(li);
        scanner.close();
    }
}
