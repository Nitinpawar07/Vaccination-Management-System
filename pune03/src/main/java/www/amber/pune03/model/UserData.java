package www.amber.pune03.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "Patient")
public class UserData {
    @Id
    private long id ;
    @Column(name = "idtype")
    private String idtype;
   
    @Column(name = "UserName")
    private String Name;

    @Column(name =  "contact_no")
    private long contact;

    @Column(name = "vaccine_name")
    private String vaccine_name;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIdtype() {
        return idtype;
    }

    public void setIdtype(String idtype) {
        this.idtype = idtype;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public long getContact() {
        return contact;
    }

    public void setContact(long contact) {
        this.contact = contact;
    }

    public String getVaccine_name() {
        return vaccine_name;
    }

    public void setVaccine_name(String vaccine_name) {
        this.vaccine_name = vaccine_name;
    }

    public UserData() {
    }

    @Override
    public String toString() {
        return "UserData [id=" + id + ", idtype=" + idtype + ", Name=" + Name + ", contact=" + contact
                + ", vaccine_name=" + vaccine_name + "]";
    }


    


}
