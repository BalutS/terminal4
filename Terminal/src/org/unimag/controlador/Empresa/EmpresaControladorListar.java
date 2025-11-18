package org.unimag.controlador.Empresa;

import java.util.List;
import org.unimag.dto.EmpresaDto;
import org.unimag.servicio.EmpresaServicio;

public class EmpresaControladorListar {
    
    public static List<EmpresaDto> obtenerEmpresas() {
        EmpresaServicio miDao = new EmpresaServicio();
        List<EmpresaDto> arreglo = miDao.selectFrom();

        return arreglo;
    }

    public static int obtenerCantidadEmpresas() {
        EmpresaServicio miDao = new EmpresaServicio();
        int cantidad = miDao.numRows();
        return cantidad;
    }
    
}
