package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main{


    public static void main(String[] args) {


        List<Job> jobs = createJobs();

        ScheduleAlgorithm scheduleAlgorithm = new ScheduleAlgorithm();

        System.out.println(scheduleAlgorithm.optimizedPermutation(jobs));
    }


    private static List<Job> createJobs(){
        Job job1 = new Job("1", 2, new LinearFunction(2));
        Job job2 = new Job("2", 2, new LinearFunction(1));
        Job job3 = new Job("3", 2, new LinearFunction(4));
        Job job4 = new Job("4", 1, new LinearFunction(12));

        return Arrays.asList(job1, job2, job3, job4);
    }
}
