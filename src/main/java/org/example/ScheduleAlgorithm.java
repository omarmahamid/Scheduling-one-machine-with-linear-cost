package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class ScheduleAlgorithm implements Schedule{


    @Override
    public List<Job> optimizedPermutation(List<Job> jobs) {

        return jobs
                .stream()
                .sorted(Comparator.comparingInt(o -> (o.getPenalty().getCoefficient() / o.getTime())))
                .collect(Collectors.toList());
    }
}
