package th.ac.kmitl.science.comsci.example.models;

import org.junit.Assert;
import org.junit.Test;

public class CompanyTest {
    
    @Test
    public void TestInputCompany() {
        String id = "ID58050231";
        String name = "Pattharachat";
        String globalId = "IDG58050231";
        String taxId = "TAX00058050231";
        
        Company company = new Company(id, name, globalId, taxId);
        company.setId(id);
        company.setName(name);
        company.setGlobalId(globalId);
        company.setTaxId(taxId);
   
        Assert.assertEquals(company.getId(), id);
        Assert.assertEquals(company.getName(), name);
        Assert.assertEquals(company.getGlobalId(), globalId);
        Assert.assertEquals(company.getGlobalId(), globalId);
    }
}