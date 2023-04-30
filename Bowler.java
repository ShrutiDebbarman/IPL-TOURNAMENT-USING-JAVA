import java.util.Scanner;

public class Bowler extends  Batsman{
    private int over;
    private int wickets;

    public Bowler() {


    }

    public Bowler(int playerid, String playername, int runs, int hundreds, int fifties, int over, int wickets) {
        super(playerid, playername, runs, hundreds, fifties);
        this.over = over;
        this.wickets = wickets;
    }

    public int getOver() {
        return over;
    }

    public void setOver(int over) {
        this.over = over;
    }

    public int getWickets() {
        return wickets;
    }

    public void setWickets(int wickets) {
        this.wickets = wickets;
    }

    @Override
    public String toString() {
        return super.toString()+" Bowler{" +
                "over=" + over +
                ", wickets=" + wickets +
                '}';
    }

   public void  read()
    {
        Scanner sc = new Scanner(System.in);
        super.read();
        System.out.println("Enter Overs: ");
        over=sc.nextInt();
        System.out.println("Enter Wickets: ");
        wickets=sc.nextInt();

    }
}
