package com.ipl.fantasy.service;

import java.io.IOException;
import org.junit.Test;

class PointsCalculatorServiceV1Test {

  @Test
  public void allPlayerPoints() throws IOException {
    PointsCalculatorServiceV1 p = new PointsCalculatorServiceV1();
    System.out.println(p.allPlayerPoints().toString());
  }
}