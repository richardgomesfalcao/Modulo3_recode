package Crud;
import java.util.ArrayList;
import java.util.List;

public class DestinoDAO {
    private List<Destino> destinos = new ArrayList<>();
    private int idGenerator = 1;

    public void adicionarDestino(Destino destino) {
        destino.setId(idGenerator++);
        destinos.add(destino);
    }

    public List<Destino> listarDestinos() {
        return destinos;
    }

    public Destino buscarDestinoPorID(int id) {
        for (Destino destino : destinos) {
            if (destino.getId() == id) {
                return destino;
            }
        }
        return null;
    }

    public void atualizarDestino(Destino destino) {
        int index = -1;
        for (int i = 0; i < destinos.size(); i++) {
            if (destinos.get(i).getId() == destino.getId()) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            destinos.set(index, destino);
        }
    }

    public void excluirDestino(int id) {
        destinos.removeIf(destino -> destino.getId() == id);
    }
}
