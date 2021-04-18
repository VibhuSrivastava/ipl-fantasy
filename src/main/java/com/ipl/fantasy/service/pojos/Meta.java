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
    "matchTypeId",
    "series"
})
@Generated("jsonschema2pojo")
public class Meta {

  @JsonProperty("matchTypeId")
  private Integer matchTypeId;
  @JsonProperty("series")
  private Series series;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @JsonProperty("matchTypeId")
  public Integer getMatchTypeId() {
    return matchTypeId;
  }

  @JsonProperty("matchTypeId")
  public void setMatchTypeId(Integer matchTypeId) {
    this.matchTypeId = matchTypeId;
  }

  @JsonProperty("series")
  public Series getSeries() {
    return series;
  }

  @JsonProperty("series")
  public void setSeries(Series series) {
    this.series = series;
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