import java.util.*;
import java.io.*;

public class cereal{
  public static void main(String[] args){

  }
  public class cerealInfo{
    private double rating;
    private int shelf;
    private String cerealName;
    String csvFile = "C:/Users/wangke/Desktop/Examples/lab2data-kevroch/Cereal.csv";

    int column = 0;
    try{
    Scanner cerealScan = new Scanner(new FileReader(csvFile));


    public void columns(){
        while(cerealScan.hasNext()){
          column++;


        }
      }
      catch(Exception e){
        System.out.println(e);
      }
    return column;
    }
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
