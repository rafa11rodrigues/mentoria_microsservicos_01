package microservice.interfacepedido.repository;

import microservice.interfacepedido.domain.entity.Cliente;

import java.util.ArrayList;
import java.util.List;

public class ClienteRepository {

    private static Long id = 0L;

    private List<Cliente> clientes = new ArrayList<Cliente>();

    private ClienteRepository instance;

    private ClienteRepository() {}

    public static ClienteRepository getInstance() {
        if(instance == null) {
            instance = new ClienteRepository();
        }
        return instance;
    }

    public List<Cliente> findAll() {
        return new ArrayList<Cliente>(clientes);
    }

    public Cliente findById(Long id) {
        for(Cliente c: clientes) {
            if(c.getId() == id) return c;
        }
        return null;
    }

    public Cliente save(Cliente cliente) {
        cliente.setId(++id);
        clientes.add(cliente);
        return cliente;
    }


    public Cliente findByCpf(String cpf) {
        for(Cliente c: clientes) {
            if(c.getCpf().equals(cpf)) return c;
        }
        return null;
    }
}
