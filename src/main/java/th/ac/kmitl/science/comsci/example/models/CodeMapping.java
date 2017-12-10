package th.ac.kmitl.science.comsci.example.models;

import java.util.Objects;

public class CodeMapping {
    
    private int id;
    private String name;

    public CodeMapping(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 47 * hash + this.id;
        hash = 47 * hash + Objects.hashCode(this.name);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CodeMapping)) 
            return false;
        
        final CodeMapping other =(CodeMapping) obj;
        
        return this.id == other.id && this.name.equals(other.name);
    }   
}
