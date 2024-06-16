package com.cipla.amstechconstructionadvance;

public class Validations {

    private static boolean validateSectorALength(double length) {
        if (length >= Limitations.minimumLengthSectorA && length <= Limitations.maximumLengthSectorA) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean validateSectorBLength(double length) {
        if (length >= Limitations.minimumLengthSectorB && length <= Limitations.maximumLengthSectorB) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean validateSectorCLength(double length) {
        if (length >= Limitations.minimumLengthSectorC && length <= Limitations.maximumLengthSectorC) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean validateSectorABreadth(double breadth) {
        if (breadth >= Limitations.minimumBreadthSectorA && breadth <= Limitations.maximumBreadthSectorA) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean validateSectorBBreadth(double breadth) {
        if (breadth >= Limitations.minimumBreadthSectorB && breadth <= Limitations.maximumBreadthSectorB) {
            return true;
        } else {
            return false;
        }
    }

    private static boolean validateSectorCBreadth(double breadth) {
        if (breadth >= Limitations.minimumBreadthSectorC && breadth <= Limitations.maximumBreadthSectorC) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean getOverallValidation(double length, double breadth, String sectorName) {

        if (sectorName.equalsIgnoreCase("A")) {
            if (validateSectorALength(length) == true && validateSectorABreadth(breadth) == true) {
                return true;
            } else {
                return false;
            }
        } else if (sectorName.equalsIgnoreCase("B")) {
            if (validateSectorBLength(length) == true && validateSectorBBreadth(breadth) == true) {
                return true;
            } else {
                return false;
            }
        } else if (sectorName.equalsIgnoreCase("C")) {
            if (validateSectorCLength(length) == true && validateSectorCBreadth(breadth) == true) {
                return true;
            } else {
                return false;
            }
        } else {
            return false;
        }

    }
}
