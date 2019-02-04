package applayer;

public class User {
  public boolean isValidUserCridentials(String sUserName, String sUserPassword){
    if(sUserName.equals("Amit") && sUserPassword.equals("123")){
      return true;
    }
    else
      return false;
  }
}
