package org.javaPractice;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();

        car.speed = 100;
        System.out.println("speed car: " + car.speed);

        car.setDoors("closed");
        System.out.println("car doors: " +car.getDoors());

        car.setEngine("on");
        System.out.println("car engine: " +car.getEngine());

        car.setDriver("seated");
        System.out.println("car driver: " +car.getDriver());

        System.out.println("car is " +car.run());
//        ----------------------------------------------------
        System.out.println("=================another way");

        Smartphone phone = new Smartphone();

        System.out.println("brand: " +phone.getBrand());
        //        ----------------------------------------------------
        System.out.println("=================another way");

        Food food = new Food("Banana Pancake");

        System.out.println("food: "+food.getFood());

    }
}