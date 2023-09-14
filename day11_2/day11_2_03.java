package day11_2;
//// static_3 (인스턴스 변수 및 메서드 사용) ////
public class day11_2_03 {
    public static void main(String[] args) {

        Calculator c1 = new Calculator();
        c1.plus(1,2);
        c1.test();

    }
}

class Calculator {

    int result; // 인스턴스 변수 -> 두 함수(메서드)가 공유

    // 클래스 변수 -> 모든 이스턴스가 공유.
    // 인스턴스 변수 -> 모든 함수(메서드)가 공유.
    // 지역 변수 -> 함수(메서드)가 단독으로 사용하는 변수(다른 함수 사용 X)

    public void plus(int num1, int num2) {
        result = num1 + num2;

        System.out.println(result);
    }

    public void test() {
        System.out.println(result); // plus가 만든 result는 다른 함수인 test가 사용 X
    }

}







