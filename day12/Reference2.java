package day12;

public class Reference2 {
    public static void main(String[] args) {

        Person p1; // 사람이 한명있다.(X)
        // p1은 null이다.

        p1 = new Person(); // 사람 한명 생성해서 사람 리모컨을 p1에 저장
        Person p2 = new Person(); // 사람 한명 생성해서 사람 리모컨을 p2에 저장

        p1.age = 26;
        p1.name = "정다희";

        p2.age = 25;
        p2.name = "김주현";

        p1.introduce();
        p2.introduce();

        // num1, num2는 원본이고, p1, p2는 참조(reference)다.
        int num1 = 10;
        int num2 = num1;

//        num2 = 20; // num2에 20을 대입해도 num1이 20으로 바뀌진 않는다.

        p1 = p2;

        p1.name = "감자";

        System.out.println(p1.name);

    }
}
