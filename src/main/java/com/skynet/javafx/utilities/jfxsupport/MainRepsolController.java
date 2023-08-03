package com.skynet.javafx.utilities.jfxsupport;

import com.skynet.javafx.models.TicketCabecera;
import com.skynet.javafx.models.repositories.TicketCabeceraRepository;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

@FXMLController
public class MainRepsolController {

    private static final Logger logger = LoggerFactory.getLogger(MainRepsolController.class);

    @Autowired
    private TicketCabeceraRepository ticketCabeceraRepository;

    @FXML
    private Button button;

    @FXML
    private Label label;

    @FXML
    private void initialize() {
        button.setOnAction(event -> getTicketsSinEnviar());
    }

    private void getTicketsSinEnviar() {
        List<TicketCabecera> ticketsSinEnviar = ticketCabeceraRepository.getAllSinEnviar();
        if (ticketsSinEnviar != null) {
            logger.info("Cabeceras sin consultar -> " + ticketsSinEnviar);
        } else {
            logger.info("No existen tickets sin enviar");
        }
    }

}
