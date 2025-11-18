
package org.unimag.controlador.Equipaje;

import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.unimag.vista.equipaje.VistaEquipajeCrear;
import org.unimag.vista.equipaje.VistaEquipajeListar;

public class EquipajeVistasControlador {

    public static StackPane crearEquipaje(Stage esce, double anchito, double altito) {
        return new VistaEquipajeCrear(esce, anchito, altito);
    }
    
    public static StackPane listarEquipaje(Stage esce, double anchito, double altito) {
        return new VistaEquipajeListar(esce, anchito, altito);
    }

}
