package examen.lenguajes.examen.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import examen.lenguajes.examen.Modelos.TipoCliente;

public interface TipoClienteRepositorio extends JpaRepository<TipoCliente, Integer> {

}
