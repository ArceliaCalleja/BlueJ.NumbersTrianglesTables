
public class NumberUtilities {
    public static String getRange(int stop) {
        String answer = secondSolution(stop);
        return answer;
    }

    public static String secondSolution(int stop) {
        String result = "";
        int i=0;
        for(i=0; i< stop; i++){
            result= result + i;   

        }
        return result;

    }

    public static String firstSolution(int stop) {
        String result = "";
        int theChangingValue = 0;
        while(theChangingValue < stop) {
            result = result + theChangingValue;// keep each changing value
            theChangingValue++;
        }

        return result;
    }

    public static String getRange(int start, int stop) {
        String result = "";
        int i=start;
        for(i=start; i< stop; i++){
            result= result + i;

        }
        return result;
    }

    public static String getRange(int start, int stop, int step) {
        String result = "";
        for(int i=start; i<stop; i= i+step){
            result= result + i; 

        }
        return result;
    }

    public static String getEvenNumbers(int start, int stop) {
        String result = "";
        
        if(start % 2 != 0)
        {
        start++;
    }
        
        if(stop % 2 != 0){
        stop++;
    }        
        for(int i=start; i<stop; i= i+2){
            result= result + i; 

        }
        
        return result;

    }

    public static String getOddNumbers(int start, int stop) {
        String result ="";
        for(int i=start; i<stop; i++){
            if(i%2 !=0){
                result= result + i;
            }
        }

        
        return result;
    }

    public static String getExponentiations(int start, int stop, int exponent) {
        String result = "";
        for(int i=start; i<=stop; i++){
            int total=(int)Math.pow(i,exponent);
            result+= total;

        }
        return result;
    }
}
