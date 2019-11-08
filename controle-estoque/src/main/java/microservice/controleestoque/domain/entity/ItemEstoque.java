package microservice.controleestoque.domain.entity;

public class ItemEstoque extends Entity {

    private Produto produto;

    private Long qtd;


    public ItemEstoque(Produto produto, Long qtd) {
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
