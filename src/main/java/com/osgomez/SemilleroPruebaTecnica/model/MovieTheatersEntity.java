package com.osgomez.SemilleroPruebaTecnica.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@JsonTypeName("movieTheaters")
@Document("movieTheaters")
public class MovieTheatersEntity {

  @BsonProperty("_id")
  private ObjectId id = null;

  public MovieTheatersEntity id(ObjectId id) {
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
  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MovieTheatersEntity movieTheaters = (MovieTheatersEntity) o;
    return Objects.equals(this.id, movieTheaters.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MovieTheatersEntity {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

