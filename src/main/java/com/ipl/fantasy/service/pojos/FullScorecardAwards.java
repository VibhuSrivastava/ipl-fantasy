package com.ipl.fantasy.service.pojos;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "mostRunsAward",
    "mostWicketsAward",
    "manOfTheMatchId",
    "manOfTheMatchName",
    "manOfMatchBattingResults",
    "manOfMatchBowlngResults",
    "mostRunsAwardPlayerResults",
    "mostWicketsAwardPlayerResults"
})

public class FullScorecardAwards {

  @JsonProperty("mostRunsAward")
  private MostRunsAward mostRunsAward;
  @JsonProperty("mostWicketsAward")
  private MostWicketsAward mostWicketsAward;
  @JsonProperty("manOfTheMatchId")
  private Integer manOfTheMatchId;
  @JsonProperty("manOfTheMatchName")
  private String manOfTheMatchName;
  @JsonProperty("manOfMatchBattingResults")
  private List<ManOfMatchBattingResult> manOfMatchBattingResults = null;
  @JsonProperty("manOfMatchBowlngResults")
  private List<ManOfMatchBowlngResult> manOfMatchBowlngResults = null;
  @JsonProperty("mostRunsAwardPlayerResults")
  private List<MostRunsAwardPlayerResult> mostRunsAwardPlayerResults = null;
  @JsonProperty("mostWicketsAwardPlayerResults")
  private List<MostWicketsAwardPlayerResult> mostWicketsAwardPlayerResults = null;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @JsonProperty("mostRunsAward")
  public MostRunsAward getMostRunsAward() {
    return mostRunsAward;
  }

  @JsonProperty("mostRunsAward")
  public void setMostRunsAward(MostRunsAward mostRunsAward) {
    this.mostRunsAward = mostRunsAward;
  }

  @JsonProperty("mostWicketsAward")
  public MostWicketsAward getMostWicketsAward() {
    return mostWicketsAward;
  }

  @JsonProperty("mostWicketsAward")
  public void setMostWicketsAward(MostWicketsAward mostWicketsAward) {
    this.mostWicketsAward = mostWicketsAward;
  }

  @JsonProperty("manOfTheMatchId")
  public Integer getManOfTheMatchId() {
    return manOfTheMatchId;
  }

  @JsonProperty("manOfTheMatchId")
  public void setManOfTheMatchId(Integer manOfTheMatchId) {
    this.manOfTheMatchId = manOfTheMatchId;
  }

  @JsonProperty("manOfTheMatchName")
  public String getManOfTheMatchName() {
    return manOfTheMatchName;
  }

  @JsonProperty("manOfTheMatchName")
  public void setManOfTheMatchName(String manOfTheMatchName) {
    this.manOfTheMatchName = manOfTheMatchName;
  }

  @JsonProperty("manOfMatchBattingResults")
  public List<ManOfMatchBattingResult> getManOfMatchBattingResults() {
    return manOfMatchBattingResults;
  }

  @JsonProperty("manOfMatchBattingResults")
  public void setManOfMatchBattingResults(List<ManOfMatchBattingResult> manOfMatchBattingResults) {
    this.manOfMatchBattingResults = manOfMatchBattingResults;
  }

  @JsonProperty("manOfMatchBowlngResults")
  public List<ManOfMatchBowlngResult> getManOfMatchBowlngResults() {
    return manOfMatchBowlngResults;
  }

  @JsonProperty("manOfMatchBowlngResults")
  public void setManOfMatchBowlngResults(List<ManOfMatchBowlngResult> manOfMatchBowlngResults) {
    this.manOfMatchBowlngResults = manOfMatchBowlngResults;
  }

  @JsonProperty("mostRunsAwardPlayerResults")
  public List<MostRunsAwardPlayerResult> getMostRunsAwardPlayerResults() {
    return mostRunsAwardPlayerResults;
  }

  @JsonProperty("mostRunsAwardPlayerResults")
  public void setMostRunsAwardPlayerResults(List<MostRunsAwardPlayerResult> mostRunsAwardPlayerResults) {
    this.mostRunsAwardPlayerResults = mostRunsAwardPlayerResults;
  }

  @JsonProperty("mostWicketsAwardPlayerResults")
  public List<MostWicketsAwardPlayerResult> getMostWicketsAwardPlayerResults() {
    return mostWicketsAwardPlayerResults;
  }

  @JsonProperty("mostWicketsAwardPlayerResults")
  public void setMostWicketsAwardPlayerResults(List<MostWicketsAwardPlayerResult> mostWicketsAwardPlayerResults) {
    this.mostWicketsAwardPlayerResults = mostWicketsAwardPlayerResults;
  }

  @JsonAnyGetter
  public Map<String, Object> getAdditionalProperties() {
    return this.additionalProperties;
  }

  @JsonAnySetter
  public void setAdditionalProperty(String name, Object value) {
    this.additionalProperties.put(name, value);
  }

}