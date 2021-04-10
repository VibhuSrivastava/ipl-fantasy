package com.ipl.fantasy.domain;

/**
 * An interface of the credit decision algorithm.
 */
public interface PointsCalculator {

    int makeBatsmanDecision(int runsScored);

    int makeBowlerDecision(int ballsBowled, int wickets, int runsLeaked);

}