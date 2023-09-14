package day12_2;

public class day12_2_06 {
    public static void main(String[] args) {
        // Car 클래스의 객체 생성
        Car1 myCar = new Car1("Toyota", "Camry", 2022);

        // SportsCar 클래스의 객체 생성
        SportsCar1 mySportsCar = new SportsCar1("Ferrari", "458 Italia", 2022);

        // 일반 자동차 가속 및 제동
        myCar.accelerate(30);
        myCar.brake(10);

        // 스포츠카 가속, 터보 모드 활성화 및 가속
        mySportsCar.enableTurbo();
        mySportsCar.accelerate(30);

        // 터보 모드 비활성화 후 가속
        mySportsCar.disableTurbo();
        mySportsCar.accelerate(30);
    }
}

class Car1 {
    private String brand; //보안상의 어쩌구로 private - class 내부에서만 사용할 수 있게 잠금해버린다고 해야하나
    private String model;
    private int year;
    private int speed;

    public Car1(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.speed = 0; // 초기 속도를 0으로 설정
    }

    // Getter와 Setter 메서드
    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    // 속도를 증가시키는 메서드
    public void accelerate(int increment) {
        speed += increment;
        System.out.println("속도가 " + increment + "만큼 증가하여 현재 속도는 " + speed + "입니다.");
    }

    // 속도를 감소시키는 메서드
    public void brake(int decrement) {
        speed -= decrement;
        System.out.println("속도가 " + decrement + "만큼 감소하여 현재 속도는 " + speed + "입니다.");
    }
}

// 자동차 클래스를 상속받는 하위 클래스
class SportsCar1 extends Car1 {
    private boolean turbo;

    public SportsCar1(String brand, String model, int year) {
        super(brand, model, year);
        this.turbo = false; // 스포츠카의 터보 기능 초기화
    }

    // 터보 모드를 활성화하는 메서드
    public void enableTurbo() {
        turbo = true;
        System.out.println("터보 모드가 활성화되었습니다.");
    }

    // 터보 모드를 비활성화하는 메서드
    public void disableTurbo() {
        turbo = false;
        System.out.println("터보 모드가 비활성화되었습니다.");
    }

    // 오버라이딩된 accelerate 메서드
   // @Override
    public void accelerate(int increment) {
        if (turbo) {
            // 터보 모드가 활성화되면 두 배의 속도로 가속
            super.accelerate(2 * increment);
        } else {
            super.accelerate(increment);
        }
    }
}



