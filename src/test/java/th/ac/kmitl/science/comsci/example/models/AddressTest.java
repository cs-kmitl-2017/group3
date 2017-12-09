package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import static org.junit.Assert.*;
import static th.ac.kmitl.science.comsci.example.models.AddressMock.*;
import static th.ac.kmitl.science.comsci.example.models.CodeMappingMock.cityName;
import static th.ac.kmitl.science.comsci.example.models.CodeMappingMock.citySubDivision;
import static th.ac.kmitl.science.comsci.example.models.CodeMappingMock.countrySubDivision;

public class AddressTest {
    
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
}
