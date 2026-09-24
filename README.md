# Teste Técnico — Cadastro de Produtos

Aplicação web para gerenciamento de produtos, desenvolvida como parte de um teste técnico de desenvolvimento **Backend + Frontend**.

A solução disponibiliza uma **API RESTful** para operações de CRUD de produtos, persistência utilizando **Spring Data JPA + H2** e uma interface web integrada à API para cadastro, listagem e filtragem por descrição.

## 🌐 Aplicação

**Demo:** https://SEU-LINK-RAILWAY

**Repositório:** https://github.com/RenatoOliveiraCruz/myp7-test-produtos

---

## 🛠️ Tecnologias

### Backend
- Java 17
- Spring Boot
- Spring Data JPA
- Hibernate
- H2 Database
- Lombok
- Maven

### Frontend
- HTML5
- CSS3
- JavaScript
- Fetch API

---

## 🏗️ Arquitetura

A aplicação utiliza uma arquitetura simples, organizada em camadas, mantendo a responsabilidade de cada componente bem definida.

```text
Frontend
   │
   │ HTTP / REST
   ▼
ProdutoController
   │
   ▼
ProdutoRepository
   │
   ▼
Spring Data JPA / Hibernate
   │
   ▼
H2 Database
