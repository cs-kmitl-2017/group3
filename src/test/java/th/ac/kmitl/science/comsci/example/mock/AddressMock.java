package th.ac.kmitl.science.comsci.example.models;

public class AddressMock {
    
    public static String postCode = "10520";
    public static String buildingName = "P.P.ONE apartment";
    public static String lineOne = "595/2";
    public static String lineTwo = "Soi.Chalongkrung 1/5";
    public static String lineThree = "Chalongkrung road";
    public static String lineFour = "";
    public static String lineFive = "";
    public static String countryName = "Bangkok";
    public CodeMapping citySubDivision = CodeMappingMock.citySubDivision();
    public CodeMapping cityName = CodeMappingMock.cityName();
    public CodeMapping countrySubDivision = CodeMappingMock.countrySubDivision();
    
    
    public static Address address() {
        Address address = new AddressBuilder()
                        .withPostCode(postCode)
                        .withLineOne(lineOne)
                        .withLineTwo(lineTwo)
                        .withLineThree(lineThree)
                        .withLineFour(lineFour)
                        .withLineFive(lineFive)
                        .withBuildingName(buildingName)
                        .withCountryName(countryName)
                        .withCityName(cityName)
                        .withCitySubDivision(citySubDivision)
                        .withCountrySubDivision(countrySubDivision)
                        .createAddress();   
        return address;           
    }
}
