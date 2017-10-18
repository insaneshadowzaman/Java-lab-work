package com.learning.insane.vehicletype;

import com.learning.insane.Vehicle;

public abstract class Air implements Vehicle {

    protected int sp;
    protected boolean running;

    public Air(int sp, boolean running) {
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
}
