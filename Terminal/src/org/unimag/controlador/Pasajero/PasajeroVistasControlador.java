
package org.unimag.controlador.Pasajero;

import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.unimag.vista.pasajero.VistaPasajeroCrear;
import org.unimag.vista.pasajero.VistaPasajeroListar;

public class PasajeroVistasControlador {

    public static StackPane CrearPasajero(Stage esce, double anchito, double altito) {
        return new VistaPasajeroCrear(esce, anchito, altito);
    }
    
    public static StackPane listarPasajero(Stage esce, double anchito, double altito) {
        return new VistaPasajeroListar(esce, anchito, altito);
    }

}
