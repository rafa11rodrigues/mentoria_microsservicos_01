package microservice.controleestoque.domain.entity;

import java.util.ArrayList;
import java.util.List;

public class Estoque {

    private List<ItemEstoque> itens = new ArrayList<>();


    private Estoque instance;

    private Estoque() {}

    private Estoque getInstance() {
        if(instance == null) {
            instance = new Estoque();
        }
        return instance;
    }

    public List<ItemEstoque> getItens() {
        return itens;
    }

    public Long qtdEmEstoque(Produto produto) {
        for(ItemEstoque ie: itens) {
            if(ie.getProduto().equals(produto)) return ie.getQtd();
        }
        return 0L;
    }
}
