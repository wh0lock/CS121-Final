import java.util.*;
import java.io.*;

public class Music implements HasMenu {
  Listener listener = new Listener();
  ListenerList listeners = new ListenerList();
//  QuestionList questions = new QuestionList();

  public static void main(String[] args){
    new Music();
  } // end main

  public Music(){
    this.loadSampleListeners();
    this.saveListeners();
    this.loadListeners();
    this.start();
    this.saveListeners();
  } // end constructor

  public String menu(){
    Scanner input = new Scanner(System.in);
    System.out.println("  Menu  ");
    System.out.println();
    System.out.println("0) Quit");
    System.out.println("1) New listener");
    System.out.println("2) Login as existing listener");
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
          this.addListener();
        } else if (response.equals("2")){
            this.loginAsListener();
          } else {
              System.out.println("Please enter 0-2.");
            } // end if
    } // end while
  } // end start

  public void addListener(){
    Scanner input = new Scanner(System.in);
    System.out.print("Username: ");
    String userName = input.nextLine();
    System.out.print("PIN: ");
    String PIN = input.nextLine();
    listeners.add(new Listener(userName, PIN));
  } // end addListener

  public void loginAsListener(){
    Scanner input = new Scanner(System.in);
    System.out.print("Username: ");
    String userNameIn = input.nextLine();
    System.out.print("PIN: ");
    String pinIn = input.nextLine();

    Listener currentListener = null;
    for (Listener listener: listeners){
      if (listener.login(userNameIn, pinIn)){
        currentListener = listener;
      } // end if
    } // end for

    if (currentListener == null){
      System.out.println("Listener not found");
    } else {
        currentListener.start();
      } // end if
  } // end loginAsListener

  public void loadListeners(){
    try {
      FileInputStream fi = new FileInputStream("Listeners.dat");
      ObjectInputStream obIn = new ObjectInputStream(fi);
      listeners = (ListenerList)obIn.readObject();
      obIn.close();
      fi.close();
    } catch (Exception e){
      System.out.println(e.getMessage());
    } // end try
  } // end loadListeners

  public void loadSampleListeners(){
    listeners.add(new Listener("GeorgeWashington", "1111"));
    listeners.add(new Listener("YourMom", "2222"));
    listeners.add(new Listener("AbeLincoln", "3333"));
    listeners.add(new Listener("ThomJeff", "4444"));
  } // end loadSampleListeners

  public void saveListeners(){
    try {
      FileOutputStream fo = new FileOutputStream("Listeners.dat");
      ObjectOutputStream obOut = new ObjectOutputStream(fo);
      obOut.writeObject(listeners);
      obOut.close();
      fo.close();
    } catch (Exception e){
      System.out.println(e.getMessage());
    } // end try
  } // end saveListeners

} // end Music

//class QuestionList extends ArrayList<Question> {};

class ListenerList extends ArrayList<Listener> {};
