package com.boundsofjava.newsletter.defaultargument;

/**
 * <p>Overloads for <code>MaleProgrammer</code>.</p>
 */
public class MethodOverloadingMaleProgrammer extends MaleProgrammer {

    /**
     * <p>Puts this male programmer to perform the given task for the specified duration
     * and prints how profitable it was to hire him.</p>
     * <p>It is assumed that there are no women nearby.</p>
     *
     * @param task          Task to be performed by this male programmer
     * @param durationHours Duration of the task
     */
    public void performTask(Task task, int durationHours) {
        // Method overloading approach weakness: we choose to default womenNearby to 0.
        // As durationsHours is also an int, we cannot overload this method with a default value for it,
        // while also allowing womenNearby as an argument. We have to choose which argument
        // is worth to be given a default value and which argument to expose to the user.
        super.performTask(task, durationHours, 0);
    }

    /**
     * <p>Puts this male programmer to develop software for the specified duration
     * and prints how profitable it was to hire him.</p>
     * <p>It is assumed that there are no women nearby.</p>
     *
     * @param durationHours Duration of software development task
     */
    public void performTask(int durationHours) {
        // Same weakness here: we default task to Task.DEVELOP_SOFTWARE and choose to expose durationHours
        // to the user, while womenNearby implicitly defaults to 0 by delegating to the above method.
        this.performTask(Task.DEVELOP_SOFTWARE, durationHours);
        // or this.performTask(durationHours, 0)
    }

    /**
     * <p>Puts this male programmer to develop software for the specified duration
     * and prints how profitable it was to hire him.</p>
     * <p>Total profit is lowered if there are women nearby.</p>
     *
     * @param durationHours Duration of the task
     * @param womenNearby   Number of women nearby
     */
    public void performTask(int durationHours, int womenNearby) {
        super.performTask(Task.DEVELOP_SOFTWARE, durationHours, womenNearby);
    }

    /**
     * <p>Puts this male programmer to perform the given task for a default duration of 8 hours
     * and prints how profitable it was to hire him.</p>
     * <p>It is assumed that there are no women nearby.</p>
     *
     * @param task Task to be performed by this male programmer
     */
    public void performTask(Task task) {
        this.performTask(task, 8);
    }

    /**
     * <p>Puts this male programmer to develop software for a default duration of 8 hours
     * and prints how profitable it was to hire him.</p>
     * <p>It is assumed that there are no women nearby.</p>
     */
    public void performTask() {
        this.performTask(Task.DEVELOP_SOFTWARE);
        // or this.performTask(8):
    }
}
