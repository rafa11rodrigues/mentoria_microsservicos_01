package microservice.controleestoque.repository;

import microservice.controleestoque.domain.entity.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProdutoRepository {

    private static Long id = 0L;

    private List<Produto> produtos = new ArrayList<Produto>();


    private static ProdutoRepository instance;

    private ProdutoRepository() {}

    public static ProdutoRepository getInstance() {
        if(instance == null) {
            instance = new ProdutoRepository();
        }
        return instance;
    }


    public List<Produto> findAll() {
        return new ArrayList<Produto>(produtos);
    }

    public Produto findById(Long id) {
        for(Produto p: produtos) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    public Produto save(Produto produto) {
        produto.setId(++id);
        produtos.add(produto);
        return produto;
    }


    public Produto findByNome(String nome) {
        for(Produto p: produtos) {
            if(p.getNome().equals(nome)) return p;
        }
        return null;
    }
}
