# Sistema de Matrícula Escolar - Java MVC

Aplicação web desenvolvida em Java utilizando arquitetura MVC, Servlets, JSP e MySQL.

O projeto implementa um CRUD completo para gerenciamento de alunos matriculados, aplicando boas práticas de separação de responsabilidades através das camadas Model, View, Controller, DAO e Service.

---

# Funcionalidades

* Cadastro de alunos
* Listagem de alunos
* Atualização de informações
* Exclusão de registros
* Persistência de dados com MySQL

---

# Tecnologias

* Java 17
* JSP
* Servlet
* JDBC
* MySQL
* Apache Tomcat 10
* HTML5
* CSS3

---

# Arquitetura

O projeto segue o padrão MVC:

```text
Controller → Service → DAO → MySQL
```

Estrutura:

```text
src/
 ├── controller/
 ├── model/
 ├── dao/
 ├── service/
 └── connection/

webapp/
 ├── index.jsp
 ├── alunos.jsp
 └── editar.jsp
```

---

# Banco de Dados

```sql
CREATE DATABASE escola;

USE escola;

CREATE TABLE alunos (
    id INT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100),
    curso VARCHAR(100),
    matricula VARCHAR(20)
);
```

---

# Como Executar

## Pré-requisitos

* Java 17
* Apache Tomcat 10
* MySQL Server
* IntelliJ IDEA

## Passos

1. Clone o repositório
2. Configure o banco MySQL
3. Execute o script SQL
4. Adicione o MySQL Connector/J ao projeto
5. Configure o Tomcat
6. Execute a aplicação

URL:

```text
http://localhost:8080/SistemaMatricula_war_exploded/
```

---

# Objetivos do Projeto

* Aplicar arquitetura MVC
* Trabalhar com Servlets e JSP
* Implementar CRUD completo
* Utilizar JDBC com MySQL
* Organizar a aplicação em camadas

---

# Autor

Erick Santos Alves
