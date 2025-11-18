package org.unimag.controlador.Tiquete;

import java.util.List;
import org.unimag.dto.TiqueteDto;
import org.unimag.servicio.TiqueteServicio;

public class TiqueteControladorListar {
    public static List<TiqueteDto> obtenerTiquetes() {
        TiqueteServicio miDao = new TiqueteServicio();
        List<TiqueteDto> arreglo = miDao.selectFrom();

        return arreglo;
    }

    public static int obtenerCantidadTiquetes() {
        TiqueteServicio miDao = new TiqueteServicio();
        int cantidad = miDao.numRows();
        return cantidad;
    }
}
