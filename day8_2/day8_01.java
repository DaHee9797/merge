package day8_2;

public class day8_01 {
    public static void main(String[] args) {

        // 배열 (Array)
        // 데이터 많아지면 변수만으로 관리 힘들다.
        int a = 1;
        int b = 2;
        int c = 3;
        int d = 4;
        int e = 5;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(d);
        System.out.println(e);



        // 배열은 하나의 변수로 여러개의 갑을 관리

        // 1. 선언과 동시에 저장
        int[] arr = {1,2,3,4,5}; // int 5개짜리 배열

        // 순서 (순번) -> index 로 배열 요소에 접근 가능
        System.out.println(arr[2]); // 3이 출력된다. // 2번 index
        System.out.println(arr[0]); // 1이 출력된다. // 0번 index



        // 2. 선언하고 나중에 저장
        // new 자료형[개수]
//        int[] arr2 = new int[100]; // 0이 100개 만들어짐
//        int[] arr3 = new int[5]; // 0이 5개 만들어짐



        // arr3 배열에 5개의 숫자 저장
//        arr3[4] = 3;
//        arr3[2] = 100;
//        arr3[3] = 70;
//        arr3[0] = 5;
//        arr3[1] = 55;

        // 0 ~ 4 출력
//        System.out.println(arr3[0]);
//        System.out.println(arr3[1]);
//        System.out.println(arr3[2]);
//        System.out.println(arr3[3]);
//        System.out.println(arr3[4]);

        // 반복문 사용 가능 -> 일괄 처리(순회)가 편리하다.
//        for (int i = 0; i < 5; i++) {
//            System.out.println(arr3[i]);
//        }



        // 배열은 같은 자료형만 저장 가능하다.

        // String[] arr4 = {1, "hello", true, 1.4}; // 같은 자료형이 아니면 저장이 불가능하다.
                                                    // 정수면 정수, 실수면 실수끼리만

//        String[] arr5 = new String[3]; // null 3개가 채워짐
//        // "null"- 이건 문자열, null - 값없음  (null - 값이 없다는 뜻)
//
//        arr5[0] = "hello";
//        arr5[1] = "byebye";
//        arr5[2] = "good";
//
//        for (int i = 0; i < 3; i++) {
//            System.out.println(arr5[i]);
//        }





    }
}
