package day7;

public class day7_01 {
    public static void main(String[] args) {

        // for문 (반복문) 복습 //


        // 야호를 n번 출력
        // 128번
//        for (int i = 0; i <= 128; i++) {
//            System.out.println("야호");
//        }


        // 0 ~ n 까지 출력
        // 58 ~ 580
//        for (int i = 58; i <= 580; i ++) {
//            System.out.println(i);
//        }


        // n ~ 0 까지 숫자를 거꾸로 출력
        // 333 ~ 45
//        for (int i = 333; i >= 45; i--) {
//            System.out.println(i);
//        }


        // 0 ~ n 까지 x의 배수 출력
        // 3 ~ 30 / 3의 배수
//        for ( int i = 3; i <= 30; i+=3) {
//            System.out.println(i);
//        }


        // n ~ 0 까지 x의 배수를 거꾸로 출력
        // 178 ~ 2 / 2의 배수
//        for (int i = 178; i >= 2; i -= 2) {
//            System.out.println(i);
//        }


         // 구구단 출력
//        for (int i = 1; i <9; i++) {
//            System.out.println("6*" + i + "=" + i*6);
//
//        }


        // 구구단 거꾸로 출력
//        for (int i = 9; i >= 1; i--) {
//            System.out.println("3*" + i + "=" + i*3);
//        }


        // 93 ~ 300까지 5의 배수 출력하세요 (x도 너 맘대로 근데 10은 말고)
//        for (int i = 93; i <= 300; i += 5) {
//            System.out.println(i);
//        }


        // 12 ~ 295 범위에서 짝수만 출력
//        for (int i = 12; i <= 295; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i);
//            }
//
//        }


        // 77 ~ 156 숫자에서 짝수는 짝수다, 홀수는 홀수다 출력하시오
        // 예시 : 71은 홀수다
        //        72은 짝수다
//        for (int i = 77; i <= 156; i++) {
//            if (i % 2 == 0) {
//                System.out.println(i + " 짝수이다.");
//            }
//            else {
//                System.out.println(i + " 홀수이다.");
//            }
//        }

        //// a b 두 수가 주어지면 a와 b사이의 수를 오름차순 출력해주세요.
        //// 오름차순은 작은 수 부터 큰수로 정렬되는 것을 말합니다.
        //// ex )
        //// 오름차순 :  1, 2, 3, 4, 5
        //// 내림차순 :  5, 4, 3, 2, 1

//        int a = 12;
//        int b = 5;
//
//       for (int i = b; i <= a; i++) {
//           System.out.print(i);
//       }
//        System.out.println();
//
//       for (int i = a; i >= b; i--) {
//           System.out.print(i);
//       }

//        for (int i = 0; i <3; i++) {
//            for (int j = 0; j < 3; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        for (int i = 1; i <= 5; i ++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = 1; i <= 5; i ++) {
            for (int j = 1; j <= 5-i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }

        for (int i = 1; i <= 5; i ++) {

            System.out.println();
        }


//        for (int i = 5; i >= 1; i--) {
//            for (int j = 1; j <= 5-i; j++) {
//                System.out.print(" ");
//            }
//            for (int k = 1; k <= i; k++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }




    }
}














