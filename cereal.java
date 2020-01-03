import java.util.*;
import java.io.*;

public class cereal{
    public static void main(String[] args) throws IOException {
      Scanner x = new Scanner(new File("Cereal.csv"));
      String y[] = new String[10000];
      String z = x.nextLine();
      int a = 0;
      double r1 = 0;
      int c1 = 0;
      double firstAverage = 0;
      double r2 = 0;
      int c2 = 0;
      double secondAverage = 0;
      double r3 =0;
      int c3 = 0;
      double thirdAverage = 0;


      ArrayList<cereal> b = new ArrayList<cereal>();


      while (x.hasNextLine()){
        y = x.nextLine().split(",");

        Cereal bb = new Cereal(Integer.parseInt(y[11]), Double.parseDouble(y[14]));
        b.add(bb);
        a++;
      }

      for (int i = 0; i < a; i++){
        if(b.get(i).getShelf() == 3){
          thirdAverage = thirdAverage + b.get(i).getRating();
          c3++;
        }
        if (b.get(i).getShelf() == 2){
          secondAverage = secondAverage+b.get(i).getRating();
          c2++;
        }
        if(b.get(i).getShelf() == 1){
          firstAverage = firstAverage+b.get(i).getRating();
          c1++;
        }
      }
      firstAverage = r1/c1;
      System.out.println("The average rating for the first shelf is: " + firstAverage);
      secondAverage = r2/c2;
      System.out.println("The average rating for the second shelf is: " + secondAverage);
      thirdAverage = r3/c3;
      System.out.println("The average rating for the third shelf is: " + thirdAverage);


    }

    private int shelf;
    private double rating;


    public void Cereal(int s, double r){
      shelf = s;
      rating = r;
    }
    public int getShelf(){
      return shelf;
    }
    public double getRating(){
      return rating;
    }
}
