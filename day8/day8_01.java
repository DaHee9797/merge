package day8;

//// 함수 복습 ////
public class day8_01 {

    // 함수 정의
    // void - 리턴타입
    // day8_01 - 함수명
    // () - 매개변수

   public static void test() {

       System.out.println("코드1");
       System.out.println("코드2");
       System.out.println("코드3");
       System.out.println("코드4");

       // 함수가 끝나면 호출한 부분으로 리턴한다.
   }
   public static void plus(int num1, int num2 , int num3) {

       int result = num1 + num2 + num3;

       System.out.println(result);
   }

   // main 함수
    public static void main(String[] args) {

        System.out.println("main 함수 시작");

//       int a; // 선언
//       a = 2; // 할당 (대입)
//
//        System.out.println(a);
//        System.out.println(a);
//        System.out.println(a);


        // 함수
        // 1. 함수는 코드 저장소
        // 2.함수는 정의해야 한다. -> 함수 정의 문법 사용
        // 3. 함수 규칙
        //  - 함수는 클래스 안에서 정의해야 한다. (함수 안에 함수 정의 X)
        //  - 리턴타입, 함수명, 매개변수를 지정해야 한다.
        //  - 같은 이름의 함수를 2개 이상 만들지 않는다.
        //  - 함수는 호출(사용) 해야만 실행된다.
        //  - 함수의 개수는 제한이 없음


        // 정의된 함수를 호출(사용)
        // 1. 함수의 가장 큰 사용 못정 -> 코드의 재사용
//        test();
//        System.out.println("another code1");
//        test();
//        System.out.println("another code2");
//        test();
//        System.out.println("another code3");



        plus(10, 20, 30); // 30

        plus(100, 200, 300); // 300

        System.out.println("main 함수 끝");
    } // 끝
}
