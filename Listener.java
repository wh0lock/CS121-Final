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
    System.out.println("2) View Previous Results");
    System.out.println();
    System.out.print("Please enter 0-2: ");
    String response = input.nextLine();
    return response;
  } // end menu

  public void start(){
    boolean keepGoing = true;
    String response;

    while(keepGoing){
      response = menu();
      if (response.equals("0")){
        keepGoing = false;
      } else if (response.equals("1")){
          System.out.println("Personality Test");
          //call personality test
        } else if (response.equals("2")){
            System.out.println("Previous Results");
            //call previous results
          } // end if
    } // end while
  } // end start

} // end Listener
