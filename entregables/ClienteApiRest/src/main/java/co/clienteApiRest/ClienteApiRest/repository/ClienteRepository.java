package co.clienteApiRest.ClienteApiRest.repository;

import co.clienteApiRest.ClienteApiRest.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends JpaRepository<Cliente,Long> {
}
