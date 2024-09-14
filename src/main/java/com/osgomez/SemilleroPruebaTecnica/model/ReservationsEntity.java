package com.osgomez.SemilleroPruebaTecnica.model;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.bson.codecs.pojo.annotations.BsonProperty;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.core.mapping.Document;

@JsonTypeName("reservations")
@Document("reservations")
public class ReservationsEntity {

    @BsonProperty("_id")
    private ObjectId id = null;
    private String clientId;
    private int seatsReserved;

    public ReservationsEntity id(ObjectId id) {
        this.id = id;
        return this;
    }

    public ReservationsEntity clientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    public ReservationsEntity seatsReserved(int seatsReserved) {
        this.seatsReserved = seatsReserved;
        return this;
    }

    @JsonProperty("_id")
    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    @JsonProperty("client_id")
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    @JsonProperty("seats_reserved")
    public int getSeatsReserved() {
        return seatsReserved;
    }

    public void setSeatsReserved(int seatsReserved) {
        this.seatsReserved = seatsReserved;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ReservationsEntity reservations = (ReservationsEntity) o;
        return Objects.equals(this.id, reservations.id) &&
                Objects.equals(this.clientId, reservations.clientId) &&
                this.seatsReserved == reservations.seatsReserved;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, clientId, seatsReserved);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReservationsEntity {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
        sb.append("    seatsReserved: ").append(toIndentedString(seatsReserved)).append("\n");
        return sb.toString();
    }

    private String toIndentedString(Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}

