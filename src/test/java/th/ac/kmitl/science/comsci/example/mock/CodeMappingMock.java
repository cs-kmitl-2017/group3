package th.ac.kmitl.science.comsci.example.models;

public class CodeMappingMock {
    
    public static int citySubDivisionId =2;
    public static String citySubDivisionName ="Ladkarbang";
    
    public static int cityId = 1;
    public static String cityName = "Ladkrbang";
    
    public static int countryId = 1;
    public static String countryName = "Bangkok";
    
    public static CodeMapping citySubDivision() {
        return new CodeMapping(citySubDivisionId, citySubDivisionName);
    }
    
    public static CodeMapping countrySubDivision() {
        return new CodeMapping(countryId, countryName);
    }
    
    public static CodeMapping cityName() {
        return new CodeMapping(cityId, cityName);
    } 
}