package th.ac.kmitl.science.comsci.example.models;


public class Company {
    

    private String Id;
    private String Name;
    private String GlobolId;
    private String taxId;
    
    public String getId() {
        return Id;
    }
    
    public void setId(String Id) {
        this.Id = Id;
    }

    
    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

   
    public String getGlobolId() {
        return GlobolId;
    }

    public void setGlobolId(String GlobolId) {
        this.GlobolId = GlobolId;
    }

    
    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }

   }