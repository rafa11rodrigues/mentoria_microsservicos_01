package microservice.interfacepedido.domain.entity;

import java.util.ArrayList;
import java.util.List;

public class Pedido extends Entity {

    private List<ItemPedido> itens = new ArrayList<ItemPedido>();

    private Double total = 0.0;


    public List<ItemPedido> getItens() {
        return itens;
    }

    public Double getTotal() {
        return total;
    }

    public void addItem(ItemPedido itemPedido) {
        itens.add(itemPedido);
        total += itemPedido.getProduto().getValor() * itemPedido.getQtd();
    }
}
