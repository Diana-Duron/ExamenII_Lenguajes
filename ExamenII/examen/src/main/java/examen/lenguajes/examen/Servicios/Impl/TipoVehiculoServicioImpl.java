package examen.lenguajes.examen.Servicios.Impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import examen.lenguajes.examen.Modelos.TipoVehiculo;
import examen.lenguajes.examen.Repositorios.TipoVehiculoRepositorio;
import examen.lenguajes.examen.Servicios.TipoVehiculoServicio;

@Service
public class TipoVehiculoServicioImpl implements TipoVehiculoServicio {

    @Autowired
    private TipoVehiculoRepositorio tipoVehiculoRepositorio;

    @Override
    public TipoVehiculo crearTipoVehiculo(TipoVehiculo tipoVehiculo) {
        return tipoVehiculoRepositorio.save(tipoVehiculo);
    }

}
