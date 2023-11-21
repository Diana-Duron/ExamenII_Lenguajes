package examen.lenguajes.examen.Servicios.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import examen.lenguajes.examen.Modelos.TipoCliente;
import examen.lenguajes.examen.Repositorios.TipoClienteRepositorio;
import examen.lenguajes.examen.Servicios.TipoClienteServicio;

@Service
public class TipoClienteServicioImpl implements TipoClienteServicio {

    @Autowired
    private TipoClienteRepositorio tipoClienteRepositorio;

    @Override
    public TipoCliente crearTipoCliente(TipoCliente tipoCliente) {

        return tipoClienteRepositorio.save(tipoCliente);
    }

}
