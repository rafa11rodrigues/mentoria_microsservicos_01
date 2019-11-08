package microservice.interfacepedido.repository;

import microservice.interfacepedido.domain.entity.Cliente;
import microservice.interfacepedido.domain.entity.Pedido;

import java.util.ArrayList;
import java.util.List;

public class PedidoRepository {

    private static Long id = 0L;

    private List<Pedido> pedidos = new ArrayList<Pedido>();


    private PedidoRepository instance;

    private PedidoRepository() {}

    public static PedidoRepository getInstance() {
        if(instance == null) {
            instance = new PedidoRepository();
        }
        return instance;
    }


    public List<Pedido> findAll() {
        return new ArrayList<Pedido>(pedidos);
    }

    public Pedido findById(Long id) {
        for(Pedido p: pedidos) {
            if (p.getId().equals(id)) return p;
        }
        return null;
    }

    public Pedido save(Pedido pedido) {
        pedido.setId(++id);
        pedidos.add(pedido);
        return pedido;
    }


    public List<Pedido> findByCliente(Cliente cliente) {
        List<Pedido> pedidosCliente = new ArrayList<Pedido>();

        for(Pedido p: pedidos) {
            if(p.getClass().equals(cliente))
                pedidosCliente.add(p);
        }
        return pedidosCliente;
    }
}
