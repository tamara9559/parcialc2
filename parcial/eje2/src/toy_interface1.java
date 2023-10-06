import DTO.toy;

import java.io.IOException;
import java.util.List;

public interface toy_interface1 {
    toy findById(int id);
    List<toy> findAll() throws IOException, ClassNotFoundException;
    void save(toy toy) throws IOException;
    void update(toy toy) throws IOException;
    void delete(toy toy) throws IOException;
}
