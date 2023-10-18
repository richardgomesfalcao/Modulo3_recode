package Crud;
import java.util.ArrayList;
import java.util.List;

public class ComentarioDAO {
    private List<Comentario> comentarios = new ArrayList<>();
    private int idGenerator = 1;

    public void adicionarComentario(Comentario comentario) {
        comentario.setId(idGenerator++);
        comentarios.add(comentario);
    }

    public List<Comentario> listarComentarios() {
        return comentarios;
    }

    public Comentario buscarComentarioPorID(int id) {
        for (Comentario comentario : comentarios) {
            if (comentario.getId() == id) {
                return comentario;
            }
        }
        return null;
    }

    public void atualizarComentario(Comentario comentario) {
        int index = -1;
        for (int i = 0; i < comentarios.size(); i++) {
            if (comentarios.get(i).getId() == comentario.getId()) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            comentarios.set(index, comentario);
        }
    }

    public void excluirComentario(int id) {
        comentarios.removeIf(comentario -> comentario.getId() == id);
    }
}
