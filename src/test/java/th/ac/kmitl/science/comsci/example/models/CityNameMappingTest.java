package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;

public class CityNameMappingTest {
    
    private CityName cityMapping = new CityName();
    private Address mock = new Address();
    public  String city = "Ratchathewi";
    
    
    @Test
    public void testByName(){
        assert(cityMapping.mapper("Lat Phrao") == 26);
        assert(cityMapping.mapper("Sai Mai") == 30);
        assert(cityMapping.mapper("Bang Bon") == 38);
        assert(cityMapping.mapper("Chom Thong") == 23);
        assert(cityMapping.mapper("Nong Khaem") == 11);
        assert(cityMapping.mapper("Chatuchak") == 18);
        assert(cityMapping.mapper("Taling Chan") == 7);
        assert(cityMapping.mapper("Phaya Thai")== 2);
    }
    
    @Test
    public void testByMock(){
        mock.setCityName(city);
        assert(cityMapping.mapper(mock.getCityName()) == 25);
    }
    
}
