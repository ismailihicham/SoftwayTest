package com.softwayMedical;

public class DiagnosticCabine {
    private PathologyDiscovery pathology;

    public DiagnosticCabine (PathologyDiscovery pathology)
    {
        this.pathology = pathology;
    }

    public String diagnostic(int capteurIndex){
        if(capteurIndex <=0 || (capteurIndex %3 != 0 && capteurIndex %5 != 0)) {
            throw new IllegalArgumentException("Invalid capteur index");
        }
        StringBuilder pathologyName = new StringBuilder();

       if(pathology.discoverPathology(capteurIndex) != null) {
           pathologyName.append(pathology.discoverPathology(capteurIndex));
       }
       return pathologyName.toString();
    }
}
