public class HellaLoops01 {

    public static String getEvenNumbers(int start, int stop) {
        String newString = "";
        for (int i = start; i < stop; i++){
            if (i%2==0){
                newString+=i;
            }
        }
        return newString;
    }

    public static String getOddNumbers(int start, int stop) {
        String newString = "";
        for (int i = start; i < stop; i++){
            if (i%2!=0){
                newString+=i;
            }
        }
        return newString;
    }


    public static String getSquareNumbers(int start, int stop, int step) {
        String newString = "";
        for (int i = start; i < stop; i+=step){
            newString += i*i;
        }
        return newString;
    }

    public static String getRange(int stop) {
        String newString = "";
        for (int i = 0; i < stop; i++){
            newString += i;
        }
        return newString;
    }

    public static String getRange(int start, int stop) {
        String newString = "";
        for (int i = start; i < stop; i++){
            newString += i;
        }
        return newString;
    }


    public static String getRange(int start, int stop, int step) {
        String newString = "";
        for (int i = start; i < stop; i+=step){
            newString += i;
        }
        return newString;
    }


    public static String getExponentiations(int start, int stop, int step, int exponent) {
        String newString = "";
        for (int i = start; i < stop; i+=step){
            newString += (int)Math.pow(i, exponent);
        }
        return newString;
    }
}
