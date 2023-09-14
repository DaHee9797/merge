package day12;
//// 레퍼런스(참조) 변수 ////
public class day12_01 {

    public static void test(String paran) {
        int a = 10;
        System.out.println(paran);
    }

    public static void main(String[] args) {
        int num = 10;
        String str = "hello";
        double d = 3.14;

        test(str);

        System.out.println(num);
    }
}

