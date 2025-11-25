package com.anm.estoque.controller;

import com.anm.estoque.modelo.ProdutoModelo;
import com.anm.estoque.servico.EstoqueServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@CrossOrigin("*")
public class EstoqueController {

    @Autowired
    private EstoqueServico es;

    @GetMapping("/")
    public void testeApi() {
        System.out.println("A API está funcionando!");
    }

    @GetMapping("/listar")
    public Iterable<ProdutoModelo> listar() {
        return es.listar();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ProdutoModelo> buscarPorId(@PathVariable Long id) {
        ProdutoModelo produto = es.buscarPorId(id);
        return ResponseEntity.ok(produto);
    }
    @PostMapping("/cadastrar")
    public ResponseEntity<ProdutoModelo> cadastrar(@RequestBody ProdutoModelo p) {
        ProdutoModelo novo = es.cadastrar(p);
        return ResponseEntity.status(201).body(novo);
    }

    @PutMapping("/modificar/{id}")
    public ResponseEntity<ProdutoModelo> modificar(@PathVariable Long id, @RequestBody ProdutoModelo p) {
        ProdutoModelo r = es.modificar(id, p);
        if (r == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(r);
    }

    @PutMapping("/atualizar/{id}")
    public ResponseEntity<ProdutoModelo> atualizar(@PathVariable Long id, @RequestBody ProdutoModelo p) {
        ProdutoModelo r = es.atualizar(id, p);
        if (r == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(r);
    }

    @DeleteMapping("/deletar/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        boolean r = es.deletar(id);
        if (!r)
            return ResponseEntity.notFound().build();
        return ResponseEntity.noContent().build();
    }

    @GetMapping("/consultar/{id}")
    public ResponseEntity<ProdutoModelo> consultar(@PathVariable Long id) {
        ProdutoModelo produto = es.consultar(id);
        if (produto == null)
            return ResponseEntity.notFound().build();
        return ResponseEntity.ok(produto);
    }
    

}