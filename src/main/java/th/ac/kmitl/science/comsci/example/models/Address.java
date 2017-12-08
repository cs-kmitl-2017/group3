package th.ac.kmitl.science.comsci.example.models;

public class Address {
    
    private String postCode;
    private String lineOne;
    private String lineTwo;
    private String lineThree;
    private String lineFour;
    private String streetName;
    private String cityName;
    private String countryName;
    private String buildingName;
    private String buildingNumber;
    private String citySubDivisionName;
    private String countrySubDivision;
    

    public Address(String postCode, 
                    String lineOne, 
                    String lineTwo, 
                    String lineThree, 
                    String lineFour, 
                    String streetName, 
                    String cityName, 
                    String countryName, 
                    String buildingName, 
                    String buildingNumber,
                    String citySubDivisionName,
                    String countrySubDivision) {
        
        this.postCode = postCode;
        this.lineOne = lineOne;
        this.lineTwo = lineTwo;
        this.lineThree = lineThree;
        this.lineFour = lineFour;
        this.streetName = streetName;
        this.cityName = cityName;
        this.countryName = countryName;
        this.buildingName = buildingName;
        this.buildingNumber = buildingNumber;
        this.citySubDivisionName = citySubDivisionName;
        this.countrySubDivision = countrySubDivision;
    }

    public String getPostCode() {
        return postCode;
    }

    public void setPostCode(String postCode) {
        this.postCode = postCode;
    }

    public String getLineOne() {
        return lineOne;
    }

    public void setLineOne(String lineOne) {
        this.lineOne = lineOne;
    }

    public String getLineTwo() {
        return lineTwo;
    }

    public void setLineTwo(String lineTwo) {
        this.lineTwo = lineTwo;
    }

    public String getLineThree() {
        return lineThree;
    }

    public void setLineThree(String lineThree) {
        this.lineThree = lineThree;
    }

    public String getLineFour() {
        return lineFour;
    }

    public void setLineFour(String lineFour) {
        this.lineFour = lineFour;
    }

    public String getStreetName() {
        return streetName;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String getBuildingName() {
        return buildingName;
    }

    public void setBuildingName(String buildingName) {
        this.buildingName = buildingName;
    } 
     
    public String getBuildingNumber() {
        return buildingNumber;
    }

    public void setBuildingNumber(String buildingNumber) {
        this.buildingNumber = buildingNumber;
    }

    public String getCitySubDivisionName() {
        return citySubDivisionName;
    }

    public void setCitySubDivisionName(String citySubDivisionName) {
        this.citySubDivisionName = citySubDivisionName;
    }

    public String getCountrySubDivision() {
        return countrySubDivision;
    }

    public void setCountrySubDivision(String countrySubDivision) {
        this.countrySubDivision = countrySubDivision;
    }   
}