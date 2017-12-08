package th.ac.kmitl.science.comsci.example.models;

public class Company {

    private String id;
    private String name;
    private String globalId;
    private String taxId;

    public Company(String id, String name, String globalId, String taxId) {
        this.id = id;
        this.name = name;
        this.globalId = globalId;
        this.taxId = taxId;
    }

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

    public String getGlobalId() {
        return globalId;
    }

    public void setGlobalId(String globalId) {
        this.globalId = globalId;
    }

    public String getTaxId() {
        return taxId;
    }

    public void setTaxId(String taxId) {
        this.taxId = taxId;
    }
}