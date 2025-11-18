package org.unimag.controlador.Empresa;

import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.unimag.vista.empresa.VistaEmpresaCrear;

public class EmpresaVistasControlador {

    public static StackPane CrearEmpresa(Stage esce, double anchito, double altito) {
        return new VistaEmpresaCrear(esce, anchito, altito);
    }
    
}
