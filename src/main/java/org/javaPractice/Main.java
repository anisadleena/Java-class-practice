package org.javaPractice;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.speed = 100;
        System.out.println("speed car > " + car.speed);

        car.setDoors(4);
        System.out.println("car doors : " +car.getDoors());
    }
}