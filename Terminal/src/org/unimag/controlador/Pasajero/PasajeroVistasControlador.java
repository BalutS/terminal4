package org.unimag.controlador.Pasajero;

import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.unimag.vista.pasajero.VistaPasajeroCrear;

public class PasajeroVistasControlador {

    public static StackPane CrearPasajero(Stage esce, double anchito, double altito) {
        return new VistaPasajeroCrear(esce, anchito, altito);
    }
    
}
