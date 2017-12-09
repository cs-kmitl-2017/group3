package th.ac.kmitl.science.comsci.example.models;

import org.junit.Test;
import static org.junit.Assert.*;
import static th.ac.kmitl.science.comsci.example.models.CodeMappingMock.*;

public class MappingTest {
    
    @Test
    public void createMappingTest() {
        CodeMapping citySubDivisionMapping = citySubDivision();
        
        assertEquals(cityId, citySubDivisionMapping.getId());
        assertEquals(cityName, citySubDivisionMapping.getName());
    } 
}