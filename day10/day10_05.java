//package day10;
//
//public class day10_05 {
//    public static void main(String[] args) {
//
//        청둥오리 a청둥오리 = new 청둥오리();
//        a청둥오리.날다();
//        a청둥오리.헤엄치다();
//        // 출력 : 오리가 날개로 날아갑니다.
//
//        흰오리 a흰오리 = new 흰오리();
//        a흰오리.날다();
//        a흰오리.헤엄치다();
//        // 출력 : 오리가 날개로 날아갑니다.
//
//        고무오리 a고무오리 = new 고무오리();
//        a고무오리.날다();
//        a고무오리.헤엄치다();
//        // 출력 : 오리가 날개로 날아갑니다,
//
//
//        // 상속만으로 코드 중복을 완전히 해소할 수 없었다.
//        // 코드 중복을 해소하기 위해서 상속을 사용하는 건 본질 X
//        // 개층 구조를 표현 가능
//    }
//}
//
//class 오리 {
//    public void 날다() {
//        System.out.println("오리가 날개로 날아갑니다.");
//    }
//
//    public void 헤엄치다() {
//        System.out.println("오리가 오리발로 헤엄칩니다.");
//    }
//}
//
//class 청둥오리 extends 오리 {
//
//}
//
//class 흰오리 extends 오리 {
//
//}
//
//class 고무오리 extends 오리 {
//
//    // 매서드 재정의 (오버라이딩)
//    public void 날다() {
//        System.out.println("저는 날 수가 없어요..");
//    }
//    public void 헤엄치다() {
//        System.out.println("오리가 둥둥 떠다닙니다.");
//    }
//}
//
//class 고무2오리 extends 고무오리 {
//
//}
//
//class 아수라오리 extends 고무오리 {
//    public void 날다() {
//        System.out.println("오리가 날개로 날아갑니다.");
//    }
//    public void 헤엄치다() {
//        System.out.println("오리가 둥둥 떠다닙니다.");
//    }
//}
//
//class 기본날개아이템 {
//    public void 사용() {
//        System.out.println("오리가 날개로 날아갑니다.");
//    }
//}
//
//class 고무날개아이템 {
//    public void 사용() {
//        System.out.println("고무 날개로는 날 수가 없어요..");
//    }
//}