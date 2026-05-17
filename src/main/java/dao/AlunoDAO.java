package dao;

import connection.ConnectionFactory;
import model.Aluno;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class AlunoDAO {

    // CREATE
    public void salvar(Aluno aluno) {

        String sql =
                "INSERT INTO alunos(nome, curso, matricula) VALUES (?, ?, ?)";

        try (
                Connection conn =
                        ConnectionFactory.getConnection();

                PreparedStatement stmt =
                        conn.prepareStatement(sql)
        ) {

            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getCurso());
            stmt.setString(3, aluno.getMatricula());

            stmt.executeUpdate();

            System.out.println("Aluno cadastrado!");

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    // READ
    public List<Aluno> listar() {

        List<Aluno> alunos = new ArrayList<>();

        String sql = "SELECT * FROM alunos";

        try (
                Connection conn =
                        ConnectionFactory.getConnection();

                PreparedStatement stmt =
                        conn.prepareStatement(sql);

                ResultSet rs =
                        stmt.executeQuery()
        ) {

            while (rs.next()) {

                Aluno aluno = new Aluno();

                aluno.setId(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                aluno.setCurso(rs.getString("curso"));
                aluno.setMatricula(rs.getString("matricula"));

                alunos.add(aluno);
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return alunos;
    }

    // UPDATE
    public void atualizar(Aluno aluno) {

        String sql =
                "UPDATE alunos SET nome=?, curso=?, matricula=? WHERE id=?";

        try (
                Connection conn =
                        ConnectionFactory.getConnection();

                PreparedStatement stmt =
                        conn.prepareStatement(sql)
        ) {

            stmt.setString(1, aluno.getNome());
            stmt.setString(2, aluno.getCurso());
            stmt.setString(3, aluno.getMatricula());
            stmt.setInt(4, aluno.getId());

            stmt.executeUpdate();

            System.out.println("Aluno atualizado!");

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    // DELETE
    public void excluir(int id) {

        String sql =
                "DELETE FROM alunos WHERE id=?";

        try (
                Connection conn =
                        ConnectionFactory.getConnection();

                PreparedStatement stmt =
                        conn.prepareStatement(sql)
        ) {

            stmt.setInt(1, id);

            stmt.executeUpdate();

            System.out.println("Aluno excluido!");

        } catch (SQLException e) {

            e.printStackTrace();
        }
    }

    public Aluno buscarPorId(int id) {

        String sql =
                "SELECT * FROM alunos WHERE id=?";

        try (

                Connection conn =
                        ConnectionFactory.getConnection();

                PreparedStatement stmt =
                        conn.prepareStatement(sql)

        ) {

            stmt.setInt(1, id);

            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {

                Aluno aluno = new Aluno();

                aluno.setId(rs.getInt("id"));
                aluno.setNome(rs.getString("nome"));
                aluno.setCurso(rs.getString("curso"));
                aluno.setMatricula(rs.getString("matricula"));

                return aluno;
            }

        } catch (SQLException e) {

            e.printStackTrace();
        }

        return null;
    }
}