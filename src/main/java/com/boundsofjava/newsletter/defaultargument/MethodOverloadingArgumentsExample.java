package com.boundsofjava.newsletter.defaultargument;

public class MethodOverloadingArgumentsExample {

    public void demo() {
        System.out.println();
        System.out.println("-----------------------------------------");
        System.out.println("METHOD OVERLOADING ARGUMENTS");
        System.out.println("-----------------------------------------");

        // Create a method overloading male programmer
        MethodOverloadingMaleProgrammer programmer = new MethodOverloadingMaleProgrammer();

        // Put programmer to talk about superheros for 1 hour,
        // with 1 woman nearby
        // All arguments explicit
        programmer.performTask(Task.TALK_ABOUT_SUPERHEROS, 1, 1);

        // Send programmer to toilet for 2 hours
        // 3rd argument default (womenNearby): 0
        programmer.performTask(Task.GO_TO_TOILET, 2);

        // Put programmer to do something for 4 hours,
        // with 3 women nearby
        // 1st argument default (task): develop software
        programmer.performTask(4, 3);

        // Programmer has fallen in love
        // 2nd argument default (durationHours): 8
        // 3rd argument default (womenNearby): 0
        programmer.performTask(Task.FALL_IN_LOVE);

        // Put programmer to do something for 4 hours
        // 1sr argument default (task): develop software
        // 3rd argument default (womenNearby): 0
        programmer.performTask(4);

        // Put programmer to do something
        // 1st argument default (task): develop software
        // 2nd argument default (durationHours): 8
        // 3rd argument default (womenNearby): 0
        programmer.performTask();
    }
}
