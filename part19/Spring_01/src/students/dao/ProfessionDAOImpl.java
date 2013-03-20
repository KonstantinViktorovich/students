package students.dao;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;
import students.entity.Profession;

public class ProfessionDAOImpl implements ProfessionDAO {

    public Serializable addProfession(Profession p) {
        System.out.println("addProfession called");
        return null;
    }

    public void updateProfession(Profession p) {
        System.out.println("updateProfession called");
    }

    public void deleteProfession(Profession p) {
        System.out.println("deleteProfession called");
    }

    public List<Profession> findProfession() {
        System.out.println("findProfession called");
        List<Profession> list = new LinkedList<Profession>();
        list.add(new Profession());
        return list;
    }

}
