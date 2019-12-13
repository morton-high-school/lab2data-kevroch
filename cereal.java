import java.util.*;
import java.io.*;

public class cereal extends cerealInfo{
  public static void main(String[] args){
    System.out.println(cerealInfo.columns());
  }
}



/*public class cerealInfo{
  private double rating;
  private int shelf;
  private String cerealName;
  String csvFile = "C:/Users/wangke/Desktop/Examples/lab2data-kevroch/Cereal.csv";

  int column = 0;
  Scanner cerealScan = new Scanner(new filereader(csvFile));

  public int columns(int column){
    while(cerealScan.hasNext()){
      column++;
    }
  }



}*/
