package com.boundsofjava.newsletter.defaultargument;

public class DefaultArgumentsExample {

    public void demo() {
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("DEFAULT ARGUMENTS");
        System.out.println("-----------------------------------------");

        // Create a common male programmer
        MaleProgrammer maleProgrammer = new MaleProgrammer();

        // Create reference pointing to performTask method of maleProgrammer instance
        DefaultArguments<Task, Integer, Integer> reference = task -> duration -> women ->
                maleProgrammer.performTask(task, duration, women);

        // Create new reference with default arguments
        // As our male programmer has just seen a superhero movie, his defaults will be:
        // - 1st argument:          task = talk about superheros
        // - 2nd argument: durationHours = 4
        // - 3rd argument:   womenNearby = 0
        DefaultArguments<Task, Integer, Integer> referenceAfterMovie = reference
            .defaultingFirst(Task.TALK_ABOUT_SUPERHEROS)
            .defaultingSecond(4)
            .defaultingThird(0);

        // Invoke referenceAfterMovie, overriding 1st argument only
        referenceAfterMovie.invoke(Task.DEVELOP_SOFTWARE, null, null);

        // Invoke referenceAfterMovie, overriding 2nd and 3rd arguments
        referenceAfterMovie.invoke(null, 2, 3);

        // Invoke referenceAfterMovie, defaulting all arguments
        referenceAfterMovie.invoke(null, null, null);

        System.out.println();

        // Create another reference with default arguments
        // Our male programmer is working hard now, but he sits next to a woman,
        // so his defaults will be:
        // - 1st argument:          task = develop software
        // - 2nd argument: durationHours = 8
        // - 3rd argument:   womenNearby = 1
        DefaultArguments<Task, Integer, Integer> hardWorkReference = reference
                .defaultingFirst(Task.DEVELOP_SOFTWARE)
                .defaultingSecond(8)
                .defaultingThird(1);

        // Invoke hardWorkReference, overriding 1st and 3rd arguments
        hardWorkReference.invoke(Task.FALL_IN_LOVE, null, 0);

        // Invoke hardWorkReference, overriding 2nd argument only
        hardWorkReference.invoke(null, 12, null);

        // Invoke hardWorkReference, defaulting all arguments
        hardWorkReference.invoke(null, null, null);
    }
}
