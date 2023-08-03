package com.skynet.javafx.models.repositories;

import com.skynet.javafx.models.TicketCabecera;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface TicketCabeceraRepository extends JpaRepository<TicketCabecera, Long> {

    @Query(value = "select t from TicketCabecera t where sg = false")
    List<TicketCabecera> getAllSinEnviar();
}
