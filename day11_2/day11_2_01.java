package day11_2;
//// static ////
public class day11_2_01 {

    public static void main(String[] args) {

        Person p1 = new Person();
        Person p2 = new Person();

        p1.age = 26;
        p1.name = "정다희";
        p1.avgAge = 100;  // 평균나이

        p2.age = 25;
        p2.name = "김주현";

        p1.getLife();
        p2.getLife();
    }
}

class Person {
    // 인류 평균 나이는 모든 사람이 동일하게 공유해야 하는 값.
    // 객체들이 공유해야 하는 자원에는 static을 붙인다.
    static int avgAge; // 평균 나이가 100으로 동일하게 공유됨
    int age;
    String name;

    void getLife() {
        System.out.printf("당신의 남은 수명은 약 %d년 입니다.\n", (avgAge - age));
    }
}
