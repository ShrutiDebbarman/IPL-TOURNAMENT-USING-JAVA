import java.util.Scanner;

abstract public class player {
    private int playerid;
    private String playername;

    public player() {


    }

    public player(int playerid, String playername) {

        this.playerid = playerid;
        this.playername = playername;
    }

    public int getPlayerid() {
        return playerid;
    }

    public void setPlayerid(int playerid) {
        this.playerid = playerid;
    }

    public String getPlayername() {
        return playername;
    }

    public void setPlayername(String playername) {
        this.playername = playername;
    }

    @Override
    public String toString() {
        return "player{" +
                "playerid=" + playerid +
                ", playername='" + playername + '\'' +
                '}';
    }

    public void read()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Player id: ");
        playerid = sc.nextInt();
        System.out.println("Enter Player name: ");
        playername=sc.next();


    }
}
