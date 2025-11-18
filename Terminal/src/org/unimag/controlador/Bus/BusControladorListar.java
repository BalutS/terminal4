package org.unimag.controlador.Bus;

import java.util.List;
import org.unimag.dto.BusDto;
import org.unimag.servicio.BusServicio;

public class BusControladorListar {
    public static List<BusDto> obtenerBuses() {
        BusServicio miDao = new BusServicio();
        List<BusDto> arreglo = miDao.selectFrom();

        return arreglo;
    }

    public static int obtenerCantidadBuses() {
        BusServicio miDao = new BusServicio();
        int cantidad = miDao.numRows();
        return cantidad;
    }
}
