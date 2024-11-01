package Transcription;

import java.util.Scanner;

public class Rna {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the DNA Sequence : ");
        char[] dnaSequence = new char[4];
        for (int i = 0; i < dnaSequence.length; i++) {
            while (true) {
                dnaSequence[i] = scanner.next().toUpperCase().charAt(0);
                if(dnaSequence[i]=='G' || dnaSequence[i]=='A' || dnaSequence[i]=='C' || dnaSequence[i]=='T')
                    break;
                System.out.println("Enter any one among four nucleotides");
            }
        }
        StringBuilder resultantRna = new StringBuilder();
        for (int i = 0; i < dnaSequence.length; i++) {
            if (dnaSequence[i] == 'G') {
                resultantRna.append("C ");
            } else if(dnaSequence[i] == 'C') {
                resultantRna.append("G ");
            } else if(dnaSequence[i] == 'T') {
                resultantRna.append("A ");
            } else {
                resultantRna.append("U ");
            }
        }
        System.out.println(resultantRna.toString());
        scanner.close();
    }
}
