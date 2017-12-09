package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import th.ac.kmitl.science.comsci.example.utilities.CountryMapping;

public class CountryMappingTest {
    
    private CountryMapping countryMapping = new CountryMapping();
    private Address mock = new Address();
    public  String countryName = "United States of America";
    
    @Test
    public void testByName() throws Exception {
        assert(countryMapping.mapper("North Korea") == 15);
        assert(countryMapping.mapper("USA") == 13);
        assert(countryMapping.mapper("United States of America") == 13);
        assert(countryMapping.mapper("South Korea") == 16);
        assert(countryMapping.mapper("England") == 6);
        assert(countryMapping.mapper("Spain") == 8);
        assert(countryMapping.mapper("Brazil") == 3);
        assert(countryMapping.mapper("Thailand") == 1);
        assert(countryMapping.mapper("Laos") == 2);
    }
    
    @Test
    public void testByMock() throws Exception {
        mock.setCountryName(countryName);
        assert(countryMapping.mapper(mock.getCountryName()) == 13);
    }
}
