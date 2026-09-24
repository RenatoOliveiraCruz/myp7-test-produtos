package com.myp7.produtos.repository;

import com.myp7.produtos.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ProdutoRepositoty extends  JpaRepository<Produto, Integer> {
    List<Produto> findByDescricaoContainingIgnoreCase(String descricao);
}
