package com.myp7.produtos.controller;

import com.myp7.produtos.model.Produto;
import com.myp7.produtos.repository.ProdutoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
    @Autowired
    private ProdutoRepository repository;

    @GetMapping
    public List<Produto> listar(@RequestParam(required = false) String descricao) {
        if (descricao == null || descricao.isEmpty()) {
            return repository.findAll();
        }
        return repository.findByDescricaoContainingIgnoreCase(descricao);
    }

    @PostMapping("/{id}")
    public Produto buscar(@PathVariable Integer id) {
        return repository.findById(id).orElse(null);
}

    @PutMapping("/{id}")
    public Produto atualizar(@PathVariable Integer id, @RequestBody Produto dados) {
        Produto produto = repostory.findById(id).orElse(null);
        if (produto == null) {
            return null;
        }
        produto.setDescricao(dados.getDescricao());
        produto.setCodigoFabricante(dados.getCodigoFabricante());
        return repository.save(produto);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable Integer id) {
        repository.deleteById(id);
    }
}