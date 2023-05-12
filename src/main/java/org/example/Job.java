package org.example;

import java.util.function.Function;

public class Job{

    private final String id;
    private final int time;
    private final LinearFunction penalty;

    public Job(String id, int time, LinearFunction penalty) {
        this.id = id;
        this.time = time;
        this.penalty = penalty;
    }

    public String getId() {
        return id;
    }

    public int getTime() {
        return time;
    }

    public LinearFunction getPenalty() {
        return penalty;
    }

    @Override
    public String toString() {
        return id;
    }
}
