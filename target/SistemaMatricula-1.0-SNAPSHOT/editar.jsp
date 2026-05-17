<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="model.Aluno" %>

<%

  Aluno aluno =
          (Aluno) request.getAttribute("aluno");

%>

<html>
<head>
  <title>Editar Aluno</title>

  <style>

    body {

      font-family: Arial, sans-serif;
      background-color: #f4f4f4;
      padding: 30px;
    }

    .container {

      width: 50%;
      margin: auto;

      background: white;

      padding: 30px;

      border-radius: 10px;

      box-shadow: 0 0 10px rgba(0,0,0,0.1);
    }

    h1 {

      text-align: center;
      color: #333;
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

  </style>

</head>

<body>

<div class="container">

  <h1>Editar Aluno</h1>

  <form action="alunos" method="post">

    <input type="hidden"
           name="id"
           value="<%= aluno.getId() %>">

    <label>Nome:</label>

    <input type="text"
           name="nome"
           value="<%= aluno.getNome() %>">

    <label>Curso:</label>

    <input type="text"
           name="curso"
           value="<%= aluno.getCurso() %>">

    <label>Matrícula:</label>

    <input type="text"
           name="matricula"
           value="<%= aluno.getMatricula() %>">

    <button type="submit">

      Atualizar

    </button>

  </form>

</div>

</body>
</html>