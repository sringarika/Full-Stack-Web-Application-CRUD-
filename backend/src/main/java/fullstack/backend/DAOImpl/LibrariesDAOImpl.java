package fullstack.backend.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fullstack.backend.DAO.LibrariesDAO;
import fullstack.backend.DTO.Library;

@Repository("librariesDAO")
@Transactional
public class LibrariesDAOImpl implements LibrariesDAO {
    @Autowired
    private SessionFactory session;
    public LibrariesDAOImpl() {
        
    }

    public List<Library> getList() {
        String selectLibraries = "FROM Library";
        Query query = session.getCurrentSession().createQuery(selectLibraries);
        return query.getResultList();
    }

    @Override
    public boolean addLibrary(Library library) {
        try {
            session.getCurrentSession().persist(library);
            return true;
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean updateLibrary(Library library) {
        try {
            session.getCurrentSession().update(library);
            return true;
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public boolean deleteLibrary(Library library) {
        try {
            session.getCurrentSession().delete(library);
            return true;
        } catch(Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    @Override
    public Library getLibrary(int id) {
        return session.getCurrentSession().get(Library.class, Integer.valueOf(id));
    }

}
