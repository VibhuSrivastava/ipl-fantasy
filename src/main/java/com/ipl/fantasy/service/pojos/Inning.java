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
    "id",
    "isDeclared",
    "name",
    "shortName",
    "team",
    "batsmen",
    "bowlers",
    "wicket",
    "run",
    "over",
    "extra",
    "bye",
    "legBye",
    "wide",
    "noBall",
    "runRate",
    "requiredRunRate"
})
@Generated("jsonschema2pojo")
public class Inning {

  @JsonProperty("id")
  private Integer id;
  @JsonProperty("isDeclared")
  private Boolean isDeclared;
  @JsonProperty("name")
  private String name;
  @JsonProperty("shortName")
  private String shortName;
  @JsonProperty("team")
  private Team team;
  @JsonProperty("batsmen")
  private List<Batsman> batsmen = null;
  @JsonProperty("bowlers")
  private List<Bowler> bowlers = null;
  @JsonProperty("wicket")
  private String wicket;
  @JsonProperty("run")
  private String run;
  @JsonProperty("over")
  private String over;
  @JsonProperty("extra")
  private String extra;
  @JsonProperty("bye")
  private String bye;
  @JsonProperty("legBye")
  private String legBye;
  @JsonProperty("wide")
  private String wide;
  @JsonProperty("noBall")
  private String noBall;
  @JsonProperty("runRate")
  private String runRate;
  @JsonProperty("requiredRunRate")
  private String requiredRunRate;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @JsonProperty("id")
  public Integer getId() {
    return id;
  }

  @JsonProperty("id")
  public void setId(Integer id) {
    this.id = id;
  }

  @JsonProperty("isDeclared")
  public Boolean getIsDeclared() {
    return isDeclared;
  }

  @JsonProperty("isDeclared")
  public void setIsDeclared(Boolean isDeclared) {
    this.isDeclared = isDeclared;
  }

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  @JsonProperty("shortName")
  public String getShortName() {
    return shortName;
  }

  @JsonProperty("shortName")
  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  @JsonProperty("team")
  public Team getTeam() {
    return team;
  }

  @JsonProperty("team")
  public void setTeam(Team team) {
    this.team = team;
  }

  @JsonProperty("batsmen")
  public List<Batsman> getBatsmen() {
    return batsmen;
  }

  @JsonProperty("batsmen")
  public void setBatsmen(List<Batsman> batsmen) {
    this.batsmen = batsmen;
  }

  @JsonProperty("bowlers")
  public List<Bowler> getBowlers() {
    return bowlers;
  }

  @JsonProperty("bowlers")
  public void setBowlers(List<Bowler> bowlers) {
    this.bowlers = bowlers;
  }

  @JsonProperty("wicket")
  public String getWicket() {
    return wicket;
  }

  @JsonProperty("wicket")
  public void setWicket(String wicket) {
    this.wicket = wicket;
  }

  @JsonProperty("run")
  public String getRun() {
    return run;
  }

  @JsonProperty("run")
  public void setRun(String run) {
    this.run = run;
  }

  @JsonProperty("over")
  public String getOver() {
    return over;
  }

  @JsonProperty("over")
  public void setOver(String over) {
    this.over = over;
  }

  @JsonProperty("extra")
  public String getExtra() {
    return extra;
  }

  @JsonProperty("extra")
  public void setExtra(String extra) {
    this.extra = extra;
  }

  @JsonProperty("bye")
  public String getBye() {
    return bye;
  }

  @JsonProperty("bye")
  public void setBye(String bye) {
    this.bye = bye;
  }

  @JsonProperty("legBye")
  public String getLegBye() {
    return legBye;
  }

  @JsonProperty("legBye")
  public void setLegBye(String legBye) {
    this.legBye = legBye;
  }

  @JsonProperty("wide")
  public String getWide() {
    return wide;
  }

  @JsonProperty("wide")
  public void setWide(String wide) {
    this.wide = wide;
  }

  @JsonProperty("noBall")
  public String getNoBall() {
    return noBall;
  }

  @JsonProperty("noBall")
  public void setNoBall(String noBall) {
    this.noBall = noBall;
  }

  @JsonProperty("runRate")
  public String getRunRate() {
    return runRate;
  }

  @JsonProperty("runRate")
  public void setRunRate(String runRate) {
    this.runRate = runRate;
  }

  @JsonProperty("requiredRunRate")
  public String getRequiredRunRate() {
    return requiredRunRate;
  }

  @JsonProperty("requiredRunRate")
  public void setRequiredRunRate(String requiredRunRate) {
    this.requiredRunRate = requiredRunRate;
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