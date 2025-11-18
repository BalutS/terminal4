
package org.unimag.controlador.Viaje;

import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.unimag.vista.viaje.VistaViajeCrear;
import org.unimag.vista.viaje.VistaViajeListar;

public class ViajeVistasControlador {
    
    public static StackPane crearViaje(Stage esce, double anchito, double altito) {
        return new VistaViajeCrear(esce, anchito, altito);
    }
    
    public static StackPane listarViaje(Stage esce, double anchito, double altito) {
        return new VistaViajeListar(esce, anchito, altito);
    }

}
