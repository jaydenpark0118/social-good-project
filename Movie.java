public class Movie {

  //Instance variables
  private String title;
  private int year;
  private int opening;
  private double ww;
  private String genre;
  private String genreaa;

  //parameterized constructor
  public Movie(String title, int year, int opening, double ww, String genre, String genreaa) {
    this.title = title;
    this.year = year;
    this.opening = opening;
    this.ww = ww;
    this.genre = genre;
    this.genreaa = genreaa;
  }

  //accessor methods
  public String getGenre() {
    return genre;
  }
  
  public String getGenreaa() {
    return genreaa;
  }

  public double getWW() {
    return ww;
  }

  //toString
  public String toString() {
    return title + "(" + year + ")" + "\nGenres: " + genreaa + "\n$" + opening + " on opening\n$" + ww + " billion internationally";
  }
}