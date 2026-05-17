package dao;

import dao.AlunoDAO;
import model.Aluno;

public class TesteDAO {

    public static void main(String[] args) {

        AlunoDAO dao = new AlunoDAO();

        // CREATE
        Aluno aluno = new Aluno();

        aluno.setNome("Erick");
        aluno.setCurso("ADS");
        aluno.setMatricula("2026001");

        dao.salvar(aluno);

        // READ
        System.out.println("\nLISTA DE ALUNOS:\n");

        for (Aluno a : dao.listar()) {

            System.out.println(
                    a.getId() + " - " +
                            a.getNome() + " - " +
                            a.getCurso() + " - " +
                            a.getMatricula()
            );
        }
    }
}