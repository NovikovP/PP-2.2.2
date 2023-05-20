package web.model;

public class Car {
    String model;
    String color;
    int age;
    int maxSpeed;

    public Car(String model, String color, int age, int maxSpeed) {
        this.color = color;
        this.age = age;
        this.maxSpeed = maxSpeed;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getAge() {
        return age;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

}