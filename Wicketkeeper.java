import java.util.Scanner;

public class Wicketkeeper extends Batsman{
    private int stumps;
    private int catchs;

    public Wicketkeeper() {


    }

    public Wicketkeeper(int playerid, String playername, int runs, int hundreds, int fifties, int stumps, int catchs) {
        super(playerid, playername, runs, hundreds, fifties);
        this.stumps = stumps;
        this.catchs = catchs;
    }

    public int getStumps() {
        return stumps;
    }

    public void setStumps(int stumps) {
        this.stumps = stumps;
    }

    public int getCatchs() {
        return catchs;
    }

    public void setCatchs(int catchs) {
        this.catchs = catchs;
    }

    @Override
    public String toString() {
        return super.toString()+" Wicketkeeper{" +
                "stumps=" + stumps +
                ", catchs=" + catchs +
                '}';
    }

    public void read()
    {
        Scanner sc = new Scanner(System.in);
        super.read();
        System.out.println("Enter number of stumps: ");
        stumps=sc.nextInt();
        System.out.println("Enter number of Catches: ");
        catchs=sc.nextInt();
    }
}
