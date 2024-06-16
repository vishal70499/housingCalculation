package com.cipla.amstechconstructionadvance;

public class Operation {

    public static double getTotalPrice(Plot plot) {
        if (plot.getSectorName().equalsIgnoreCase("A")) {
            return plot.getPlotArea() * Rate.sectorARate;
        } else if (plot.getSectorName().equalsIgnoreCase("B")) {
            return plot.getPlotArea() * Rate.sectorBRate;
        } else if (plot.getSectorName().equalsIgnoreCase("C")) {
            return plot.getPlotArea() * Rate.sectorCRate;
        } else {
            return -1;
        }
    }

    public static double getRegistryCharges(double price, User user) {
        if (user.getGender().equalsIgnoreCase("male")) {
            return ((price * Rate.registryRateMalePercentage) / 100);
        } else if (user.getGender().equalsIgnoreCase("female")) {
            return ((price * Rate.registryRateFemalePercentage) / 100);
        } else {
            return -1;
        }
    }

    public static double getGreenTax(double price) {
        return ((price * Rate.greenTaxPercentage) / 100);
    }

    public static double getSGST(double price) {
        return ((price * Rate.sgstPercentage) / 100);
    }

    public static double getCGST(double price) {
        return ((price * Rate.cgstPercentage) / 100);
    }

    public static double getSocietyDevelopment(Plot plot) {
        if (plot.getSectorName().equalsIgnoreCase("A")) {
            return Rate.societyDevelopmentSectorA;
        } else if (plot.getSectorName().equalsIgnoreCase("B")) {
            return Rate.societyDevelopmentSectorB;
        } else if (plot.getSectorName().equalsIgnoreCase("C")) {
            return Rate.societyDevelopmentSectorC;
        } else {
            return -1;
        }

    }

    public static double getClubMembership(Plot plot) {
        if (plot.getSectorName().equalsIgnoreCase("A")) {
            return Rate.clubMembershipSectorA * 3;
        } else if (plot.getSectorName().equalsIgnoreCase("B")) {
            return Rate.clubMembershipSectorB * 3;
        } else if (plot.getSectorName().equalsIgnoreCase("C")) {
            return Rate.clubMembershipSectorC * 3;
        } else {
            return -1;
        }
    }

    public static double getSubsidyValue(double totalPrice) {
        if (totalPrice <= Limitations.maximumEligibleTotalforSubsidy) {
            return totalPrice - Rate.subsidy;
        } else {
            return totalPrice;
        }
    }
}
