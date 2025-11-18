package org.unimag.controlador.Equipaje;

import java.util.List;
import org.unimag.dto.EquipajeDto;
import org.unimag.servicio.EquipajeServicio;

public class EquipajeControladorListar {
    public static List<EquipajeDto> obtenerEquipajes() {
        EquipajeServicio miDao = new EquipajeServicio();
        List<EquipajeDto> arreglo = miDao.selectFrom();

        return arreglo;
    }

    public static int obtenerCantidadEquipajes() {
        EquipajeServicio miDao = new EquipajeServicio();
        int cantidad = miDao.numRows();
        return cantidad;
    }
}
