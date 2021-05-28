package com.company.Weak3Day4;

public class TriangleBlock {
    public static void main(String[] args) {
        int rows = 5;
        System.out.println(calculateBlocks(rows));
    }
    public static int calculateBlocks(int rows){
        if(rows == 0){
            return 0;
        }
        return rows + calculateBlocks(rows - 1);
    }
}
