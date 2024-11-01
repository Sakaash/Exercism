package RaindropConvertor;

import java.util.Scanner;

public class RainDropConvertor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        System.out.println(convert(number));
        scanner.close();
    }
    static String convert(int number) {
        StringBuilder result = new StringBuilder();
        if (number%3 == 0) {
            result.append("Pling");
        }
        if (number%5 == 0) {
            result.append("Plang");
        }
        if (number%7 == 0) {
            result.append("Plong");
        }
        if (result.length() == 0) {
            result.append(number);
        }
        return result.toString();
    }
}
