package Crud;
import java.util.ArrayList;
import java.util.List;

public class FuncionarioDAO {
    private List<Funcionario> funcionarios = new ArrayList<>();
    private int idGenerator = 1;

    public void adicionarFuncionario(Funcionario funcionario) {
        funcionario.setId(idGenerator++);
        funcionarios.add(funcionario);
    }

    public List<Funcionario> listarFuncionarios() {
        return funcionarios;
    }

    public Funcionario buscarFuncionarioPorID(int id) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId() == id) {
                return funcionario;
            }
        }
        return null;
    }

    public void atualizarFuncionario(Funcionario funcionario) {
        int index = -1;
        for (int i = 0; i < funcionarios.size(); i++) {
            if (funcionarios.get(i).getId() == funcionario.getId()) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            funcionarios.set(index, funcionario);
        }
    }

    public void excluirFuncionario(int id) {
        funcionarios.removeIf(funcionario -> funcionario.getId() == id);
    }
}
