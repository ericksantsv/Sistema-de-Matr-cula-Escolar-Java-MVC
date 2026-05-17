<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>
<%@ page import="model.Aluno" %>

<html>
<head>
  <title>Sistema Escolar</title>

  <style>

    body {

      font-family: Arial, sans-serif;
      background-color: #f4f4f4;
      margin: 0;
      padding: 30px;
    }

    .container {

      width: 80%;
      margin: auto;
      background: white;
      padding: 30px;
      border-radius: 10px;
      box-shadow: 0 0 10px rgba(0,0,0,0.1);
    }

    h1, h2 {

      text-align: center;
      color: #333;
    }

    form {

      margin-bottom: 30px;
    }

    input {

      width: 100%;
      padding: 10px;
      margin-top: 5px;
      margin-bottom: 15px;

      border: 1px solid #ccc;
      border-radius: 5px;
    }

    button {

      background-color: #ff69b4;
      color: white;

      padding: 10px 20px;

      border: none;
      border-radius: 5px;

      cursor: pointer;
    }

    button:hover {

      background-color: #fd9fcc;
    }

    table {

      width: 100%;
      border-collapse: collapse;
      margin-top: 20px;
    }

    table th {

      background-color: #ff69b4;
      color: white;
    }

    table th,
    table td {

      padding: 12px;
      border: 1px solid #ddd;
      text-align: center;
    }

    table tr:nth-child(even) {

      background-color: #f9f9f9;
    }

    a {

      text-decoration: none;
      color: #ff69b4;
      font-weight: bold;
    }

    a:hover {

      color: #fd9fcc;
    }

  </style>

</head>

<body>

<div class="container">

  <h1>Sistema de Matrícula Escolar</h1>

  <form action="alunos" method="post">

    <label>Nome:</label>

    <input type="text"
           name="nome"
           required>

    <label>Curso:</label>

    <input type="text"
           name="curso"
           required>

    <label>Matrícula:</label>

    <input type="text"
           name="matricula"
           required>

    <button type="submit">

      Cadastrar

    </button>

  </form>

  <hr>

  <h2>Lista de Alunos</h2>

  <table>

    <tr>

      <th>ID</th>
      <th>Nome</th>
      <th>Curso</th>
      <th>Matrícula</th>
      <th>Ações</th>

    </tr>

    <%

      List<Aluno> lista =
              (List<Aluno>) request.getAttribute("lista");

      if (lista != null) {

        for (Aluno aluno : lista) {

    %>

    <tr>

      <td>
        <%= aluno.getId() %>
      </td>

      <td>
        <%= aluno.getNome() %>
      </td>

      <td>
        <%= aluno.getCurso() %>
      </td>

      <td>
        <%= aluno.getMatricula() %>
      </td>

      <td>

        <a href="alunos?acao=editar&id=<%= aluno.getId() %>">

          Editar

        </a>

        |

        <a href="alunos?acao=excluir&id=<%= aluno.getId() %>">

          Excluir

        </a>

      </td>

    </tr>

    <%

        }
      }

    %>

  </table>

</div>

</body>
</html>