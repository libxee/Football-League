package Models;

import com.sun.xml.internal.ws.api.server.SDDocument;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Player {
    private String player_id;
    private String Player_name;
    public String getRollNo() {
        return player_id;
    }
    public void setRollNo(String rollNo) {
        this.player_id = rollNo;
    }
    public String getName() {
        return Player_name;
    }
    public void setName(String name) {
        this.Player_name = name;
    }

    public static void setPlayer() {

        DBlib.operateData("INSERT INTO player_info VALUES (0,'f','f','fff',10)");
    }
    public static List<String[]> getPlayer(){
        List<String []> list =  DBlib.queryPlayer("SELECT * FROM player_info");
        for (int i= 0;i<list.size();i++){
            String[] Trans = list.get(i);
            System.out.println(Arrays.toString(list.get(i)));
        }
        return list;
    }
    public  static void main(String [] args){
//      getPlayer();
//        getPlayer();
        setPlayer();
    }
}
