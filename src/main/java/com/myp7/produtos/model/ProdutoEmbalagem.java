package com.myp7.produtos.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data

public class ProdutoEmbalagem {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProdutoEmbalagem;

    private String tipoEmbalagem;
    private String quantidade;
}
