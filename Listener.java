import java.util.*;
import java.io.*;

public class Listener extends User implements Serializable {
  static final long serialVersionUID = 1L;

  public static void main(String[] args){
    Listener li = new Listener();
    if (li.login()){
      System.out.println("Login was successful!");
      li.start();
    } // end if
  } // end main

  public Listener(){
    this.userName = "GeorgeWashington";
    this.PIN = "1111";
  } // end constructor

  public Listener(String userName, String PIN){
    this.userName = userName;
    this.PIN = PIN;
  } // end param constructor

  public String menu(){
    Scanner input = new Scanner(System.in);
    System.out.println("0) Quit");
    System.out.println("1) Take Personality Test");
    System.out.println();
    System.out.print("Please enter 0 or 1: ");
    String response = input.nextLine();
    return response;
  } // end menu

  public void start(){
    boolean keepGoing = true;
    while(keepGoing){
      String response = menu();
      if (response.equals("0")){
        keepGoing = false;
      } else if (response.equals("1")){
        System.out.println(getResults());
      } else {
        System.out.println("Invalid entry.");
      } // end if
    } // end while
  } // end start

  public int personalityTest(){
    Scanner input = new Scanner(System.in);
    int score = 0;

    System.out.println("Personality Test");
    System.out.println();  
    System.out.print("Do you prefer red (A) or blue (B)? ");
    String oneResponse = input.nextLine().toUpperCase();
    if (oneResponse.equals("A")){
      score += 2;
    } else if (oneResponse.equals("B")){
      score += 3;
    } else {
      System.out.println("Please answer with A or B.");
    } // end if

    System.out.print("Do you like apples (A) or oranges (B)? ");
    String twoResponse = input.nextLine().toUpperCase();
    if (twoResponse.equals("A")){
      score += 2;
    } else if (twoResponse.equals("B")){
      score += 3;
    } else {
      System.out.println("Please answer with A or B.");
    } // end if
    
    System.out.print("Are you more technology (A) or creativity (B) oriented? ");
    String threeResponse = input.nextLine().toUpperCase();
    if (threeResponse.equals("A")){
      score += 2;
    } else if (threeResponse.equals("B")){
      score += 3;
    } else {
      System.out.println("Please answer with A or B.");
    } // end if
    
    System.out.print("Do you wear silver (A) or gold (B)? ");
    String fourResponse = input.nextLine().toUpperCase();
    if (fourResponse.equals("A")){
      score += 2;
    } else if (fourResponse.equals("B")){
      score += 3;
    } else {
      System.out.println("Please answer with A or B.");
    } // end if

    System.out.print("Do you like cats (A) or dogs (B) more? ");
    String fiveResponse = input.nextLine().toUpperCase();
    if (fiveResponse.equals("A")){
      score += 2;
      System.out.println("Calculating results...");
      System.out.println();
    } else if (fiveResponse.equals("B")){
      score += 3;
      System.out.println("Calculating results...");
      System.out.println();
    } else {
      System.out.println("Please answer with A or B.");
    } // end if
    return score;
  } // end personalityTest

  public String getResults(){
    int score = personalityTest();
    String results;
    if ((score % 2) == 0) {
      System.out.println();
      results = ("By my calculations, you might really enjoy Coldplay.");
    } else {
      System.out.println();
      results = ("By my calculations, you might really enjoy My Chemical Romance.");
    } // end if
    return results;
  } // end getResults
} // end Listener
