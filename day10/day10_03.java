package day10;

import java.util.Scanner;

public class day10_03 {


    static void star(int line_num) {

        int pos = 0;

        for (int i = 1; i <= line_num; i++) {
            for (int k = 1; k <= line_num *2; k++) {
                pos = line_num - i;
                if (pos < k && k < (line_num * 2)-pos) {
                    System.out.print("*");
                }
               else {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }


    public static void main(String[] args) {

        star(4);
        star(6);
        star(9);
    }


}

