package sample;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class PlayerInformation {
  private HashMap<String,String> player=new HashMap<>();
   private HashMap<String,String> playerName=new HashMap<>();
    private boolean usernameBol=false;
  private boolean passwordBol=false;

    public PlayerInformation() {
        player.put("yas","1");
    }

    public void addPlayer(String name, String username, String password)
    {
          playerName.put(username,name);
          player.put(username,password);
    }
    public   String check(String userName,String password)
    {
        Iterator iterator=player.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry mp=(Map.Entry)iterator.next();
            if (mp.getKey().equals(userName))
            {
               usernameBol=true;
                if (mp.getValue().equals(password))
                {
                    passwordBol=true;

                }
            }
        }
        if (usernameBol)
        {
            if (passwordBol){
                usernameBol=false;
                passwordBol=false;
                return "connected";
            }
            else {
                usernameBol=false;
                passwordBol=false;
                return "Wrong password";
            }

        }else {
            usernameBol=false;
            passwordBol=false;
        return "Username is incorrect";
        }

    }
}


