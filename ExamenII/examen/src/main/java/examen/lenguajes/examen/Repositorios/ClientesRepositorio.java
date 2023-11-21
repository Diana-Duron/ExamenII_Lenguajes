package examen.lenguajes.examen.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import examen.lenguajes.examen.Modelos.Clientes;

public interface ClientesRepositorio extends JpaRepository<Clientes, Integer> {

}
