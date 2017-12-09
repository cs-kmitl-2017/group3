package th.ac.kmitl.science.comsci.example.models;

import java.util.Objects;

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
    
    public AddressBuilder withBuildingName(String buildingName) {
        this.buildingName =buildingName;
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AddressBuilder other = (AddressBuilder) obj;
        if (!Objects.equals(this.postCode, other.postCode)) {
            return false;
        }
        if (!Objects.equals(this.lineOne, other.lineOne)) {
            return false;
        }
        if (!Objects.equals(this.lineTwo, other.lineTwo)) {
            return false;
        }
        if (!Objects.equals(this.lineThree, other.lineThree)) {
            return false;
        }
        if (!Objects.equals(this.lineFour, other.lineFour)) {
            return false;
        }
        if (!Objects.equals(this.lineFive, other.lineFive)) {
            return false;
        }
        if (!Objects.equals(this.countryName, other.countryName)) {
            return false;
        }
        if (!Objects.equals(this.buildingName, other.buildingName)) {
            return false;
        }
        if (!Objects.equals(this.cityName, other.cityName)) {
            return false;
        }
        if (!Objects.equals(this.citySubDivision, other.citySubDivision)) {
            return false;
        }
        if (!Objects.equals(this.countrySubDivision, other.countrySubDivision)) {
            return false;
        }
        return true;
    }
}
