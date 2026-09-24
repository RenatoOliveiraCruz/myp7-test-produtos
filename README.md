# Teste Técnico - Cadastro de Produtos

API REST + frontend simples para cadastrar, listar e filtrar produtos.

## Tecnologias
Java 17, Spring Boot, Spring Data JPA, H2 (em memória), Lombok, HTML e JavaScript.

## Como rodar
Precisa do JDK 17+. Na raiz do projeto:

```bash
./mvnw spring-boot:run
```

(no Windows: `mvnw.cmd spring-boot:run`). Ou rode a classe `ProdutosApplication` pela IDE.

Abrir no navegador: http://localhost:8080

Os dados ficam em memória e somem quando a aplicação para.

## Endpoints
| Método | Rota | Descrição |
|--------|------|-----------|
| GET | /produtos | Lista os produtos |
| GET | /produtos?descricao=arroz | Filtra pela descrição |
| GET | /produtos/{id} | Busca por id |
| POST | /produtos | Cadastra |
| PUT | /produtos/{id} | Atualiza |
| DELETE | /produtos/{id} | Exclui |

Exemplo de POST:
```json
{
  "descricao": "Arroz",
  "codigoFabricante": "ARZ001",
  "embalagens": [{ "tipoEmbalagem": "Caixa", "quantidade": "10" }]
}
```
