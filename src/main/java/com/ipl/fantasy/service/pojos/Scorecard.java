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
    "meta",
    "fullScorecard",
    "fullScorecardAwards",
    "status",
    "poweredBy"
})
@Generated("jsonschema2pojo")
public class Scorecard {

  @JsonProperty("meta")
  private Meta meta;
  @JsonProperty("fullScorecard")
  private FullScorecard fullScorecard;
  @JsonProperty("fullScorecardAwards")
  private FullScorecardAwards fullScorecardAwards;
  @JsonProperty("status")
  private Integer status;
  @JsonProperty("poweredBy")
  private String poweredBy;
  @JsonIgnore
  private Map<String, Object> additionalProperties = new HashMap<String, Object>();

  @JsonProperty("meta")
  public Meta getMeta() {
    return meta;
  }

  @JsonProperty("meta")
  public void setMeta(Meta meta) {
    this.meta = meta;
  }

  @JsonProperty("fullScorecard")
  public FullScorecard getFullScorecard() {
    return fullScorecard;
  }

  @JsonProperty("fullScorecard")
  public void setFullScorecard(FullScorecard fullScorecard) {
    this.fullScorecard = fullScorecard;
  }

  @JsonProperty("fullScorecardAwards")
  public FullScorecardAwards getFullScorecardAwards() {
    return fullScorecardAwards;
  }

  @JsonProperty("fullScorecardAwards")
  public void setFullScorecardAwards(FullScorecardAwards fullScorecardAwards) {
    this.fullScorecardAwards = fullScorecardAwards;
  }

  @JsonProperty("status")
  public Integer getStatus() {
    return status;
  }

  @JsonProperty("status")
  public void setStatus(Integer status) {
    this.status = status;
  }

  @JsonProperty("poweredBy")
  public String getPoweredBy() {
    return poweredBy;
  }

  @JsonProperty("poweredBy")
  public void setPoweredBy(String poweredBy) {
    this.poweredBy = poweredBy;
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