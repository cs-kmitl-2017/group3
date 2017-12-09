package th.ac.kmitl.science.comsci.example.models;

public class Address {
    
    private String postCode;
    private String lineOne;
    private String lineTwo;
    private String lineThree;
    private String lineFour;
    private String lineFive;
    private String countryName;
    private String buildingName;
    private CodeMapping countrySubDivision;
    private CodeMapping citySubDivision;
    private CodeMapping cityName;
    
    public Address() {
        
    };
    
    public Address(String postCode, 
                    String lineOne, 
                    String lineTwo, 
                    String lineThree, 
                    String lineFour, 
                    String lineFive,
                    CodeMapping cityName, 
                    String countryName, 
                    String buildingName, 
                    CodeMapping countrySubDivision,
                    CodeMapping citySubDivision) {
        
        this.postCode = postCode;
        this.lineOne = lineOne;
        this.lineTwo = lineTwo;
        this.lineThree = lineThree;
        this.lineFour = lineFour;
        this.lineFive = lineFive;
        this.cityName = cityName;
        this.countryName = countryName;
        this.buildingName = buildingName;
        this.citySubDivision = citySubDivision;
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

    public String getLineFive() {
        return lineFive;
    }

    public void setLineFive(String streetName) {
        this.lineFive = lineFive;
    }

    public CodeMapping getCityName() {
        return cityName;
    }
    
    public void setCityName(CodeMapping cityName) {
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

    public CodeMapping getCitySubDivision() {
        return citySubDivision;
    }
  
    public void setCitySubDivision(CodeMapping citySubDivision) {
        this.citySubDivision = citySubDivision;
    }

    public CodeMapping getCountrySubDivision() {
        return countrySubDivision;
    }

    public void setCountrySubDivision(CodeMapping countrySubDivision) {
        this.countrySubDivision = countrySubDivision;
    }   
}