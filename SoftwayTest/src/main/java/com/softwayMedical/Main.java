package com.softwayMedical;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        DiagnosticCabine diagnosticCabine1 = new DiagnosticCabine(new TraumatologiePathologie());
        System.out.println("33 indicate " + diagnosticCabine1.diagnostic(33));

        DiagnosticCabine diagnosticCabine2 = new DiagnosticCabine(new CardiologiePathologie());
        System.out.println("55 indicate " + diagnosticCabine2.diagnostic(55));

        DiagnosticCabine diagnosticCabine3 = new DiagnosticCabine(new MultiplePathologie());
        System.out.println("15 indicate " + diagnosticCabine3.diagnostic(15));
    }
}