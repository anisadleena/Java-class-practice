package org.javaPractice;

public class Car {
    private int doors;
    private String engine;
    private String driver;
    public  int speed;
    //==========================================================
//    To generate getter and setter automatically
//    Main menu > code > Generate... > Getter and Setter (choose based on your requrement) > Ok
// ==========================================================
    public Integer getDoors() {
        return doors;
    }

    public void setDoors(int doors) {
        this.doors = doors;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getDriver() {
        return driver;
    }

    public void setDriver(String driver) {
        this.driver = driver;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
}
