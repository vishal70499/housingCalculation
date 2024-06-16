package com.cipla.amstechconstructionadvance;

public class AmstechConstructionAdvance {

    public static void main(String[] args) {
        double length = 50;
        double breadth = 20;
        String sectorName = "A";

        boolean validationReport = Validations.getOverallValidation(length, breadth, sectorName);
        if (validationReport == true) {
            User user = new User("Vishal", "male");
            if (sectorName.equalsIgnoreCase("A")) {
                Plot plotA = new Plot();
                Estimation.print(plotA, user);
            } else if (sectorName.equalsIgnoreCase("B")) {
                Plot plotB = new Plot(length);
                Estimation.print(plotB, user);
            } else if (sectorName.equalsIgnoreCase("C")) {
                Plot plotC = new Plot(length, breadth);
                Estimation.print(plotC, user);
            } else {
                System.out.println("wrong data entered!!!!!!!");
            }
        }
    }
}
