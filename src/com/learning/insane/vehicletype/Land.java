package com.learning.insane.vehicletype;

import com.learning.insane.Vehicle;

public abstract class Land implements Vehicle {
    protected int sp;
    protected boolean running;

    public Land(int sp, boolean running) {
        this.sp = sp;
        this.running = running;
    }

    @Override
    public int speed() {
        return sp;
    }

    @Override
    public boolean isRunning() {
        return running;
    }

    public int tryCatchTestGetSpeedInOtherUnit(int unit) throws ArithmeticException {
        if(unit == 0) {
            throw new ArithmeticException();
        } else {
            return speed() / unit;
        }
    }
}
