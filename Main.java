import java.io.*;
import java.util.*;


public class Main {
        public static void main(String[] args) {
        File cerealCSV = new File("/workspaces/PLTW_3.7.7/Copy of Cereal.csv");
        try
{
    Scanner scan = new Scanner(cerealCSV);
}
catch (FileNotFoundException ff)
{
    System.out.println("Exception " + ff.toString());
}

        
        scan.useDelimiter(",");
        while (scan.hasNext()) {
        System.out.println(scan.next());
    }
    }
}
