package com.ipl.fantasy.api;

import java.util.Map;

public class PointsResponse {
  Map<String, Float> batsmenPoints;
  Map<String, Float> bowlerPoints;

  private PointsResponse() {
    // Required by Jackson
  }

  public PointsResponse(Map<String, Float> batsmenPoints,
      Map<String, Float> bowlerPoints) {
    this.batsmenPoints = batsmenPoints;
    this.bowlerPoints = bowlerPoints;
  }

  public Map<String, Float> getBatsmenPoints() {
    return batsmenPoints;
  }

  public void setBatsmenPoints(Map<String, Float> batsmenPoints) {
    this.batsmenPoints = batsmenPoints;
  }

  public Map<String, Float> getBowlerPoints() {
    return bowlerPoints;
  }

  public void setBowlerPoints(Map<String, Float> bowlerPoints) {
    this.bowlerPoints = bowlerPoints;
  }
}
