package com.osgomez.SemilleroPruebaTecnica.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import java.time.LocalDateTime;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;


@JsonTypeName("screeningTimes")
@Document("screeningTimes")
public class ScreeningTimesEntity {

  @BsonProperty("_id")
  private ObjectId id = null;

  @BsonProperty("date")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private LocalDateTime date;

  @BsonProperty("startTime")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private LocalDateTime startTime;

  public ScreeningTimesEntity id(ObjectId id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   */
  
  @JsonProperty("_id")
  public ObjectId getId() {
    return id;
  }

  public void setId(ObjectId id) {
    this.id = id;
  }

  public ScreeningTimesEntity date(LocalDateTime date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
   */
  
  @JsonProperty("date")
  public LocalDateTime getDate() {
    return date;
  }

  public void setDate(LocalDateTime date) {
    this.date = date;
  }

  public ScreeningTimesEntity startTime(LocalDateTime startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Get startTime
   * @return startTime
   */
  
  @JsonProperty("startTime")
  public LocalDateTime getStartTime() {
    return startTime;
  }

  public void setStartTime(LocalDateTime startTime) {
    this.startTime = startTime;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ScreeningTimesEntity screeningTimes = (ScreeningTimesEntity) o;
    return Objects.equals(this.id, screeningTimes.id) &&
        Objects.equals(this.date, screeningTimes.date) &&
        Objects.equals(this.startTime, screeningTimes.startTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, date, startTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ScreeningTimesEntity {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

