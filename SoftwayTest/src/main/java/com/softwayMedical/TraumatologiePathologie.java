package com.softwayMedical;

public class TraumatologiePathologie implements PathologyDiscovery{
    @Override
    public String discoverPathology(int capteurIndex) {
        if(capteurIndex %5 == 0 && capteurIndex %3 != 0) {
            return "Traumatologie.";
        };
        return null;
    }
}
