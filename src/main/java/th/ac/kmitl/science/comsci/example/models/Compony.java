package th.ac.kmitl.science.comsci.example.models;

public class Company {
   
    private String id;
    private String name;
    private String globolId;
    private String taxId;
    
    public String getId() {
        return id;
    }
    
    public void setId(String id) {
        this.id = id;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getGlobolId() {
        return globolId;
    }
    
    public void setGlobolId(String globolId) {
        this.globolId = globolId;
    } 
    
    public String getTaxId() {
        return taxId;
    }
    
    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }
}