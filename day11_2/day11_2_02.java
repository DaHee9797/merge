package day11_2;
//// static_2 ////
public class day11_2_02 {

    public static void main(String[] args) {
        System.out.println(Parson.avgAge);
//        System.out.println(Parson.age); // 객체를 만들지 않았기 때문

        Parson p1 = new Parson();
        System.out.println(p1.age);

        Parson.hi(); // 안녕

        Car.run();
    }
}

class Car {
    public static void run() {
        System.out.println("자동차가 달립니다.");
    }
}

class Parson {
    static int avgAge = 100; // 클래스 변수
    int age = 30; // 인스턴스 변수

    public static void hi() {
        System.out.println("안녕");
    }
}


