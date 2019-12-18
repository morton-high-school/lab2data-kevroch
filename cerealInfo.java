import java.util.*;
import java.io.*;
import java.io.FileReader.*;

public class cerealInfo{
  private double rating;
  private int shelf;
  private String cerealName;
  String csvFile = "C:/Users/wangke/Desktop/Examples/lab2data-kevroch/Cereal.csv";

  private int column = 0;

  //Scanner cerealScan = new Scanner(new FileReader(csvFile));

  public int Column(){
    try{
      Scanner cerealScan = new Scanner(new FileReader(csvFile));
      while(cerealScan.hasNextLine()){
        cerealScan.next();
        column++;
        }
    }catch(Exception e){
      System.out.println(e);
    }
      return column;
    }
    public void shelfName(){
      try{
        Scanner nameScan = new Scanner(new FileReader(csvFile));
        nameScan.nextLine();
        while(nameScan.hasNextLine()){
          String temp[] = nameScan.nextLine().split(",");
          System.out.println(temp[0]);
        }
      }catch(Exception e){
          System.out.println(e);
        }
      }
    }
