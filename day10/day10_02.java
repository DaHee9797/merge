package day10;

import java.util.Scanner;

public class day10_02 {

        // 별 출력 함수 //

        static void star(int line_num) {
            int pos = 0;
            for (int i=1; i<=line_num; i++) {
                for (int j=1; j<= line_num *2; j++) {
                    pos = line_num - i;
                    if(pos < j && j < (line_num * 2) -pos) {
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

        Scanner sc = new Scanner(System.in);        // 스캐너 생성이고 // 스캐너는 프린터와 반대로 입력을 하는 객체

        System.out.print("높이를 입력해주세요 : ");

        int num = sc.nextInt();                    //Integer.valueOf -> String을 int 로 바꿔주는 함수
                                                    // nextLine() 한줄 읽어오고 버퍼를 자동으로 비우는데
                                                    // nextInt 너가 비워줘야 에러가 안나거든
        sc.nextLine();                              // 버퍼 비우기 // 버퍼는 일식적으로 데이터를 보관하는 메모리

        star(num);
    }
}

