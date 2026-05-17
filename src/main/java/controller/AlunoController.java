package controller;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import model.Aluno;
import service.AlunoService;

import java.io.IOException;

@WebServlet("/alunos")
public class AlunoController extends HttpServlet {

    private AlunoService service =
            new AlunoService();

    @Override
    protected void doGet(
            HttpServletRequest request,
            HttpServletResponse response)

            throws ServletException, IOException {

        String acao =
                request.getParameter("acao");

        if ("excluir".equals(acao)) {

            int id = Integer.parseInt(
                    request.getParameter("id")
            );

            service.excluir(id);

            response.sendRedirect("alunos");

            return;
        }

        if ("editar".equals(acao)) {

            int id = Integer.parseInt(
                    request.getParameter("id")
            );

            Aluno aluno =
                    service.buscarPorId(id);

            request.setAttribute(
                    "aluno",
                    aluno
            );

            request.getRequestDispatcher(
                    "editar.jsp"
            ).forward(request, response);

            return;
        }

        request.setAttribute(
                "lista",
                service.listar()
        );

        request.getRequestDispatcher(
                "alunos.jsp"
        ).forward(request, response);
    }

    @Override
    protected void doPost(
            HttpServletRequest request,
            HttpServletResponse response)

            throws ServletException, IOException {

        String id =
                request.getParameter("id");

        String nome =
                request.getParameter("nome");

        String curso =
                request.getParameter("curso");

        String matricula =
                request.getParameter("matricula");

        Aluno aluno = new Aluno();

        aluno.setNome(nome);
        aluno.setCurso(curso);
        aluno.setMatricula(matricula);

        if (id == null || id.isEmpty()) {

            service.salvar(aluno);

        } else {

            aluno.setId(Integer.parseInt(id));

            service.atualizar(aluno);
        }

        response.sendRedirect("alunos");
    }
}