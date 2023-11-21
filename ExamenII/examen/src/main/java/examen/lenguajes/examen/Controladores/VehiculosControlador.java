package examen.lenguajes.examen.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import examen.lenguajes.examen.Modelos.Vehiculos;
import examen.lenguajes.examen.Servicios.Impl.VehiculosServicioImpl;

@RestController
@RequestMapping("/api/vehiculos")
public class VehiculosControlador {

    @Autowired
    private VehiculosServicioImpl vehiculoServicioImpl;

    @GetMapping("/api/vehiculos")
    public Vehiculos obtenerVehiculo(@RequestParam int idVehiculo) {
        return this.vehiculoServicioImpl.vehiculoId(idVehiculo);
    }

    @GetMapping("/api/todos")
    public List<Vehiculos> obtenerVehiculos() {
        return this.vehiculoServicioImpl.obtenerVehiculos();
    }
}
