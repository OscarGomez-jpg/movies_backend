package com.osgomez.SemilleroPruebaTecnica.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@JsonTypeName("seats")
@Document("seats")
public class SeatsEntity {

  @BsonProperty("_id")
  private ObjectId id = null;

  @BsonProperty("row")
  private String row;

  @BsonProperty("column")
  private String column;

  @BsonProperty("state")
  private String state;

  public SeatsEntity id(ObjectId id) {
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

  public SeatsEntity row(String row) {
    this.row = row;
    return this;
  }

  /**
   * Get row
   * @return row
   */
  
  @JsonProperty("row")
  public String getRow() {
    return row;
  }

  public void setRow(String row) {
    this.row = row;
  }

  public SeatsEntity column(String column) {
    this.column = column;
    return this;
  }

  /**
   * Get column
   * @return column
   */
  
  @JsonProperty("column")
  public String getColumn() {
    return column;
  }

  public void setColumn(String column) {
    this.column = column;
  }

  public SeatsEntity state(String state) {
    this.state = state;
    return this;
  }

  /**
   * Get state
   * @return state
   */
  
  @JsonProperty("state")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SeatsEntity seats = (SeatsEntity) o;
    return Objects.equals(this.id, seats.id) &&
        Objects.equals(this.row, seats.row) &&
        Objects.equals(this.column, seats.column) &&
        Objects.equals(this.state, seats.state);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, row, column, state);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SeatsEntity {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    row: ").append(toIndentedString(row)).append("\n");
    sb.append("    column: ").append(toIndentedString(column)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
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

