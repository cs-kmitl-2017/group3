package th.ac.kmitl.science.comsci.example.models;

import org.junit.Assert;
import org.junit.Test;

public class AddressTest {
    
    @Test
    public void testInputAddress() {
        String postCode = "10520";
        String lineOne = "595/2 P.P.ONE Apartment";
        String lineTwo = "soi.Chalongkrung 1/5";
        String lineThree = "Ladkrabang ,Bangkok";
        String lineFour = "Thailand";
        String StreetName = "Chalongkrung";
        String buildingNumber = "595/2";
        String buildingName = "P.P. One Apartment";
        String cityName = "Bangkok";
        String countryName = "Thailand";
        
        Address address = new Address();
        address.setBuildingName(buildingName);
        address.setBuildingNumber(buildingNumber);
        address.setCityName(cityName);
        address.setCountryName(countryName);
        address.setLineOne(lineOne);
        address.setLineTwo(lineTwo);
        address.setLineThree(lineThree);
        address.setLineFour(lineFour);
        address.setPostCode(postCode);
        address.setStreetName(StreetName);
        
        Assert.assertEquals(address.getBuildingName(), buildingName);
        Assert.assertEquals(address.getBuildingNumber(), buildingNumber);
        Assert.assertEquals(address.getCityName(), cityName);
        Assert.assertEquals(address.getCountryName(), countryName);
        Assert.assertEquals(address.getLineOne(), lineOne);
        Assert.assertEquals(address.getLineTwo(), lineTwo);
        Assert.assertEquals(address.getLineThree(), lineThree);
        Assert.assertEquals(address.getLineFour(), lineFour);
        Assert.assertEquals(address.getPostCode(), postCode);
        Assert.assertEquals(address.getStreetName(), StreetName);
    }  
}
