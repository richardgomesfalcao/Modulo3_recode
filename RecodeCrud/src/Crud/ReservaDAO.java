package Crud;
import java.util.ArrayList;
import java.util.List;

public class ReservaDAO {
    private List<Reserva> reservas = new ArrayList<>();
    private int idGenerator = 1;

    public void adicionarReserva(Reserva reserva) {
        reserva.setId(idGenerator++);
        reservas.add(reserva);
    }

    public List<Reserva> listarReservas() {
        return reservas;
    }

    public Reserva buscarReservaPorID(int id) {
        for (Reserva reserva : reservas) {
            if (reserva.getId() == id) {
                return reserva;
            }
        }
        return null;
    }

    public void atualizarReserva(Reserva reserva) {
        int index = -1;
        for (int i = 0; i < reservas.size(); i++) {
            if (reservas.get(i).getId() == reserva.getId()) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            reservas.set(index, reserva);
        }
    }

    public void excluirReserva(int id) {
        reservas.removeIf(reserva -> reserva.getId() == id);
    }
}
