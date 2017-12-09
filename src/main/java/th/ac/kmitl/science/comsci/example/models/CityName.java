package th.ac.kmitl.science.comsci.example.models;

import th.ac.kmitl.science.comsci.example.utilities.Mapping;

public class CityName implements Mapping {
    
    @Override
    public int mapper(String name) throws Exception {
        switch(name){
            case "Samphanthawong"       : return 1;
            case "Phaya Thai"           : return 2;
            case "Thon Buri"            : return 3;
            case "Bangkok Yai"          : return 4;
            case "Huai Khwang"          : return 5;
            case "Khlong San"           : return 6;
            case "Taling Chan"          : return 7;
            case "Bangkok Noi"          : return 8;
            case "Bang Khun Thian"      : return 9;
            case "Phasi Charoen"        : return 10;
            case "Nong Khaem"           : return 11;
            case "Rat Burana"           : return 12;
            case "Bang Phlat"           : return 13;
            case "Din Daeng"            : return 14;
            case "Bueng Kum"            : return 15;
            case "Sathon"               : return 16;
            case "Bang Sue"             : return 17;
            case "Chatuchak"            : return 18;
            case "Bang Kho Laem"        : return 19;
            case "Prawet"               : return 20;
            case "Khlong Toei"          : return 21;
            case "Suan Luang"           : return 22;
            case "Chom Thong"           : return 23;
            case "Don Mueang"           : return 24;
            case "Ratchathewi"          : return 25;
            case "Lat Phrao"            : return 26;
            case "Watthana"             : return 27;
            case "Bang Khae"            : return 28;
            case "Lak Si"               : return 29;
            case "Sai Mai"              : return 30;
            case "Khan Na Yao"          : return 31;
            case "Saphan Sung"          : return 32;
            case "Wang Thonglang"       : return 33;
            case "Khlong Sam Wa"        : return 34;
            case "Bang Na"              : return 35;
            case "Thawi Watthana"       : return 36;
            case "Thung Khru"           : return 37;
            case "Bang Bon"             : return 38;
            case "Phra Nakhon"          : return 39;
            case "Dusit"                : return 40;
            default : throw new IllegalArgumentException("MappingNotFoundException");
        }
    }
}
