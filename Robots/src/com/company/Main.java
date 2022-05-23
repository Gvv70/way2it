package com.company;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        List <Robot> robotPark = new ArrayList<>();
        Robot robot = new Robot();
        CoffeRobot coffeRobot = new CoffeRobot();
        RobotDancer robotDancer = new RobotDancer();
        RobotCoocker robotCoocker = new RobotCoocker();
        robotPark.add(robot);
        robotPark.add(coffeRobot);
        robotPark.add(robotDancer);
        robotPark.add(robotCoocker);

        for (Robot rb: robotPark){
            rb.work();
        }
        //
    }
}
