package org.unimag.controlador.Conductor;

import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.unimag.vista.conductor.VistaConductorCrear;

public class ConductorVistasControlador {
    
    public static StackPane CrearConductor(Stage esce, double anchito, double altito) {
        return new VistaConductorCrear(esce, anchito, altito);
    }
    
}
