package Controlers;
import Models.DBlib;
import Models.Input;

public class Playoffs {
    static int[] offteam = new int[8];
    static int[] off2team = new int[4];//晋级队

    // 输入前八名
    public void play() {
        for (int j = 1; j <= 4; j++) {
            for (int i = 0; i < 4; i++) {//第一轮
                beginplayoff(offteam[i], offteam[8 - i], i, j);
            }
            for (int i = 0; i < 2; i++) {//四强
                beginplayoff(off2team[i], off2team[4 - i], i, j);
            }
            beginplayoff(off2team[0], off2team[1], 0, j);//冠亚}
            //插入数据
        }
    }
    public int win(int scoreA, int scoreB) {
        if (scoreA >= scoreB) return 1;
        else return 0;
    }

    public void beginplayoff(int teamA, int teamB, int i, int j) {
        int scoreA, scoreB;
        GamePlayoffs.team team1 = new GamePlayoffs().new team();
        scoreA = team1.match1();
        scoreB = team1.match1();
        if (win(scoreA, scoreB) == 1) {
            String sql = "UPDATE team_info SET integral = integral + " + 1 + " WHERE team_name=球队" + teamA + "and league=联赛" + j;
            DBlib.operateData(sql);
            off2team[i] = teamA;
        }//A队加一分
        else {
            String sql = "UPDATE team_info SET integral = integral + " + 1 + " WHERE team_name=球队" + teamB + "and league=联赛" + j;
            DBlib.operateData(sql);
            off2team[i] = teamB;//B队加一份
        }
    }
}