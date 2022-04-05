package com.java30;

import java.util.Random;

public class Main {
    public static int SIZE = 8;

   public static int[][] colors = randomGenerate();

   public static int[][] printArray(int[][] a) {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.format("%4d", a[i][j]);
            }
            System.out.println();
        }
        System.out.println();
        return a;
    }

    public static int[][] randomGenerate() {
       int colors[][] = new int[SIZE][SIZE];
        Random random = new Random();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                colors[i][j] = random.nextInt(256);
            }
        }
        return colors;
    }

    public static int[][] rotate(int[][] a) {
        int[][] rotatedColors = new int[colors.length][colors.length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length; j++) {
                rotatedColors[i][j] = a[a.length - j - 1][i];
            }
        }
        printArray(rotatedColors);
        rotatedColors = a;
        return rotatedColors;
    }

    public static void main(String[] args) {
        randomGenerate();
        printArray(colors);
        rotate(colors);
        //System.out.println("Готово");
    }
}
