package co.clienteApiRest.ClienteApiRest.controller;

import co.clienteApiRest.ClienteApiRest.entity.Cliente;
import co.clienteApiRest.ClienteApiRest.respone.ClienteResponse;
import co.clienteApiRest.ClienteApiRest.service.ClienteServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/")
public class clienteController {

    @Autowired
    private ClienteServicio clienteServicio;

    @GetMapping("/clientes")
    public ResponseEntity<List<Cliente>> obtenerClientes(){
        List<Cliente> clientes = clienteServicio.obtenerTodos();

        return ResponseEntity.ok(clientes);
    }

    @GetMapping("/clientes/{id}")
    public ResponseEntity<ClienteResponse> obtenerCliente(@PathVariable Long id) {
        // Consultar el cliente por su ID
        Cliente cliente = clienteServicio.obtenerPorId(id);

        if (cliente == null) {
            return ResponseEntity.notFound().build();
        }

        // Calcular la edad
        int edad = clienteServicio.calcularAnios(cliente.getFechaNacimiento());

        // Crear una respuesta JSON
        ClienteResponse response = new ClienteResponse(
                cliente.getNombre(),
                cliente.getApellido(),
                edad
        );

        return ResponseEntity.ok(response);
    }

    @PostMapping("/clientes")
    public ResponseEntity<Cliente> crearCliente(@RequestBody Cliente cliente){
        clienteServicio.crearCliente(cliente);
        return ResponseEntity.ok(cliente);
    }
}
