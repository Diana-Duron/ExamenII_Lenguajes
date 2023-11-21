package examen.lenguajes.examen.Controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import examen.lenguajes.examen.Modelos.Clientes;
import examen.lenguajes.examen.Servicios.Impl.ClientesServicioImpl;

@RestController
@RequestMapping("/api/clientes")
public class ClientesControlador {
    @Autowired
    ClientesServicioImpl clienteServicioImpl;

    @GetMapping("/buscar")
    public Clientes obtenerCliente(@RequestParam(name = "codigo") int codigoCliente) {
        return clienteServicioImpl.clienteId(codigoCliente);
    }

    @GetMapping("/todos")
    public List<Clientes> obtenerClientes() {
        return this.clienteServicioImpl.obtenerClientes();
    }

}
