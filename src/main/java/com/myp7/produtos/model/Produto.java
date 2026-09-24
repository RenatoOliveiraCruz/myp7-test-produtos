package com.myp7.produtos.model;

import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

public class Produto {
    package com.myp7.produtos.model;

    import jakarta.persistence.*;
    import lombok.Data;
    import java.util.ArrayList;
    import java.util.List;

    @Entidy
    @Data
    public class Produto {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Integer idProduto;
        private String descricao;
        private String codigoFabricante;

        @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
        @JoinColumn(name = "idProduto")
        private List<Pedido> pedidos = new ArrayList<>();
}
