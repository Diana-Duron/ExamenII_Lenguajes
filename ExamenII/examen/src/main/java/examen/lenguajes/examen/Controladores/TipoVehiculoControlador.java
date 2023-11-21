package examen.lenguajes.examen.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import examen.lenguajes.examen.Modelos.TipoVehiculo;
import examen.lenguajes.examen.Servicios.Impl.TipoVehiculoServicioImpl;

@RestController
@RequestMapping("/api/tipovehiculo")
public class TipoVehiculoControlador {

    @Autowired
    private TipoVehiculoServicioImpl tipoVehiculoServicioImpl;

    @PostMapping("/crear")
    public TipoVehiculo crearVehiculo(@RequestBody TipoVehiculo vehiculo) {
        return this.tipoVehiculoServicioImpl.crearTipoVehiculo(vehiculo);
    }
}
