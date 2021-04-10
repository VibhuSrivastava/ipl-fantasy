package com.ipl.fantasy.api;

public class PointsRequest {
  int runsScored;
  int ballsBowled;
  int wickets;
  int runsLeaked;

  private PointsRequest() {
    // Required by Jackson
  }

  public PointsRequest(int runsScored, int ballsBowled, int wickets, int runsLeaked) {
    this.runsScored = runsScored;
    this.ballsBowled = ballsBowled;
    this.wickets = wickets;
    this.runsLeaked = runsLeaked;
  }

  public int getRunsScored() {
    return runsScored;
  }

  public void setRunsScored(int runsScored) {
    this.runsScored = runsScored;
  }

  public int getBallsBowled() {
    return ballsBowled;
  }

  public void setBallsBowled(int ballsBowled) {
    this.ballsBowled = ballsBowled;
  }

  public int getWickets() {
    return wickets;
  }

  public void setWickets(int wickets) {
    this.wickets = wickets;
  }

  public int getRunsLeaked() {
    return runsLeaked;
  }

  public void setRunsLeaked(int runsLeaked) {
    this.runsLeaked = runsLeaked;
  }
}
