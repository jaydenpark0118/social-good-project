import java.util.Scanner;

public class UserStory {
  
  //contains all of the Movie objects
  private Movie[] movieData;
  
  //parameterized constructor
  public UserStory(String title, String year, String opening, String ww, String genre, String genreaa) {
    movieData = toArray(title, year, opening, ww, genre, genreaa);
  }
  
  public Movie[] toArray(String title, String year, String opening, String ww, String genre, String genreaa) {
    //Array for each text file
    String[] titleData = FileReader.toStringArray(title);
    int[] yearData = FileReader.toIntArray(year);
    int[] openingData = FileReader.toIntArray(opening);
    double[] wwData = FileReader.toDoubleArray(ww);
    String[] genreData = FileReader.toStringArray(genre);
    String[] genreaaData = FileReader.toStringArray(genreaa);

    Movie[] temp = new Movie[titleData.length];

    //Creates a new instance of the Movie object each iteration
    for(int i = 0; i < temp.length; i++) {
      temp[i] = new Movie(titleData[i], yearData[i], openingData[i], wwData[i], genreData[i], genreaaData[i]);
    }

    return temp;
  }

  //returns all movie information from the Movie class
  public String info(int index) {
    return movieData[index-1].toString();
  }

  /*
  Gets the index of the first comma
  Gets the substring of the first word the genre string
  If there is no comma, it returns the entire string
  */
  public String first(String genreTemp) {
    int y = genreTemp.length();
    int commaIndex = genreTemp.indexOf(",");
    if(commaIndex == -1) {
      commaIndex = y;
    }
      
    return genreTemp.substring(0, commaIndex);
  }

  /*
  Counts the amount of times each genre was in the top 1000
  */
  public String genreProf() {
    String[] temp = {"Fantasy", "Drama", "Sci-Fi", "Crime", "Animation", "Family", "Thriller", "Comedy", "Biography", "Mystery", "Horror"};
    int[] count = new int[11];
    for(Movie i : movieData) {
      
      String t = i.getGenre();
      String s = first(t);
      //Counts the times a genre appeared
      for(int j = 0; j < temp.length; j++) {
        if(s.equals(temp[j])) {
          count[j]+=1;
        }
      }
    }
    
    String result = "";
    for(int i = 0; i < count.length; i++) {
      result += temp[i] + " appeared: " + count[i] + " times \n";
      
    }
      return result;
  }

  /*
  Gets the amount of money each genre made
  Most are action or adventure so some come out to $0.0
  */
  public String spec(int index) {
    String[] temp = {"Action", "Adventure", "Fantasy", "Drama", "Sci-Fi", "Crime", "Animation", "Family", "Thriller", "Comedy", "Biography", "Mystery", "Horror"};
    double amt = 0;
    //chosen word
    String e = temp[index-1];
    for(Movie i : movieData) {
      //first word of genre
      String f = first(i.getGenreaa());
      if(e.equals(f)) {
        amt += i.getWW();
      }
    }
    
    if(amt < 50.0) {
    return "The genre: " + e + "(as a main genre), has made $" + amt + " billion\n(if the number seems low, the genre likely is not a main genre but a secondary one. It may have been overshadowed by Action or Adventure) :)";
    } else {
    return "The genre: " + e + "(as a main genre), has made $" + amt + " billion";
    }
  }
}