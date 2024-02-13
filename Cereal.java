import java.util.Arrays;
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
private int sugar;
private int potassium;
private int vitamins;
private int shelf;
private double weight;
private double cups;
private double rating;

private Object[] attributes = {name, type, calories, protein, fat, sodium, fiber, carbohydrates, 
potassium, sugar, vitamins, shelf, weight, cups, rating};

public Cereal(String fullInput) {
    Scanner scan = new Scanner(fullInput);
    scan.useDelimiter(",");
    for (int i = 0; i < attributes.length; i++){
        attributes[i] = scan.next();
    }
    System.out.println(Arrays.toString(attributes));
}


}