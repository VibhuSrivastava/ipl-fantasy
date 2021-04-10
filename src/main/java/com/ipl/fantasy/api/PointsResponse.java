package com.ipl.fantasy.api;

public class PointsResponse {
  int points;

  private PointsResponse() {
    // Required by Jackson
  }

  public PointsResponse(int points) {
    this.points = points;
  }

  public int getPoints() {
    return points;
  }

  public void setPoints(int points) {
    this.points = points;
  }
}
