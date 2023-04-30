import java.util.Scanner;

public class Batsman extends player {
    private int runs;
    private int hundreds;
    private int fifties;

    public Batsman() {


    }

    public Batsman(int playerid, String playername, int runs, int hundreds, int fifties) {
        super(playerid, playername);
        this.runs = runs;
        this.hundreds = hundreds;
        this.fifties = fifties;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public int getHundreds() {
        return hundreds;
    }

    public void setHundreds(int hundreds) {
        this.hundreds = hundreds;
    }

    public int getFifties() {
        return fifties;
    }

    public void setFifties(int fifties) {
        this.fifties = fifties;
    }

    @Override
    public String toString() {
        return super.toString()+" Batsman{" +
                "runs=" + runs +
                ", hundreds=" + hundreds +
                ", fifties=" + fifties +
                '}';
    }

    public void read()
    {
        Scanner sc = new Scanner(System.in);
        super.read();
        System.out.println("Enter Runs: ");
        runs=sc.nextInt();
        System.out.println("Enter hundreds: ");
        hundreds=sc.nextInt();
        System.out.println("Enter fifties: ");
        fifties=sc.nextInt();
    }
}
