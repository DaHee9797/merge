package day12_2;

public class day12_2_05 {
    public static void main(String[] args) {
        // 자동차 클래스를 만들어보세요. 이 클래스는 자동차의
        // 브랜드, 모델, 연식, 속도 등을 나타낼 수 있어야 하며,
        // 속도를 조절하는 메서드를 포함해야 합니다.

        Car c1 = new Car("Kia", "K7", 2020);

        SportsCar s1 = new SportsCar("Porsche", "911", 2023);

        c1.accelerate(30);
        c1.brake(10);

        s1.enablrTurbo();
        s1.accelerate(30);

        s1.disableTurbo();
        s1.accelerate(30);

    }
}


class Car {
    private String brand;
    private String model;
    private int year;
    private int speed;

    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
        this.speed = 0;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand() {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel() {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear() {
        this.year = year;
    }

    public int getSpeed() {
        return speed;
    }

    public void accelerate(int increment) {
        speed += increment;
        System.out.println("속도가" + increment + "만큼 증가하여 현재 속도는" + speed + "입니다.");
    }

    public void brake(int decrement) {
        speed -= decrement;
        System.out.println("속도가" + decrement + "만큼 감소하여 현재 속도는" + speed + "입니다");
    }
}

class SportsCar extends Car {
    private boolean turbo;

    public SportsCar(String brand, String model, int year) {
        super(brand, model, year);
        this.turbo = false;
    }

    public void enablrTurbo() {
        turbo = true;
        System.out.println("터보 모드가 활성화되었습니다.");
    }

    public void disableTurbo() {
        turbo = false;
        System.out.println("터보 모드가 비활성화되었습니다.");
    }

    public void accelerate(int increment) {
        if (turbo) {
            super.accelerate(2 * increment);
        }
        else {
            super.accelerate(increment);
        }
    }
}


