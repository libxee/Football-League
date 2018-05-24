package Models;

import java.util.List;

public class Team {

    public static void setTeam(String name, String league) {
        String sql = "INSERT INTO team_info (team_name,league) VALUES" +
                " ('" + name + "','" + league + "')";
        DBlib.operateData(sql);
    }

    public static void updateTeam(int integral, int id) {
        String sql = "UPDATE player_info SET total_shot = total_shot + " + integral + " WHERE id = " + id;
        DBlib.operateData(sql);
    }

    public static List<String[]> getTeam() {
        List<String[]> list = DBlib.queryTeam("SELECT * FROM team_info ORDER BY integral DESC");
        return list;
    }

    //    test
    public static void main(String[] args) {
    }
}
