package service;

import dao.AlunoDAO;
import model.Aluno;

import java.util.List;

public class AlunoService {

    private AlunoDAO dao = new AlunoDAO();

    // CREATE
    public void salvar(Aluno aluno) {

        dao.salvar(aluno);
    }

    // READ
    public List<Aluno> listar() {

        return dao.listar();
    }

    // UPDATE
    public void atualizar(Aluno aluno) {

        dao.atualizar(aluno);
    }

    // DELETE
    public void excluir(int id) {

        dao.excluir(id);
    }

    // BUSCAR_POR_ID
    public Aluno buscarPorId(int id) {

        return dao.buscarPorId(id);
    }
}