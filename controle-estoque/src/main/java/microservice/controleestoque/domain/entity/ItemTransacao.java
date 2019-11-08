package microservice.controleestoque.domain.entity;

public class ItemTransacao {

    private Produto produto;

    private Long qtd;


    public ItemTransacao(Produto produto, Long qtd) {
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
