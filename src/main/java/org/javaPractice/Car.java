package org.javaPractice;

public class Car {
    private String doors;
    private String engine;
    private String driver;
    public  int speed;

    //==========================================================
    //To generate getter and setter automatically (IDE :  IntelIJ)
    //Main menu > code > Generate... > Getter and Setter (choose based on your requrement) > Ok
    // ==========================================================
    public String getDoors() {
        return doors;
    }

    public void setDoors(String doors) {
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
    // ==========================================================

    public String run (){
        if(doors.equals("closed") && engine.equals("on") && driver.equals("seated") && speed>0){
            return "running";
        }else{
            return "stop";
        }
    }
}
