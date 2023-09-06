package day6;

public class test_01 {

    public static void main(String[] args) {

        // 피자 조각 개수가 사람의 수보다 부족하다면 피자 한판을 더 시킨다를 출력하라
        // 부족하지 않다면 잘 먹었다를 출력하라
        //다만 사람들은 한명당 2조각씩 먹는다.

        int a = 15;
        int b = 12;

        if (a < b * 2) {
            System.out.println("한판 더 시킨다.");
        }
        else {
            System.out.println("잘 먹었다.");
        }

        // 사용자로부터 나이를 입력 받고, 18세 미만인 경우 "미성년자", 18세 이상 65세 미만인 경우 "성인"
        // 65세 이상인 경우 "노인"을 출력하는 프로그램을 작성하세요.

        int c = 9;

        if (c < 18) {
            System.out.println("미성년자");
        }
        else if (c >= 18 && c < 65) {
            System.out.println("성인");
        }
        else {
            System.out.println("노인");
        }

        // 사용자로부터 세 개의 숫자를 입력 받고, 이 숫자가 삼각형의 변의 길이로 사용 가능한지 판별하는
        // 프로그램을 작성하세요. (세 변의 길이로 삼각형을 만들 수 있는 경우 "삼각형을 만들 수 있습니다.
        // "를 출력하고, 그렇지 않은 경우 "삼각형을 만들 수 없습니다."를 출력하세요.)
        // 삼각형은 세변이 있는데 한변의 길이가 2변의 길이의 합보다 작아야 삼각형을 만들 수 있다.

        int d = 57;
        int e = 23;
        int f = 98;

        if (d + e < f) {
            System.out.println("삼각형을 만들 수 있습니다.");
        }
        else {
            System.out.println("삼각형을 만들 수 없습니다.");
        }

        //온도가 0도 미만인 경우: "매우 추워요!"
        //온도가 0도 이상 10도 미만인 경우: "추워요."
        //온도가 10도 이상 20도 미만인 경우: "시원해요."
        //온도가 20도 이상인 경우: "따뜻해요!"

        int g = 0;

        if (g < 0) {
            System.out.println("매우 추워요!");
        }
        else if (g >= 0 && g < 10) {
            System.out.println("추워요");
        }
        else if (g >= 10 && g < 20) {
            System.out.println("시원해요");
        }
        else {
            System.out.println("따뜻해요");
        }

        // 사용자로부터 국어, 영어, 수학 점수를 입력 받고, 이 점수들의 평균을 계산한 후, 평균에 따라 "합격"
        // 또는 "불합격"을 출력하는 프로그램을 작성하세요. (평균이 70점 이상이면 "합격", 미만이면 "불합격")

        int h = 100;
        int i = 50;
        int j = 80;

        if ((h + i + j ) / 3 >= 70) {
            System.out.println("합격");
        }
        else {
            System.out.println("불합격");
        }

        //사용자로부터 두 개의 숫자를 입력 받고, 이 두 숫자 중에서 더 큰 숫자를
        // 출력하는 프로그램을 작성하세요.

        int k = 22;
        int l = 45;

        if (k > l) {
            System.out.println("k가 l보다 더 큽니다.");
        }
        else {
            System.out.println("l이 k보다 더 큽니다.");
        }

        //사용자로부터 세 개의 숫자를 입력 받고, 이 세 숫자 중에서 가장 작은 숫자를
        // 출력하는 프로그램을 작성하세요.

        int m = 876;
        int n = 459;

        if (m < n) {
            System.out.println("m이 n보다 더 작습니다.");
        }
        else {
            System.out.println("n이 m보다 더 작습니다.");
        }

        // 사용자로부터 두 개의 정수를 입력 받고, 이 두 정수가 서로 다른 부호를 가지는지를
        // 판별하는 프로그램을 작성하세요.

        int o = -97;
        int p = -264;

        if (o > 0 && p > 0 ||
                o < 0 && p < 0) {
            System.out.println("o와 p는 같은 부호입니다.");
        }
        else {
            System.out.println("o와 p는 같은 부호가 아닙니다.");
        }
        // 사용자로부터 세 개의 숫자를 입력 받고, 이 숫자들이 등차수열을 형성하는지를 판별하고,
        // 등차수열이라면 등차값을 출력하는 프로그램을 작성하세요.

        int q = 7;
        int r = 14;
        int s = 21;

        if (r - q == s - r) {
            System.out.println("등차수열입니다");
            System.out.println(s - r);
        }
        else {
            System.out.println("등차수열이 아닙니다.");
        }

        // 사용자로부터 과목별 점수를 입력 받고, 세 과목의 평균 점수를 계산하여 출력하는 프로그램을
        // 작성하세요. 평균 점수가 90 이상이면 "A", 80 이상이면 "B", 70 이상이면 "C", 60 이상이면 "D",
        // 그 미만이면 "F"를 출력하세요.

        int t = 70;
        int u = 20;
        int v = 60;

        int tuv_p = (t + u + v) / 3;

        if (tuv_p >= 90) {
            System.out.println("A");
        }
        else if (tuv_p >= 80) {
            System.out.println("B");
        }
        else if (tuv_p >= 70) {
            System.out.println("C");
        }
        else if (tuv_p >= 60) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }


        // 사용자로부터 숫자를 입력 받고, 입력된 숫자가 짝수인지 홀수인지를 판별하여 출력하는 프로그램을
        // 작성하세요. (힌트: % 연산자를 사용하여 짝수와 홀수를 판별할 수 있습니다.)




    }









}




















