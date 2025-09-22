package ua.util;

public class Utils {
    public static boolean checkString(String string){
        return ValidationHelper.isValidString(string);
    }

    public static boolean checkNamedData(String namedData){
        return ValidationHelper.isValidNamedData(namedData);
    }

    public static boolean checkNumber(int number){
        return ValidationHelper.isValidNumber(number);
    }

    public static boolean checkLicensePlate(String licensePlate){
        return ValidationHelper.isValidLicensePlate(licensePlate);
    }

    public static boolean checkDistance(double distance){
        return ValidationHelper.isValidDistance(distance);
    }

    public static boolean checkDate(String date){
        return ValidationHelper.isValidDate(date);
    }
}
