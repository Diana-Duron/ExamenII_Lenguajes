package examen.lenguajes.examen.Controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import examen.lenguajes.examen.Modelos.TipoCliente;
import examen.lenguajes.examen.Servicios.Impl.TipoClienteServicioImpl;

@RestController
@RequestMapping("/api/tipocliente")
public class TipoClienteControlador {

    @Autowired
    private TipoClienteServicioImpl tipoClienteServicioImpl;

    @PostMapping("/crear")
    public TipoCliente crearTipoCliente(@RequestBody TipoCliente tipoCliente) {
        return this.tipoClienteServicioImpl.crearTipoCliente(tipoCliente);
    }

}
