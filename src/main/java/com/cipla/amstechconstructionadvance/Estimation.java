package com.cipla.amstechconstructionadvance;

public class Estimation {

    public static void print(Plot plot, User user) {
        System.out.println("User Name " + user.getUserName());
        System.out.println("Gender " + user.getGender());
        System.out.println("Sector Name " + plot.getSectorName());
        System.out.println("Length " + plot.getLength());
        System.out.println("Breadth " + plot.getBreadth());
        System.out.println("Total Area " + plot.getPlotArea());
        double totalPrice = Operation.getTotalPrice(plot);
        double registryCharge = Operation.getRegistryCharges(totalPrice, user);
        double greenTax = Operation.getGreenTax(totalPrice);
        double clubMembership = Operation.getClubMembership(plot);
        double societyDevelopment = Operation.getSocietyDevelopment(plot);
        double cgst = Operation.getCGST(registryCharge);
        double sgst = Operation.getSGST(registryCharge);
        double totalPriceAfterSubsidy = Operation.getSubsidyValue(totalPrice);
        double grandTotal = totalPriceAfterSubsidy + registryCharge + greenTax + clubMembership + societyDevelopment + sgst + cgst;
        System.out.println("totalPrice " + totalPrice);
        System.out.println("Registry Charge " + registryCharge);
        System.out.println("GreenTax " + greenTax);
        System.out.println("Club Membership " + clubMembership);
        System.out.println("Socity Development " + societyDevelopment);
        System.out.println("Cgst " + cgst);
        System.out.println("Sgst " + sgst);
        System.out.println("totalPriceAfterSubsidy " + totalPriceAfterSubsidy);
        System.out.println("Grand Total " + grandTotal);

    }
}
