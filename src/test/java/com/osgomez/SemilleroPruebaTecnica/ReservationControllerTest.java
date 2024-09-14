package com.osgomez.SemilleroPruebaTecnica;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.osgomez.SemilleroPruebaTecnica.controller.ReservationsController;
import com.osgomez.SemilleroPruebaTecnica.model.ReservationsEntity;
import com.osgomez.SemilleroPruebaTecnica.service.ReservationsService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.web.servlet.MockMvc;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.delete;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@ActiveProfiles("test")
@WebMvcTest(ReservationsController.class)
public class ReservationControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ReservationsService reservationService;

    @Test
    void testCreateReservation() throws Exception {
        ReservationsEntity reservation = new ReservationsEntity();
        reservation.setClientId("001");
        reservation.setSeatsReserved(4);

        when(reservationService.saveReservation(any(ReservationsEntity.class))).thenReturn(reservation);

        mockMvc.perform(post("/reservations")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(new ObjectMapper().writeValueAsString(reservation)))
                .andExpect(status().isOk());

        //Ahora quiero probar el que tenga el clientId = "001" y el seatsReserved = 4
        verify(reservationService, times(1)).saveReservation(argThat(
                arg -> arg.getClientId().equals("001") && arg.getSeatsReserved() == 4));
    }

    //Un test para borrar reservaciones
    @Test
    void testDeleteReservation() throws Exception {
        ReservationsEntity reservation = new ReservationsEntity();
        reservation.setClientId("001");
        reservation.setSeatsReserved(4);

        when(reservationService.saveReservation(any(ReservationsEntity.class))).thenReturn(reservation);

        mockMvc.perform(post("/reservations")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(new ObjectMapper().writeValueAsString(reservation)))
                .andExpect(status().isOk());

        mockMvc.perform(delete("/reservations/001"))
                .andExpect(status().isOk());
    }
}
