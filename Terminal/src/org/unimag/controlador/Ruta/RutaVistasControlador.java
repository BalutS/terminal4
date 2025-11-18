package org.unimag.controlador.Ruta;

import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import org.unimag.vista.ruta.VistaRutaCrear;

public class RutaVistasControlador {

    public static StackPane CrearRuta(Stage esce, double anchito, double altito) {
        return new VistaRutaCrear(esce, anchito, altito);
    }
    
}
