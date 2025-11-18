
package org.unimag.controlador.Bus;

import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.unimag.vista.bus.VistaBusCrear;
import org.unimag.vista.bus.VistaBusListar;

public class BusVistasControlador {

    public static StackPane CrearBus(Stage esce, double anchito, double altito) {
        return new VistaBusCrear(esce, anchito, altito);
    }
   
    public static StackPane listarBus(Stage esce, double anchito, double altito) {
        return new VistaBusListar(esce, anchito, altito);
    }
  
}
