package com.boundsofjava.newsletter.defaultargument;

import java.util.stream.DoubleStream;

/**
 * <p>Represents a typical male programmer.</p>
 */
public class MaleProgrammer {

    /**
     * <p>Puts this male programmer to perform the given task for the specified duration
     * and prints how profitable it was to hire him.</p>
     * <p>Total profit is lowered if there are women nearby.</p>
     *
     * @param task          Task to be performed by this male programmer
     * @param durationHours Duration of the task
     * @param womenNearby   Number of women nearby
     */
    public void performTask(Task task, int durationHours, int womenNearby) {
        String output = "- I've been %s for %d hours.%n";
        output += "  %d women nearby.%n";
        output += "  I'm as valuable as $ %.2f.%n";

        // Calculate initial profit that matches the whole task duration
        double profit = task.getProfitPerHour() * durationHours;

        // Now introduce negative factors (each women nearby
        // implies a cumulative 10% profit reduction)
        double totalProfit = DoubleStream.iterate(profit, p -> p * 0.90)
                .limit(womenNearby + 1)
                .min()
                .orElse(profit);

        System.out.printf(output, task.getAction(), durationHours, womenNearby, totalProfit);
    }

}
