package fullstack.backend.DAO;

import java.util.List;

import fullstack.backend.DTO.Library;

public interface LibrariesDAO {
    public boolean addLibrary(Library library);
    public List<Library> getList();
    public Library getLibrary(int id);
    public boolean updateLibrary(Library library);
    public boolean deleteLibrary(Library library);
    

}
