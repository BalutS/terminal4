package org.unimag.controlador.Ruta;

import java.util.List;
import org.unimag.dto.RutaDto;
import org.unimag.servicio.RutaServicio;

public class RutaControladorListar {
    public static List<RutaDto> obtenerRutas() {
        RutaServicio miDao = new RutaServicio();
        List<RutaDto> arreglo = miDao.selectFrom();

        return arreglo;
    }

    public static int obtenerCantidadRutas() {
        RutaServicio miDao = new RutaServicio();
        int cantidad = miDao.numRows();
        return cantidad;
    }
}
