package KinderGartenGarden;

import java.util.Scanner;

public class FindPlant {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = new String[2];
        try{
            for (int i = 0; i < input.length; i++) {
                System.out.println("Enter the row "+(i+1)+" input");
                while (true) {
                    input[i] = scanner.nextLine();
                    if(input[i].length() == 24)
                        break;
                    System.out.println("Enter a string containing a length of 24!!!");
                }
            }
        }
        catch(Exception e){
            System.out.println(e.getStackTrace());
        }

        KinderGarten kGarten = new KinderGarten(input);

        System.out.println("Enter the student name from the following students to find their plants");
        System.out.println("Alice, Bob, Charlie, David, Eve, Fred, Ginny, Harriet, Ileana, Joseph, Kincaid, and Larry.");
        
        String student = "";
        try{
            while (true) {
                student = scanner.nextLine();
                if(KinderGarten.map.containsKey(student))
                    break;
                System.out.println("Enter a valid name");
            }
        }
        catch(Exception e){
            System.out.println(e.getStackTrace());
        }

        System.out.println("\n"+"The plants are"+"\n"+kGarten.findThePlants(student));
        scanner.close();
    }
}
