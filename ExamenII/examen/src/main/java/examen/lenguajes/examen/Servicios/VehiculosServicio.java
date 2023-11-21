package examen.lenguajes.examen.Servicios;

import java.util.List;

import examen.lenguajes.examen.Modelos.Vehiculos;

public interface VehiculosServicio {

    public Vehiculos crearVehiculo(Vehiculos vehiculo);

    public List<Vehiculos> obtenerVehiculos();

    public Vehiculos vehiculoId(int idVehiculo);
}
