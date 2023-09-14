package day11;

public class day11_04 {
    public static void main(String[] args) {

// Student 클래스를 정의하세요. 이 클래스는 다음 속성을 가지고 있어야 합니다.

// 학생의 이름 (name)
// 학생의 학번 (studentID)
// 학생의 성적 (grade)

// Student 클래스에 다음과 같은 메서드를 추가하세요.

// printInfo(): 학생의 이름, 학번, 성적을 출력하는 메서드.
// calculateGrade(): 성적을 계산하는 메서드. 성적은 다음과 같이 계산됩니다.

// 90 이상: A
// 80 이상: B
// 70 이상: C
// 60 이상: D
// 60 미만: F

// 프로그램에서 적어도 두 명의 학생 객체를 생성하고, 각 학생의 정보를 설정한 후

// printInfo() 메서드를 사용하여 출력하세요.

        Student s1 = new Student();
        Student s2 = new Student();

        s1.name = "정다희";
        s1.studentID = 190307;
        s1.grade = 80;

        s2.name = "김주현";
        s2.studentID = 190728;
        s2.grade = 20;

        s1.printInfo();
        s1.calculateGrade();

        s2.printInfo();
        s2.calculateGrade();
    }
}

class Student {

    String name;
    int studentID;
    int grade;

    void printInfo() {
        System.out.print("이름 : " + name + ", 학번 : " + studentID + ", 성적 : " + grade);
    }

    void calculateGrade() {
        if (grade >= 90) {
            System.out.println(" A");
        }
        else if (grade >= 80) {
            System.out.println(" B");
        }
        else if (grade >= 70) {
            System.out.println(" C");
        }
        else if (grade >= 60) {
            System.out.println(" D");
        }
        else {
            System.out.println(" F");
        }
    }
}


// 90 이상: A
// 80 이상: B
// 70 이상: C
// 60 이상: D
// 60 미만: F

