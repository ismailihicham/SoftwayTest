package com.softwayMedical;

public class MultiplePathologie implements PathologyDiscovery{
    @Override
    public String discoverPathology(int capteurIndex) {
        if(capteurIndex %3 == 0 && capteurIndex %5 == 0) {
            return "Cardiologie, Traumatologie.";
        };
        return null;
    }
}
