package com.anm.estoque.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.anm.estoque.modelo.ProdutoModelo;
import com.anm.estoque.repositorio.ProdutoRepositorio;

@Service
public class EstoqueServico {

    @Autowired
    private ProdutoRepositorio pr;

    public Iterable<ProdutoModelo> listar() {
        return pr.findAll();
    }

    public ProdutoModelo buscarPorId(Long id) {
        return pr.findById(id).orElse(null);
    }

    public ProdutoModelo modificar(Long id, ProdutoModelo dados) {
        return pr.findById(id).map(produto -> {
            produto.setNome(dados.getNome());
            produto.setPreco(dados.getPreco());
            produto.setModelo(dados.getModelo());
            produto.setDescricao(dados.getDescricao());
            return pr.save(produto);
        }).orElse(null);
    }

    public ProdutoModelo atualizar(Long id, ProdutoModelo dados) {
        return pr.findById(id).map(produto -> {
            produto.setNome(dados.getNome());
            produto.setPreco(dados.getPreco());
            produto.setModelo(dados.getModelo());
            produto.setDescricao(dados.getDescricao());
            return pr.save(produto);
        }).orElse(null);
    }

    public boolean deletar(Long id) {
        if (pr.existsById(id)) {
            pr.deleteById(id);
            return true;
        }
        return false;
    }

    public ProdutoModelo consultar(Long id) {
        return pr.findById(id).orElse(null);
    }

    public ProdutoModelo cadastrar(ProdutoModelo p) {
        return pr.save(p);
    }

}
