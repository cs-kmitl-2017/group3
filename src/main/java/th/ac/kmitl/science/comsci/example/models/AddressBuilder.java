package th.ac.kmitl.science.comsci.example.models;

public class AddressBuilder {
    
    private String postCode;
    private String lineOne;
    private String lineTwo;
    private String lineThree;
    private String lineFour;
    private String lineFive;
    private CodeMapping cityName;
    private String countryName;
    private String buildingName;
    private CodeMapping citySubDivision;
    private CodeMapping countrySubDivision;

    public AddressBuilder withPostCode(String postCode) {
        this.postCode = postCode;
        return this;
    }
    
    public AddressBuilder withLineOne(String lineOne) {  
        this.lineOne = lineOne;
        return this;  
    }
    
    public AddressBuilder withLineTwo(String lineTwo) { 
        this.lineTwo = lineTwo;
        return this;
    }
    
    public AddressBuilder withLineThree(String lineThree) {
        this.lineThree = lineThree;
        return this; 
    }
    
    public AddressBuilder withLineFour(String lineFour) {
        this.lineFour = lineFour;
        return this;
    }
    
    public AddressBuilder withLineFive(String lineFive) {
        this.lineFive = lineFive;
        return this;
    }
    
    public AddressBuilder withCityName(CodeMapping cityName) {
        this.cityName = cityName;
        return this;
    }
    
    public AddressBuilder withCitySubDivision(CodeMapping citySubDivision) {
        this.citySubDivision = citySubDivision;
        return this;
    }
    
    public AddressBuilder withCountryName(String countryName) {
        this.countryName = countryName;
        return this;   
    }
    
    public AddressBuilder withCountrySubDivision(CodeMapping countrySubDivision) {
        this.countrySubDivision =countrySubDivision;
        return this;
    }
    
        public Address createAddress() {
            return new Address(postCode,
                                lineOne,
                                lineTwo,
                                lineThree,
                                lineFour,
                                lineFive,
                                cityName,
                                countryName,
                                buildingName,
                                citySubDivision,
                                countrySubDivision);
    }
}