package Models;

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

}
