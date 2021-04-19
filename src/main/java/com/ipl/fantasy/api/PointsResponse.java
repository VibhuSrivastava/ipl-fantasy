package com.ipl.fantasy.api;

import java.util.Map;

public class PointsResponse {
  Map<String, Integer> batsmenPoints;
  Map<String, Float> bowlerPoints;

  private PointsResponse() {
    // Required by Jackson
  }

  public PointsResponse(Map<String, Integer> batsmenPoints,
      Map<String, Float> bowlerPoints) {
    this.batsmenPoints = batsmenPoints;
    this.bowlerPoints = bowlerPoints;
  }

  public Map<String, Integer> getBatsmenPoints() {
    return batsmenPoints;
  }

  public void setBatsmenPoints(Map<String, Integer> batsmenPoints) {
    this.batsmenPoints = batsmenPoints;
  }

  public Map<String, Float> getBowlerPoints() {
    return bowlerPoints;
  }

  public void setBowlerPoints(Map<String, Float> bowlerPoints) {
    this.bowlerPoints = bowlerPoints;
  }
}
