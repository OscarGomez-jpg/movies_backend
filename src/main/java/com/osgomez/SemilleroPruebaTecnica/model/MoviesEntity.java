package com.osgomez.SemilleroPruebaTecnica.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;

import java.time.LocalDateTime;

import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.format.annotation.DateTimeFormat;

@JsonTypeName("movies")
@Document("movies")
public class MoviesEntity {

    @BsonProperty("_id")
    private ObjectId id = null;

    @BsonProperty("title")
    private String title;

    @BsonProperty("director")
    private String director;

    @BsonProperty("duration")
    private int duration;

    @BsonProperty("releaseDate")
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    private LocalDateTime releaseDate;

    public MoviesEntity id(ObjectId id) {
        this.id = id;
        return this;
    }

    @JsonProperty("_id")
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public MoviesEntity title(String title) {
        this.title = title;
        return this;
    }

    @JsonProperty("title")
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public MoviesEntity director(String director) {
        this.director = director;
        return this;
    }

    @JsonProperty("director")
    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public MoviesEntity duration(int duration) {
        this.duration = duration;
        return this;
    }

    @JsonProperty("duration")
    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public MoviesEntity releaseDate(LocalDateTime releaseDate) {
        this.releaseDate = releaseDate;
        return this;
    }

    @JsonProperty("releaseDate")
    public LocalDateTime getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(LocalDateTime releaseDate) {
        this.releaseDate = releaseDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        MoviesEntity movies = (MoviesEntity) o;
        return Objects.equals(this.id, movies.id) &&
                Objects.equals(this.title, movies.title) &&
                Objects.equals(this.director, movies.director) &&
                Objects.equals(this.duration, movies.duration) &&
                Objects.equals(this.releaseDate, movies.releaseDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title, director, duration, releaseDate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class MoviesEntity {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    title: ").append(toIndentedString(title)).append("\n");
        sb.append("    director: ").append(toIndentedString(director)).append("\n");
        sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
        sb.append("    releaseDate: ").append(toIndentedString(releaseDate)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

