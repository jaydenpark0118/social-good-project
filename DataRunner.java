import java.util.Scanner;

public class DataRunner {
  public static void main(String[] args) {

    //inputs each text file into the constructor
    UserStory bob = new UserStory("title.txt", "year.txt", "opening.txt", "ww.txt", "genre.txt", "genreaa.txt");
    /*
    *Starts Scaner
    *Different outputs depending on user input
    */
    Scanner x = new Scanner(System.in);
    System.out.println("What do you want to do? \n- See information on a random movie(1) \n- Find the genre(besides Action/Adventure) that made the most money(2) \n- See how much money a specific genre has made(3)");
    int num = x.nextInt();
    if(num == 1) {
      System.out.println("Type a number 1-1000");
      int in = x.nextInt();
      //gets a random movie from the list
      System.out.println(bob.info(in));
    } else if(num == 2) {
      System.out.println(bob.genreProf());
    } else if(num == 3) {
      System.out.println("Which genre would you like to see: \nAction(1)\nAdventure(2)\nFantasy(3)\nDrama(4)\nSci-Fi(5)\nCrime(6)\nAnimation(7)\nFamily(8)\nThriller(9)\nComedy(10)\nBiography(11)\nMystery(12)\nHorror(13)");
      int y = x.nextInt();
      System.out.println(bob.spec(y));
    } else if(num < 1) {
      System.out.println("DO A BIGGER NUMBER (1-3)");
    } else if(num > 3) {
      System.out.println("DO A SMALLER NUMBER (1-3)");
    }

    //ends scanner
    x.close();

  }
}