package fullstack.backend.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import fullstack.backend.DAO.LibrariesDAO;
import fullstack.backend.DTO.Libraries;

@Repository("librariesDAO")
public class LibrariesDAOImpl implements LibrariesDAO {
    private static List<Libraries> restaurants = new ArrayList<Libraries>();
    public LibrariesDAOImpl() {
        
    }
    static {
        Libraries rest = new Libraries();
        rest.setId(1);
        rest.setName("SAUTE");
        rest.setCouncilDistrict(1);
        rest.setLocation1("2844 HUDSON ST");
        rest.setNeighborhood("Canton");
        rest.setPoliceDistrict("SOUTHEASTERN");
        rest.setZipCode("21224");
        restaurants.add(rest);
    }

    public List<Libraries> getList() {
        // TODO Auto-generated method stub
        return restaurants;
    }

}
