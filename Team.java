import java.util.Scanner;

public class Team {
    private String Teamname;
    private String Ceo;

    player[] players;
    int playercounter;
    public Team() {
        players = new player[20];
        playercounter = 0;

    }

    public String getCeo() {
        return Ceo;
    }

    public void setCeo(String ceo) {
        Ceo = ceo;
    }

    public Team(String teamname, String ceo) {

        this.Teamname = teamname;
        this.Ceo = ceo;
        players = new player[20];
        playercounter = 0;
    }

    public String getTeamname() {
        return Teamname;
    }

    public void setTeamname(String teamname) {
        Teamname = teamname;
    }
    public void addplayer()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("1>> FOR BATSMAN 2>> FOR BOWLER 3>> FOR WICKETKEEPER ");
        System.out.println("Enter your choice of player");
        //sc.reset();
        int choice = sc.nextInt();
        if(playercounter>20)
            System.out.println("max number of player exceeded!!");
        else {

            switch (choice) {
                case 1:
                    players[playercounter] = new Batsman();
                    players[playercounter].read();
                    break;
                case 2:
                    players[playercounter] = new Bowler();
                    players[playercounter].read();
                    break;
                case 3:
                    players[playercounter] = new Wicketkeeper();
                    players[playercounter].read();
                    break;
            }
            playercounter++;

            }
        }

        public void display()
        {
            System.out.println("Teamname : "+getTeamname());
            System.out.println(("CEO : "+Ceo));

            for(int i=0;i<playercounter;i++)
            {
                System.out.println(players[i].toString());
            }

        }


    }

