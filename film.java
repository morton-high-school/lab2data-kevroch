import java.util.*;
import java.io.*;

public class film{
  public static void main(String[] args) throws IOException {
      Scanner a = new Scanner(new File("film.csv"));
      String y[] = new String[100000];
      int b = 0;
      int categorycount = 0;
      int filmrating = 0;

      ArrayList<film> x = new ArrayList<film>();

      while (a.hasNextLine()){
        y = a.nextLine().split(";");

        Film bb = new Film(y[3],(y[7]));
        x.add(bb);
        b++;
      }
      for(int i = 0; i < b; i++){
        if(x.get(i).getCategory().equals("Comedy")){
          categorycount++;
          filmrating = filmrating + x.get(i).getRating();
        }
      }
      System.out.println("Comedy films have an average rating of: " + filmrating/categorycount);

  }

  private String catergory;
  private int rating;

  public void Film(String c, int r){
    catergory = c;
    rating = r;
  }
  public String getCategory(){
    return catergory;
  }
  public int getRating(){
    return rating;
  }
}
