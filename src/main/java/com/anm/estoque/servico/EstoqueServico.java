package com.anm.estoque.servico;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anm.estoque.modelo.ProdutoModelo;
import com.anm.estoque.repositorio.ProdutoRepositorio;

@Service
public class EstoqueServico {

    @Autowired
    private ProdutoRepositorio pr;

    public Iterable<ProdutoModelo> listar(){
        return pr.findAll();
    }

   public ProdutoModelo buscarPorId(Long id) {
        return pr.findById(id).orElse(null);
    }




}

