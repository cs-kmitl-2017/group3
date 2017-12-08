package th.ac.kmitl.science.comsci.example.models;

import org.junit.Assert;
import org.junit.Test;

public class CompanyTest {
    
    @Test
    public void TestInputCompany() {
        String id = "ID58050231";
        String name = "Pattharachat";
        String globolId = "IDG58050231";
        String taxId = "TAX00058050231";
        
        Company company = new Company();
        company.setId(id);
        company.setName(name);
        company.setGlobolId(globolId);
        company.setTaxId(taxId);
   
        Assert.assertEquals(company.getId(), id);
        Assert.assertEquals(company.getName(), name);
        Assert.assertEquals(company.getGlobolId(), globolId);
        Assert.assertEquals(company.getGlobolId(), globolId);
    }
}
