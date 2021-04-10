package com.ipl.fantasy.domain;

public class CreditDecisionMakerImpl implements PointsCalculator {

    @Override
    public int makeBatsmanDecision(int runsScored) {
        return runsScored;
    }

    @Override
    public int makeBowlerDecision(int ballsBowled, int wickets, int runsLeaked) {
        return (wickets * 25) + (ballsBowled - runsLeaked);
    }
}
