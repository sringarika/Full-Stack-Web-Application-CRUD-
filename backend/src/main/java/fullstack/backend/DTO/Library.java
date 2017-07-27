package fullstack.backend.DTO;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String type;
    private String zipCode;
    private String neighborhood;
    private String councilDistrict;
    private String policeDistrict;
    private String location1;
    /**
     * @return the id
     */
    public int getId() {
        return id;
    }
    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * @return the name
     */
    public String getName() {
        return name;
    }
    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }
    /**
     * @return the zipCode
     */
    public String getZipCode() {
        return zipCode;
    }
    /**
     * @param zipCode the zipCode to set
     */
    public void setZipCode(String zipCode) {
        this.zipCode = zipCode;
    }
    /**
     * @return the neighborhood
     */
    public String getNeighborhood() {
        return neighborhood;
    }
    /**
     * @param neighborhood the neighborhood to set
     */
    public void setNeighborhood(String neighborhood) {
        this.neighborhood = neighborhood;
    }
    /**
     * @return the councilDistrict
     */
    public String getCouncilDistrict() {
        return councilDistrict;
    }
    /**
     * @param councilDistrict the councilDistrict to set
     */
    public void setCouncilDistrict(String councilDistrict) {
        this.councilDistrict = councilDistrict;
    }
    /**
     * @return the policeDistrict
     */
    public String getPoliceDistrict() {
        return policeDistrict;
    }
    /**
     * @param policeDistrict the policeDistrict to set
     */
    public void setPoliceDistrict(String policeDistrict) {
        this.policeDistrict = policeDistrict;
    }
    /**
     * @return the location1
     */
    public String getLocation1() {
        return location1;
    }
    /**
     * @param location1 the location1 to set
     */
    public void setLocation1(String location1) {
        this.location1 = location1;
    }
    /**
     * @return the type
     */
    public String getType() {
        return type;
    }
    /**
     * @param type the type to set
     */
    public void setType(String type) {
        this.type = type;
    }
    /* (non-Javadoc)
     * @see java.lang.Object#toString()
     */
    @Override
    public String toString() {
        return "Libraries [id=" + id + ", name=" + name + ", type=" + type + ", zipCode=" + zipCode + ", neighborhood="
                + neighborhood + ", councilDistrict=" + councilDistrict + ", policeDistrict=" + policeDistrict
                + ", location1=" + location1 + "]";
    }
    

}
