package SudokuHelper;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Sudoku {
    public static void main(String[] args) {
        List<List<Integer>> result = new ArrayList<>(); 
        List<Integer> temp = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int cageSize = scanner.nextInt();
        int cageSum = scanner.nextInt();
        scanner.close();
        addAllPossibleResults(result, temp, cageSum, cageSize,1);
        System.out.println(result);
    }
    public static void addAllPossibleResults(List<List<Integer>> list, List<Integer> temp,int totalSum, int totalCount, int start){
        if (totalSum==0 && totalCount==0) {
            list.add(new ArrayList<>(temp));
            return;
        }
        if (totalSum<0 || totalCount==0) {
            return;
        }
        for (int i = start; i<=9; i++) {
            temp.add(i);
            addAllPossibleResults(list, temp, totalSum-i, totalCount-1,i+1);
            temp.remove(temp.size()-1);
        }
    }
}
