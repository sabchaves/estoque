package com.anm.estoque.servico;

import com.anm.estoque.modelo.ProdutoModelo;
import com.anm.estoque.repositorio.ProdutoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EstoqueServico {

    @Autowired
    private ProdutoRepositorio pr;

    public Iterable<ProdutoModelo> listar(){
        return pr.findAll();
    }

}