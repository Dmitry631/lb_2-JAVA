package ua.util;

class ValidationHelper {
    static boolean isValidString(String string){
        if(string.isEmpty() || string == null)
            return false;
        return true;
    }

//    RegEx[range letters]{repeat count}
    static boolean isValidLicensePlate(String licensePlate){
        if(isValidString(licensePlate) && licensePlate.matches("[A-Z]{2}[0-9]{4}[A-Z]{2}"))
            return true;
        return false;
    }

    static boolean isValidNamedData(String name){
        if(isValidString(name) && name.matches("[A-Z][a-z]+"))
            return true;
        return false;
    }

    static boolean isValidNumber(int number){
        if(number < 0)
            return false;
        return true;
    }

    static boolean isValidDistance(double distance){
        if(distance < 0)
            return false;
        return true;
    }

    static boolean isValidDate(String date){
        if(isValidString(date) && date.matches("[0-9]+\\.[0-9]+\\.[0-9]+"))
            return true;
        return false;
    }
}
