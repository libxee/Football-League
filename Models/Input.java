package Models;

public class Input {
    public void input() {
        for(int i=1;i<=4;i++)
            for(int j=1;j<=18;j++){
                Team.setTeam("球队"+j,"联赛"+i);
            }
        Type t=new Type();
        for(int j=1;j<=18;j++){
            for(int i=1;i<=11;i++) {
                Player.setPlayer("球员"+i,t.typename(i), "球队"+j, i);
            }
        }

    }
}