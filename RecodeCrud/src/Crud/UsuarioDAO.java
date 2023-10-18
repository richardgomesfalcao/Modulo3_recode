package Crud;
import java.util.ArrayList;
import java.util.List;

public class UsuarioDAO {
    private List<Usuario> usuarios = new ArrayList<>();
    private int idGenerator = 1;

    public void adicionarUsuario(Usuario usuario) {
        usuario.setId(idGenerator++);
        usuarios.add(usuario);
    }

    public List<Usuario> listarUsuarios() {
        return usuarios;
    }

    public Usuario buscarUsuarioPorID(int id) {
        for (Usuario usuario : usuarios) {
            if (usuario.getId() == id) {
                return usuario;
            }
        }
        return null;
    }

    public void atualizarUsuario(Usuario usuario) {
        int index = -1;
        for (int i = 0; i < usuarios.size(); i++) {
            if (usuarios.get(i).getId() == usuario.getId()) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            usuarios.set(index, usuario);
        }
    }

    public void excluirUsuario(int id) {
        usuarios.removeIf(usuario -> usuario.getId() == id);
    }
}
