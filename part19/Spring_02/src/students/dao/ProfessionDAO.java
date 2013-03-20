package students.dao;

import java.io.Serializable;
import java.util.List;
import students.entity.Profession;

public interface ProfessionDAO {

    public Serializable addProfession(Profession p);

    public void updateProfession(Profession p);

    public void deleteProfession(Profession p);

    public List<Profession> findProfession();
}
