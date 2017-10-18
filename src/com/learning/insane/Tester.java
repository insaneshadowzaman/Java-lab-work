package com.learning.insane;

import com.learning.insane.vehicles.Car;
import com.learning.insane.vehicletype.Land;

public class Tester {
    public void tryVariadicAndTypeSafety(Vehicle... vehicles) {

        for(Vehicle vehicle : vehicles) {

            if(vehicle instanceof Car) {
                Car car = (Car) vehicle;
                System.out.println("\tCalling carFunc() from tryVariadicTypeSafety() for only Car objects");
                car.carFunc();
            }
        }
    }

    public void testTryCatch(Land v, int unit) {
        int newUnitSpeed = 0;
        try {
            newUnitSpeed = v.tryCatchTestGetSpeedInOtherUnit(unit);
            System.out.println("\tThe new unit speed is " + newUnitSpeed);
        } catch (Exception e) {
           // e.printStackTrace();
        } finally {
            System.out.println("\tFinally printed from testTryCatch");
        }

    }

}
