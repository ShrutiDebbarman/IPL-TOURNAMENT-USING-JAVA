import java.util.Scanner;

public class Tournament {
    private String Tournamentname;
    private int year;

    private Team teams[];
    int teamcounter;

    public Tournament() {
        teams = new Team[25];
        teamcounter = 0;
    }

    public Tournament(String tournamentname, int year) {
        Tournamentname = tournamentname;
        this.year = year;
        teams = new Team[25];
        teamcounter = 0;
    }

    public String getTournamentname() {
        return Tournamentname;
    }

    public void setTournamentname(String tournamentname) {
        Tournamentname = tournamentname;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void addteam() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Team Details: ");
        teams[teamcounter] = new Team();
        System.out.println("Enter Team name: ");
        teams[teamcounter].setTeamname(sc.next());
        System.out.println("Enter Ceo name:  ");
        teams[teamcounter].setCeo(sc.next());

        System.out.println("Enter num of players to be added: ");
        int nop = sc.nextInt();

        for(int i = 0; i < nop; ++i) {
            teams[teamcounter].addplayer();
        }

        ++teamcounter;
        }
  // }

        public void displaytournament()
        {
            System.out.println("Tournament name : " + getTournamentname());
            System.out.println("Year: " + year);
            System.out.println("Teams are: ");
            for (int i = 0; i < teamcounter; i++)
            {
                teams[i].display();
            }
        }
}
