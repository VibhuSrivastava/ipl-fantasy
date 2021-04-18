package com.ipl.fantasy.service.pojos;

import java.util.HashMap;
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
    "name",
    "runs",
    "balls",
    "strikeRate",
    "fowOrder"
})
@Generated("jsonschema2pojo")
public class MostRunsAward {

  @JsonProperty("id")
  private Integer id;
  @JsonProperty("name")
  private String name;
  @JsonProperty("runs")
  private String runs;
  @JsonProperty("balls")
  private String balls;
  @JsonProperty("strikeRate")
  private String strikeRate;
  @JsonProperty("fowOrder")
  private Integer fowOrder;
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

  @JsonProperty("name")
  public String getName() {
    return name;
  }

  @JsonProperty("name")
  public void setName(String name) {
    this.name = name;
  }

  @JsonProperty("runs")
  public String getRuns() {
    return runs;
  }

  @JsonProperty("runs")
  public void setRuns(String runs) {
    this.runs = runs;
  }

  @JsonProperty("balls")
  public String getBalls() {
    return balls;
  }

  @JsonProperty("balls")
  public void setBalls(String balls) {
    this.balls = balls;
  }

  @JsonProperty("strikeRate")
  public String getStrikeRate() {
    return strikeRate;
  }

  @JsonProperty("strikeRate")
  public void setStrikeRate(String strikeRate) {
    this.strikeRate = strikeRate;
  }

  @JsonProperty("fowOrder")
  public Integer getFowOrder() {
    return fowOrder;
  }

  @JsonProperty("fowOrder")
  public void setFowOrder(Integer fowOrder) {
    this.fowOrder = fowOrder;
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