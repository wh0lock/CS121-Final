import java.util.*;
import java.io.*;

abstract class User implements HasMenu, Serializable{
  String userName = "";
  String PIN = "";

  public String getUserName(){
    return this.userName;
  } // end getUserName

  public String getPIN(){
    return this.PIN;
  } // end getPIN

  public void setUserName(String userName){
    this.userName = userName;
  } // end setUserName

  public void setPIN(String PIN){
    if (PIN.matches("^\\d{4}$")){
      this.PIN = PIN;
    } else {
        System.out.println("PIN must be 4 numeric digits...");
        System.out.println("Setting PIN to default (0000)");
        this.PIN = "0000";
      } // end if
  } // end setPIN

  public boolean login(){
    Scanner input = new Scanner(System.in);
    boolean result = false;
    System.out.print("Username: ");
    String userNameIn = input.nextLine();
    if (userNameIn.equals(this.userName)){
      System.out.print("PIN: ");
      String pinIn = input.nextLine();

      if (pinIn.equals(this.PIN)){
        result = true;
      } else {
          System.out.println("Incorrect PIN");
        } // end if
      } else {
          System.out.println("Incorrect Username");
      } // end if
    return result;
  } // end login

  public boolean login(String userNameIn, String pinIn){
    boolean result = false;
    if (userNameIn.equals(this.userName)){
      if (pinIn.equals(this.PIN)){
        result = true;
      } // end if
    } // end if
    return result;
  } // end login
} // end User
