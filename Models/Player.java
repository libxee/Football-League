package Models;

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

    public static void setPlayer(String name, String type_name,String team_name, int team_id) {
        DBlib.operateData("INSERT INTO player_info (name,type_name,team_name,team_id,total_shot) " +
                "VALUES ('"+name+"','"+ type_name+"','" +team_name+"',"+team_id+",0)");
    }
    public static  void updateShooter ( int shooter,int id){
        String sql = "UPDATE player_info SET total_shot = total_shot + "+ shooter+" WHERE id = "+id;
        DBlib.operateData(sql);
    }
    public static List<String[]> getPlayer(){
        List<String []> list =  DBlib.queryPlayer("SELECT * FROM player_info");

//        test:

//        for (int i= 0;i<list.size();i++){
//            String[] Trans = list.get(i);
//            System.out.println(Arrays.toString(list.get(i)));
//        }
        return list;
    }
    public  static void main(String [] args){
//      getPlayer();
//        getPlayer();
        setPlayer("xxx","门将","蛇皮",1);
//        updateShoxoter(1,2);
    }
}
