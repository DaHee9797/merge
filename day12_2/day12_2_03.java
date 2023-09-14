package day12_2;

public class day12_2_03 {
    public static void main(String[] args) {

        홍길동 a홍길동 = new 홍길동();
        a홍길동.자바_프로그래밍();

        a홍길동.파이썬_프로그래밍();


        홍길순 a홍길순 = new 홍길순();
//        a홍길순.자바_프로그래밍();
    }
}

// 홍길동의 능력 -> C언어, 자바
class 홍길동 {

    홍길순 a홍길순 = new 홍길순();

    public void C언어_프로그래밍() {
        System.out.println("C언어 프로그램 개발");
    }
    public void 자바_프로그래밍() {
        System.out.println("자바8 프로그램 개발");
    }
    public void 파이썬_프로그래밍() {
        a홍길순.파이썬_프로그래밍();
    }
}

// 홍길순의 능력 -> 자바, 파이썬
class 홍길순 {
//    public void 자바_프로그래밍() {
//        System.out.println("자바8 프로그램 개발");
//    }
    public void 파이썬_프로그래밍() {
        System.out.println("파이썬3.13 프로그램 개발");
    }
}
