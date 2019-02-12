
public class TableUtilities {
    public static String getSmallMultiplicationTable(int tableSize) {
        String table = "";
        int with = 0;
        int height = 0;

        for(with = 1; with <= tableSize; with++){
            for(height = 1; height <= tableSize; height++){
                table = table + String.format("%3d",with*height) + " |";
            }
            table += "\n";
        }
        return table;
    }

    public static String getLargeMultiplicationTable(int size) {
       
        return getSmallMultiplicationTable(size);
    }

    public static String getMultiplicationTable(int size) {
        return getSmallMultiplicationTable(size);
    }
}
