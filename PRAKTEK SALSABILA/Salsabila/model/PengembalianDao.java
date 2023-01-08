package Salsabila.model;
import java.util.List;
/**
 *
 * @author USER
 */
public interface PengembalianDao {
     void save(Pengembalian pengembalian);
    void update(int index, Pengembalian pengembalian);
    void delete (int index);
    Pengembalian getPengembalian(int index);
    List<Pengembalian> getAllPengembalian();
}