package Controlers;

import Models.DBlib;
import Models.Input;


public class Game {
    public class team {
        public int match1() {
            int a, c, e;
            int score = 0;
            int[] player = new int[11 + 1];
            c = (int) (Math.random() * (1000)) + 1;
            int time = 90;
            while (time != 0) {
                e = (int) (Math.random() * (1000));
                if (e == c) {
                    a = (int) (Math.random() * (11));
                    player[a]++;
                    score++;
                }
                time = time - 1;
            }
            for (int i : player) {
                String sql = "UPDATE player_info SET total_shot = total_shot + " + player[i] + " WHERE id = " + i;
                DBlib.operateData(sql);
            }
            return score;
        }
    }

    public void match2() {
        team a = new team();
        int z = 1;
//        for (int z = 2; z <= 4; z++) {
            for (int i = 1; i <= 18; i++)
                for (int j = i + 1; j <= 18 - i; j++) {
                    int team1 = 0;
                    int team2 = 0;
                    int score1 = 0, score2 = 0;
                    score1 = a.match1();
                    score2 = a.match1();
                    if (score1 > score2) {
                        team1 += 3;
                        team2 += 0;
                    } else if (score1 == score2) {
                        team1 += 1;
                        team2 += 1;
                    } else {
                        team1 += 0;
                        team2 += 3;
                    }

                    String sql = "UPDATE team_info SET integral = integral +" + team1 + " WHERE team_id = " + i + " AND league='联赛" + z + "'";
                    DBlib.operateData(sql);
                    String sql1 = "UPDATE team_info SET integral = integral +" + team2 + " WHERE team_id =" + j + " AND league='联赛" + z + "'";
                    DBlib.operateData(sql1);
                }
        }
//        DBlib.queryTeam("select * from team_info order by integral desc ");
//    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Input i = new Input();
        i.input();
        Game g = new Game();
        g.match2();
    }
}
