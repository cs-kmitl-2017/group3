package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import static org.junit.Assert.*;
import static th.ac.kmitl.science.comsci.example.models.AddressMock.*;
import static th.ac.kmitl.science.comsci.example.models.CodeMappingMock.cityName;

public class AddressTest {

    private Object citySubDivision;
    private Object countrySubDivision;
    
    @Test
    public void testAddress() {
        Address address = address();
 
        assertEquals(postCode, address.getPostCode());
        assertEquals(buildingName, address.getBuildingName());
        assertEquals(lineOne, address.getLineOne());
        assertEquals(lineTwo, address.getLineTwo());
        assertEquals(lineThree, address.getLineThree());
        assertEquals(lineFour, address.getLineFour());
        assertEquals(lineFive, address.getLineFive());
        assertEquals(cityName, address.getCityName());
        assertEquals(citySubDivision, address.getCitySubDivision());
        assertEquals(countryName, address.getCountryName());
        assertEquals(countrySubDivision, address.getCountrySubDivision());
    }     
    
    @Test
    public void testaddressWithSomeAttribute() {
         Address address = addressWithSomeAttribute();
 
         assertEquals(postCode, address.getPostCode());
         assertEquals(buildingName, address.getBuildingName());
         assertEquals(lineOne, address.getLineOne());
         assertEquals(lineTwo, address.getLineTwo());
         assertEquals(null, address.getLineThree());
         assertEquals(null, address.getLineFour());
         assertEquals(null, address.getLineFive());
         assertEquals(lineFive, address.getLineFive());
         assertEquals(cityName, address.getCityName());
         assertEquals(citySubDivision, address.getCitySubDivision());
         assertEquals(null, address.getCountryName());
         assertEquals(null, address.getCountrySubDivision());
    }
}