import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    Tournament tournament = new Tournament();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Tournament name and year: ");
        tournament.setTournamentname(sc.next());
        tournament.setYear(sc.nextInt());

        int choice;


        do{
            System.out.println(" 1>> Add team 2>>Display 3>> exit");
            choice = sc.nextInt();
            switch (choice)
            {
                case 1: tournament.addteam();
                break;
                case 2: tournament.displaytournament();
                break;
                case 3: break;
            }
        }while(choice != 3);

    }


}