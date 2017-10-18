package com.learning.insane;

import com.learning.insane.vehicles.Aeroplane;
import com.learning.insane.vehicles.Car;
import com.learning.insane.vehicles.Ship;

public class Main {

    public static void main(String[] args) {
        Tester tester = new Tester();

        System.out.println("Calling tryVariadicAndTypeSafety :");

        tester.tryVariadicAndTypeSafety(new Car(20, true), new Ship(30, true), new Aeroplane(0, false), new Vehicle() {
            @Override
            public int speed() {
                return 10;
            }
            @Override
            public boolean isRunning() {
                return true;
            }
        });

        System.out.println("\nCalling riskily testTryCatch():");
        tester.testTryCatch(new Car(20, true), 0);

        System.out.println("\nCalling Simply testTryCatch():");
        tester.testTryCatch(new Car(20, true), 20);
    }
}
