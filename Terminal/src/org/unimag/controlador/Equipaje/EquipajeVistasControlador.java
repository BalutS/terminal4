package org.unimag.controlador.Equipaje;

import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.unimag.vista.equipaje.VistaEquipajeCrear;

public class EquipajeVistasControlador {

    public static StackPane crearEquipaje(Stage esce, double anchito, double altito) {
        return new VistaEquipajeCrear(esce, anchito, altito);
    }
    
}
