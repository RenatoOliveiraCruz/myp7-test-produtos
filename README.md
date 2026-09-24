# Teste Técnico - Cadastro de Produtos

Aplicação para cadastro, consulta e filtro de produtos, desenvolvida para o teste técnico da MYP7.

## Aplicação

A aplicação está disponível em:

https://myp7-test-produtos-production.up.railway.app/

## Tecnologias

- Java 17
- Spring Boot
- Spring Data JPA
- H2
- Lombok
- HTML
- JavaScript
- Maven

## Funcionalidades

- Cadastro de produtos
- Listagem de produtos
- Busca por descrição
- Consulta de produto por ID
- Atualização de produtos pela API
- Exclusão de produtos pela API

## Como executar

É necessário ter o JDK 17 ou superior.

```bash
# Windows
mvnw.cmd spring-boot:run

# Linux/macOS
./mvnw spring-boot:run
```
Também é possível executar a classe `ProdutosApplication` pela IDE.

Após iniciar, acesse:

http://localhost:8080

## API

| Método | Endpoint | Descrição |
|---|---|---|
| GET | `/produtos` | Lista os produtos |
| GET | `/produtos?descricao=arroz` | Filtra por descrição |
| GET | `/produtos/{id}` | Busca por ID |
| POST | `/produtos` | Cadastra um produto |
| PUT | `/produtos/{id}` | Atualiza um produto |
| DELETE | `/produtos/{id}` | Exclui um produto |

## Exemplo de cadastro

```json
{
  "descricao": "Arroz",
  "codigoFabricante": "ARZ001",
  "embalagens": [
    {
      "tipoEmbalagem": "Caixa",
      "quantidade": "10"
    }
  ]
}
