package com.boundsofjava.newsletter.defaultargument;

/**
 * <p>Represents all possible tasks a typical male programmer can accomplish.</p>
 */
public enum Task {
    DEVELOP_SOFTWARE("developing software", 100.0),         // What every programmer is paid to do
    GO_TO_TOILET("in the toilet", 10.0),                    // Not working, but programmer still thinks
    TALK_ABOUT_SUPERHEROS("talking about superheros", 1.0), // Almost no profit, but programmer uses his brain
    FALL_IN_LOVE("in love", -50.0);                         // Very rare, when it happens programmer can't think

    private final String action;

    private final double profitPerHour;

    Task(String action, double profitPerHour) {
        this.action = action;
        this.profitPerHour = profitPerHour;
    }

    public String getAction() {
        return action;
    }

    public double getProfitPerHour() {
        return profitPerHour;
    }
}
