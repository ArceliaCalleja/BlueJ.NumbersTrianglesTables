 

public class TriangleUtilities {

    public static String getRow(int numberOfStars) {
        String row = "";
        for (int i=0; i < numberOfStars; i++)
        row= row + '*';
        return row;
    }
    
    public static String getTriangle(int numberOfRows) {
        String triangle = "";
        //For Each row
        for(int i=1; i <= numberOfRows; i++){
            
            //Print asterisk in the row
            for(int j=0; j < i; j++){
                triangle += "*";
            }
            triangle+="\n";
            
    }
        return triangle;
    }


    public static String getSmallTriangle() {
        String triangle = "";
        for(int i=1; i <= 4; i++){
        for(int j=0; j < i; j++){
         triangle += "*";
        }
        triangle+="\n";
    }
        return triangle;
    }

    public static String getLargeTriangle() {
        String triangle = "";
        for(int i=1; i <= 9; i++){
        for(int j=0; j < i; j++){
         triangle += "*";
        }
        triangle+="\n";
    }
        return triangle;
        
    }
}
