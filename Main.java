import java.io.*;
import java.util.*;


public class Main {
        
        public static void main(String[] args) {
        ArrayList<Cereal> cereals = new ArrayList<Cereal>();
        File cerealCSV = new File("C:\\Users\\P5\\Desktop\\3.7.7\\DataLab_Code\\PLTW_3.7.7\\Copy of Cereal.csv");
        try
        {
            Scanner scan = new Scanner(cerealCSV);
            while (scan.hasNext()) {
                cereals.add(new Cereal(scan.nextLine()));
            }
        }
        catch (FileNotFoundException ff)
        {
            System.out.println("Exception " + ff.toString());
        }

        
        
    }
}
