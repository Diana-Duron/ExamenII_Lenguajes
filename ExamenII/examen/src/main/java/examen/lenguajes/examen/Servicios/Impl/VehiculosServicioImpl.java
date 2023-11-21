package examen.lenguajes.examen.Servicios.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import examen.lenguajes.examen.Modelos.Vehiculos;
import examen.lenguajes.examen.Repositorios.VehiculosRepositorio;
import examen.lenguajes.examen.Servicios.VehiculosServicio;

@Service
public class VehiculosServicioImpl implements VehiculosServicio {

    @Autowired
    private VehiculosRepositorio vehiculosRepositorio;

    @Override
    public Vehiculos crearVehiculo(Vehiculos vehiculo) {
        return vehiculosRepositorio.save(vehiculo);
    }

    @Override
    public List<Vehiculos> obtenerVehiculos() {
        return this.vehiculosRepositorio.findAll();
    }

    @Override
    public Vehiculos vehiculoId(int idVehiculo) {
        Vehiculos vehiculo = this.vehiculosRepositorio.findById(idVehiculo).get();
        return vehiculo;
    }

}
