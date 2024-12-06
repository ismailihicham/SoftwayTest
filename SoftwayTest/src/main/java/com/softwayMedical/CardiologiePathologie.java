package com.softwayMedical;

public class CardiologiePathologie implements PathologyDiscovery{
    @Override
    public String discoverPathology(int capteurIndex) {
        if(capteurIndex %3 == 0 && capteurIndex %5 != 0) {
            return "Cardiologie.";
        };
        return null;
    }
}
