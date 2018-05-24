package Models;
public class Type {
    public String typename(int b) {
        b = b % 11;
        switch (b) {
            case 1:
                return "门将";
            case 2:
                return "清道夫";
            case 3:
                return "中后卫";
            case 4:
                return "边后卫";
            case 5:
                return "后腰";
            case 6:
                return "边前卫";
            case 7:
                return "前卫";
            case 8:
                return "前腰";
            case 9:
                return "边峰";
            case 10:
                return "二前锋";
            case 11:
                return "中锋";
        }
        return null;

    }
}

