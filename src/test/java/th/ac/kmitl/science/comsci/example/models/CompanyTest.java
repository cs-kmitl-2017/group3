package th.ac.kmitl.science.comsci.example.models;

import org.junit.Assert;
import org.junit.Test;

public class CompanyTest {
    
    @Test
    public void TestInputCompany() {
        String Id = "ID58050231";
        String Name = "Pattharachat";
        String GlobolId = "IDG58050231";
        String TaxId = "TAX00058050231";
        
        Company company = new Company();
        company.setId(Id);
        company.setName(Name);
        company.setGlobolId(GlobolId);
        company.setTaxId(TaxId);
   
        Assert.assertEquals(company.getId(), Id);
        Assert.assertEquals(company.getName(), Name);
        Assert.assertEquals(company.getGlobolId(), GlobolId);
        Assert.assertEquals(company.getGlobolId(), GlobolId);
    }
}
