package edu.escuelaing.arsw.projecDesign.controllers;

import edu.escuelaing.arsw.projecDesign.entities.Inventario;
import edu.escuelaing.arsw.projecDesign.service.InventarioService;
import edu.escuelaing.arsw.projecDesign.service.OrdenDeCompraService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.handler.annotation.DestinationVariable;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Controller;


@Controller
public class STOMPMessagesHandler {

    @Autowired
    SimpMessagingTemplate msgt;
    @Autowired
    private InventarioService inventarios;

    @MessageMapping("/getInventarios")
    public void handleBuyEvent(Inventario inventario) throws Exception {
        System.out.println("Llegue al real time");
        msgt.convertAndSend("/getInventarios",inventario);
    }
}