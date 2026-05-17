\# Sistema de Matrícula Escolar



\## Descrição do Projeto



Este projeto foi desenvolvido como atividade prática da disciplina de Desenvolvimento Web com Java, utilizando o padrão de arquitetura MVC (Model-View-Controller).



O sistema consiste em uma aplicação web simples para gerenciamento de matrículas escolares, permitindo o cadastro, listagem, edição e exclusão de alunos matriculados.



O objetivo principal do trabalho foi aplicar conceitos de:



\* Arquitetura MVC

\* DAO (Data Access Object)

\* Camada Service

\* Integração com banco de dados MySQL

\* Servlets e JSP

\* CRUD completo



\---



\# Tecnologias Utilizadas



\* Java 17

\* JSP

\* Servlet

\* JDBC

\* MySQL

\* Apache Tomcat 10

\* IntelliJ IDEA

\* HTML5

\* CSS3



\---



\# Estrutura do Projeto



```text

src/

&#x20;├── controller/

&#x20;│     AlunoController.java

&#x20;│

&#x20;├── model/

&#x20;│     Aluno.java

&#x20;│

&#x20;├── dao/

&#x20;│     AlunoDAO.java

&#x20;│

&#x20;├── service/

&#x20;│     AlunoService.java

&#x20;│

&#x20;├── connection/

&#x20;│     ConnectionFactory.java

&#x20;│

&#x20;└── view/

&#x20;      arquivos JSP



webapp/

&#x20;├── index.jsp

&#x20;├── alunos.jsp

&#x20;└── editar.jsp

```



\---



\# Funcionalidades



O sistema possui as seguintes funcionalidades:



\* Cadastro de alunos

\* Listagem de alunos

\* Atualização de dados

\* Exclusão de alunos

\* Integração com banco MySQL



\---



\# Banco de Dados



\## Criação do banco



```sql

CREATE DATABASE escola;



USE escola;



CREATE TABLE alunos (

&#x20;   id INT AUTO\_INCREMENT PRIMARY KEY,

&#x20;   nome VARCHAR(100),

&#x20;   curso VARCHAR(100),

&#x20;   matricula VARCHAR(20)

);

```



\---



\# Como Executar o Projeto



1\. Instalar o Java 17

2\. Instalar o MySQL

3\. Configurar o Apache Tomcat

4\. Importar o projeto no IntelliJ IDEA

5\. Adicionar o MySQL Connector/J

6\. Executar o servidor Tomcat

7\. Acessar:



```text

http://localhost:8080/SistemaMatricula\_war\_exploded/

```



\---



\# Arquitetura MVC



\## Model



Responsável por representar os dados da aplicação.



\## View



Responsável pela interface visual utilizando JSP.



\## Controller



Responsável por receber as requisições e controlar o fluxo da aplicação.



\---



\# Padrões Utilizados



\## DAO



Responsável pelo acesso e manipulação dos dados no banco.



\## Service



Responsável pela camada intermediária entre Controller e DAO.



\---



\# Integrantes



\* Fulano de tal 1

\* Nome do Integrante 2



\---



\# Considerações Finais



O projeto permitiu aplicar na prática conceitos fundamentais do desenvolvimento web com Java, incluindo organização em camadas, integração com banco de dados e implementação do padrão MVC.



