package day11_2;
// 문제 : 아래 코드의 잘 못된 점을 고쳐보세요. 그리고 printValue 함수를 완성시켜주세요.
public class day11_2_06 {
    public static void main(String[] args) {
        Main main = new Main();

        System.out.println(main.num); // 출력 : 10

        main.printValue("안녕");
        // 출력 : 안녕
    }
}

class Main {

    int num = 10;

    public void printValue(String value) {
        System.out.println(value);
    }
}
