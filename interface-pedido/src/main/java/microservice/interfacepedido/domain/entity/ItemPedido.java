package microservice.interfacepedido.domain.entity;

public class ItemPedido {

    private Produto produto;

    private Long qtd;

    public ItemPedido(Produto produto, Long qtd) {
        this.produto = produto;
        this.qtd = qtd;
    }

    public Produto getProduto() {
        return produto;
    }

    public Long getQtd() {
        return qtd;
    }
}
