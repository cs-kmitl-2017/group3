package th.ac.kmitl.science.comsci.example.models;

import th.ac.kmitl.science.comsci.example.models.Mapping;

public class CountryMapping implements Mapping {
    
    @Override
    public int mapper(String name) throws Exception {
        switch(name){
            case "Thailand"                 : return 1;
            case "Laos"                     : return 2;
            case "Brazil"                   : return 3;
            case "Argentina"                : return 4;
            case "China"                    : return 5;
            case "England"                  : return 6;
            case "France"                   : return 7;
            case "Spain"                    : return 8;
            case "Singapore"                : return 9;
            case "Mexico"                   : return 10;
            case "Canada"                   : return 11;
            case "India"                    : return 12;
            case "United States of America" : return 13;
            case "USA"                      : return 13;
            case "Japan"                    : return 14;
            case "North Korea"              : return 15;
            case "South Korea"              : return 16;
            default : throw new IllegalArgumentException("MappingNotFoundException");
        }
    }
}
