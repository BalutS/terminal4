
package org.unimag.controlador.Tiquete;

import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.unimag.vista.tiquete.VistaTiqueteCrear;
import org.unimag.vista.tiquete.VistaTiqueteListar;

public class TiqueteVistasControlador {
    
    public static StackPane crearTiquete(Stage esce, double anchito, double altito) {
        return new VistaTiqueteCrear(esce, anchito, altito);
    }
    
    public static StackPane listarTiquete(Stage esce, double anchito, double altito) {
        return new VistaTiqueteListar(esce, anchito, altito);
    }

}
