package co.clienteApiRest.ClienteApiRest.service;

import co.clienteApiRest.ClienteApiRest.entity.Cliente;
import co.clienteApiRest.ClienteApiRest.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Service
public class ClienteServicio {

    @Autowired
     private ClienteRepository clienteRepository;

    public void crearCliente(Cliente cliente){
        clienteRepository.save(cliente);
    }

    public Cliente obtenerPorId(Long id){
       return clienteRepository.findById(id).get();
    }

    public Integer calcularAnios(Date fechaNacimiento){

        Integer fechaActual = new Date().getYear();

        Integer anios = fechaActual - fechaNacimiento.getYear();

        return anios;
    }

    public List<Cliente> obtenerTodos(){
        return clienteRepository.findAll();
    }

}
