package day8;

public class day8_02 {

    // 얘는 radiis라는 실수형 변수를 입력받고
    // 함수 안에서 무슨 계산을 처리하는진 모르지만 실수형 데이터를 출력하고
    // 대충 함수명을 보니 원의 넓이를 구하는구나
    public static double circleArea(double ban) { // 함수
        double result = ban * ban * 3.14;
        System.out.println(result);

        return result;
    }

    // 입력값 : 정수형 a와 정수형 b
    // 출력값 : 정수형 a+b
    // 함수명 : plus니까 입력된 두개의 정수를 더한 값을 반환하는 더하기 함수로 만들어졌구나!
    public static int plus(int a, int b)
    {
        return a+b;
    }


    public static void main(String[] args) { // 함수

        // 1. 반지름으로 원의 넓이를 구하는 함수 만들기 (정의)
        // 반지름 * 반지름 * 3.14

        // 함수에서 리턴할 때 값을 하나 가지고 올 수 있다. -> 리턴 값
        // 2. 반지름의 5인 원의 넓이를 구해서 출력
       double num = circleArea(5);

        System.out.println(num); // 1 출력



        int p = plus(1,2);
        System.out.println(p);

        // 모든 값 -> 자료형
        // 1 -> 정수
        // 3.14 -> dauble
        // "hello" -> Strung
        // true -> boolear



        // 3. 반지름이 5인 원의 넓이를 2로 나눈 값
        System.out.println( num / 2);

        // 4. 반지름이 5인 원의 넓이를 2 곱한 값
        System.out.println( num * 2);

        // 리턴 (return) -> 함수가 작업한 결과를 직접 받을 수 있음
        // 함수의 결과를 2차 가공할 수 있음


    }
}
