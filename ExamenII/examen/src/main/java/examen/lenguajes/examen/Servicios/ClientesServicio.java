package examen.lenguajes.examen.Servicios;

import java.util.List;

import examen.lenguajes.examen.Modelos.Clientes;

public interface ClientesServicio {

    public Clientes crearCliente(Clientes cliente);

    public List<Clientes> obtenerClientes();

    public Clientes clienteId(int codigoCliente);

}
