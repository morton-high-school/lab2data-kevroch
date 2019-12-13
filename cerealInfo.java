import java.util.*;
import java.io.*;

public abstract class cerealInfo{
  private double rating;
  private int shelf;
  private String cerealName;
  public static String csvFile = "C:/Users/wangke/Desktop/Examples/lab2data-kevroch/Cereal.csv";

  public static int column = 0;



    public static int columns(){
      try{
        Scanner cerealScan = new Scanner(new FileReader(csvFile));
      while(cerealScan.hasNext()){
        column++;
      }

  }catch(Exception e){
      System.out.println(e);
    }
    return column;
  }
}
