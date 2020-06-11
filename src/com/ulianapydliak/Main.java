package com.ulianapydliak;

import java.util.HashSet;
import java.util.Set;

public class Main {

    public static boolean sudoku2(char[][] grid) {
        HashSet<String> found = new HashSet<>();
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                char c = grid[i][j];
                if (c != '.') {
                    if (!found.add(c + "found in a row: " + i) ||
                            !found.add(c + "found in a column: " + j) ||
                            !found.add(c + "found in a sub box:" + i / 3 + " : " + j / 3)) {
                        return false;
                    }


                }

            }
        }
        return true;

    }


    public static void main(String[] args) {
        char[][] grid = {{'.', '.', '.', '1', '4', '.', '.', '2', '.'},
                {'.', '.', '6', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '.', '.', '.', '.', '.', '.', '.'},
                {'.', '.', '1', '.', '.', '.', '.', '.', '.'},
                {'.', '6', '7', '.', '.', '.', '.', '.', '9'},
                {'.', '.', '.', '.', '.', '.', '8', '1', '.'},
                {'.', '3', '.', '.', '.', '.', '.', '.', '6'},
                {'.', '.', '.', '.', '.', '7', '.', '.', '.'},
                {'.', '.', '.', '5', '.', '.', '.', '7', '.'}};
        System.out.println(sudoku2(grid));
    }
}
