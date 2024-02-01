import java.util.Scanner;
import java.io.*;  


public class Cereal {
    
private String name;
private String type;
private int calories;
private int protein;
private int fat;
private int sodium;
private double fiber;
private double carbohydrates;
private int potassium;
private int sugar;
private int vitamins;
private int shelf;
private double weight;
private double cups;
private double rating;

public Cereal(String inputName) {
    Scanner scan = new Scanner("Copy of Cereal.csv");
    scan.useDelimiter(",");
    while (scan.hasNext()) {
        System.out.println(scan.next());
    }

}


}