package examen.lenguajes.examen.Servicios.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import examen.lenguajes.examen.Modelos.Clientes;
import examen.lenguajes.examen.Repositorios.ClientesRepositorio;
import examen.lenguajes.examen.Servicios.ClientesServicio;

@Service
public class ClientesServicioImpl implements ClientesServicio {

    @Autowired
    private ClientesRepositorio clienteRepositorio;

    @Override
    public Clientes crearCliente(Clientes cliente) {
        return clienteRepositorio.save(cliente);
    }

    @Override
    public List<Clientes> obtenerClientes() {
        return this.clienteRepositorio.findAll();
    }

    @Override
    public Clientes clienteId(int codigoCliente) {
        Clientes cliente = this.clienteRepositorio.findById(codigoCliente).get();
        return cliente;
    }

}
