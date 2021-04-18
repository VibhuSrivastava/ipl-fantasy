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
    "runsConceded",
    "wickets",
    "overs",
    "economy"
})

public class MostWicketsAward {

  @JsonProperty("id")
  private Integer id;
  @JsonProperty("name")
  private String name;
  @JsonProperty("runsConceded")
  private String runsConceded;
  @JsonProperty("wickets")
  private String wickets;
  @JsonProperty("overs")
  private String overs;
  @JsonProperty("economy")
  private String economy;
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

  @JsonProperty("runsConceded")
  public String getRunsConceded() {
    return runsConceded;
  }

  @JsonProperty("runsConceded")
  public void setRunsConceded(String runsConceded) {
    this.runsConceded = runsConceded;
  }

  @JsonProperty("wickets")
  public String getWickets() {
    return wickets;
  }

  @JsonProperty("wickets")
  public void setWickets(String wickets) {
    this.wickets = wickets;
  }

  @JsonProperty("overs")
  public String getOvers() {
    return overs;
  }

  @JsonProperty("overs")
  public void setOvers(String overs) {
    this.overs = overs;
  }

  @JsonProperty("economy")
  public String getEconomy() {
    return economy;
  }

  @JsonProperty("economy")
  public void setEconomy(String economy) {
    this.economy = economy;
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